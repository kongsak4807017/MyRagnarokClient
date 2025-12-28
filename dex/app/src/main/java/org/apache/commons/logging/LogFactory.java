package org.apache.commons.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    static Class class$java$lang$Thread = null;
    static Class class$org$apache$commons$logging$LogFactory = null;
    private static String diagnosticPrefix = null;
    protected static Hashtable factories = null;
    private static ClassLoader thisClassLoader = null;
    private static PrintStream diagnosticsStream = null;
    protected static LogFactory nullClassLoaderFactory = null;

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls);

    public abstract Log getInstance(String str);

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    static {
        Class clsClass$;
        Class clsClass$2;
        factories = null;
        if (class$org$apache$commons$logging$LogFactory == null) {
            clsClass$ = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$;
        } else {
            clsClass$ = class$org$apache$commons$logging$LogFactory;
        }
        thisClassLoader = getClassLoader(clsClass$);
        initDiagnostics();
        if (class$org$apache$commons$logging$LogFactory == null) {
            clsClass$2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        } else {
            clsClass$2 = class$org$apache$commons$logging$LogFactory;
        }
        logClassLoaderEnvironment(clsClass$2);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static final Hashtable createFactoryStore() {
        String systemProperty;
        Hashtable hashtable = null;
        try {
            systemProperty = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException unused) {
            systemProperty = null;
        }
        if (systemProperty == null) {
            systemProperty = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(systemProperty).newInstance();
        } catch (Throwable unused2) {
            if (!WEAK_HASHTABLE_CLASSNAME.equals(systemProperty) && isDiagnosticsEnabled()) {
                logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static LogFactory getFactory() throws NumberFormatException, IOException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        if (contextClassLoaderInternal == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory cachedFactory = getCachedFactory(contextClassLoaderInternal);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("[LOOKUP] LogFactory implementation requested for the first time for context classloader ").append(objectId(contextClassLoaderInternal)).toString());
            logHierarchy("[LOOKUP] ", contextClassLoaderInternal);
        }
        Properties configurationFile = getConfigurationFile(contextClassLoaderInternal, FACTORY_PROPERTIES);
        ClassLoader classLoader = contextClassLoaderInternal;
        if (configurationFile != null && (property = configurationFile.getProperty(TCCL_KEY)) != null && !Boolean.valueOf(property).booleanValue()) {
            classLoader = thisClassLoader;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String systemProperty = getSystemProperty(FACTORY_PROPERTY, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(new StringBuffer("[LOOKUP] Creating an instance of LogFactory class '").append(systemProperty).append("' as specified by system property org.apache.commons.logging.LogFactory").toString());
                }
                cachedFactory = newFactory(systemProperty, classLoader, contextClassLoaderInternal);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [").append(trim(e.getMessage())).append("]. Trying alternative implementations...").toString());
            }
        } catch (RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [").append(trim(e2.getMessage())).append("] as specified by a system property.").toString());
            }
            throw e2;
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream resourceAsStream = getResourceAsStream(contextClassLoaderInternal, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, HTTP.UTF_8));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                    }
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && !"".equals(line)) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("[LOOKUP]  Creating an instance of LogFactory class ").append(line).append(" as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader.").toString());
                        }
                        cachedFactory = newFactory(line, classLoader, contextClassLoaderInternal);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(new StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [").append(trim(e3.getMessage())).append("]. Trying alternative implementations...").toString());
                }
            }
        }
        if (cachedFactory == null) {
            if (configurationFile != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("[LOOKUP] Properties file specifies LogFactory subclass '").append(property2).append("'").toString());
                    }
                    cachedFactory = newFactory(property2, classLoader, contextClassLoaderInternal);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            cachedFactory = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoaderInternal);
        }
        if (cachedFactory != null) {
            cacheFactory(contextClassLoaderInternal, cachedFactory);
            if (configurationFile != null) {
                Enumeration<?> enumerationPropertyNames = configurationFile.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    cachedFactory.setAttribute(str, configurationFile.getProperty(str));
                }
            }
        }
        return cachedFactory;
    }

    public static Log getLog(Class cls) {
        return getFactory().getInstance(cls);
    }

    public static Log getLog(String str) {
        return getFactory().getInstance(str);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Releasing factory for classloader ").append(objectId(classLoader)).toString());
        }
        synchronized (factories) {
            if (classLoader == null) {
                if (nullClassLoaderFactory != null) {
                    nullClassLoaderFactory.release();
                    nullClassLoaderFactory = null;
                }
            } else {
                LogFactory logFactory = (LogFactory) factories.get(classLoader);
                if (logFactory != null) {
                    logFactory.release();
                    factories.remove(classLoader);
                }
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        synchronized (factories) {
            Enumeration enumerationElements = factories.elements();
            while (enumerationElements.hasMoreElements()) {
                ((LogFactory) enumerationElements.nextElement()).release();
            }
            factories.clear();
            if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to get classloader for class '").append(cls).append("' due to security restrictions - ").append(e.getMessage()).toString());
            }
            throw e;
        }
    }

    public static ClassLoader getContextClassLoader() {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static ClassLoader directGetContextClassLoader() throws NoSuchMethodException, SecurityException {
        Class clsClass$;
        Class clsClass$2;
        try {
            if (class$java$lang$Thread == null) {
                clsClass$2 = class$("java.lang.Thread");
                class$java$lang$Thread = clsClass$2;
            } else {
                clsClass$2 = class$java$lang$Thread;
            }
            try {
                return (ClassLoader) clsClass$2.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
            } catch (IllegalAccessException e) {
                throw new LogConfigurationException("Unexpected IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getTargetException() instanceof SecurityException) {
                    return null;
                }
                throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
            }
        } catch (NoSuchMethodException unused) {
            if (class$org$apache$commons$logging$LogFactory == null) {
                clsClass$ = class$(FACTORY_PROPERTY);
                class$org$apache$commons$logging$LogFactory = clsClass$;
            } else {
                clsClass$ = class$org$apache$commons$logging$LogFactory;
            }
            return getClassLoader(clsClass$);
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader, ClassLoader classLoader2) {
        Object objDoPrivileged = AccessController.doPrivileged((PrivilegedAction<Object>) new PrivilegedAction(str, classLoader) { // from class: org.apache.commons.logging.LogFactory.2
            private final ClassLoader val$classLoader;
            private final String val$factoryClass;

            {
                this.val$factoryClass = str;
                this.val$classLoader = classLoader;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(this.val$factoryClass, this.val$classLoader);
            }
        });
        if (objDoPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) objDoPrivileged;
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("An error occurred while loading the factory class:").append(logConfigurationException.getMessage()).toString());
                throw logConfigurationException;
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Created object ").append(objectId(objDoPrivileged)).append(" to manage classloader ").append(objectId(classLoader2)).toString());
        }
        return (LogFactory) objDoPrivileged;
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }

    protected static Object createFactory(String str, ClassLoader classLoader) throws ClassNotFoundException {
        Class clsClass$;
        Class clsClass$2;
        String string;
        Class clsClass$3;
        Class clsClass$4;
        Class<?> clsLoadClass = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        clsLoadClass = classLoader.loadClass(str);
                        if (class$org$apache$commons$logging$LogFactory == null) {
                            clsClass$3 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = clsClass$3;
                        } else {
                            clsClass$3 = class$org$apache$commons$logging$LogFactory;
                        }
                        if (clsClass$3.isAssignableFrom(clsLoadClass)) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("Loaded class ").append(clsLoadClass.getName()).append(" from classloader ").append(objectId(classLoader)).toString());
                            }
                        } else if (isDiagnosticsEnabled()) {
                            StringBuffer stringBufferAppend = new StringBuffer("Factory class ").append(clsLoadClass.getName()).append(" loaded from classloader ").append(objectId(clsLoadClass.getClassLoader())).append(" does not extend '");
                            if (class$org$apache$commons$logging$LogFactory == null) {
                                clsClass$4 = class$(FACTORY_PROPERTY);
                                class$org$apache$commons$logging$LogFactory = clsClass$4;
                            } else {
                                clsClass$4 = class$org$apache$commons$logging$LogFactory;
                            }
                            logDiagnostic(stringBufferAppend.append(clsClass$4.getName()).append("' as loaded by this classloader.").toString());
                            logHierarchy("[BAD CL TREE] ", classLoader);
                        }
                        return (LogFactory) clsLoadClass.newInstance();
                    } catch (ClassNotFoundException e) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("Unable to locate any class called '").append(str).append("' via classloader ").append(objectId(classLoader)).toString());
                            }
                            throw e;
                        }
                    } catch (NoClassDefFoundError e2) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("Class '").append(str).append("' cannot be loaded via classloader ").append(objectId(classLoader)).append(" - it depends on some other class that cannot be found.").toString());
                            }
                            throw e2;
                        }
                    }
                } catch (ClassCastException unused) {
                    if (classLoader == thisClassLoader) {
                        boolean zImplementsLogFactory = implementsLogFactory(clsLoadClass);
                        StringBuffer stringBufferAppend2 = new StringBuffer("The application has specified that a custom LogFactory implementation should be used but Class '").append(str).append("' cannot be converted to '");
                        if (class$org$apache$commons$logging$LogFactory == null) {
                            clsClass$2 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = clsClass$2;
                        } else {
                            clsClass$2 = class$org$apache$commons$logging$LogFactory;
                        }
                        String string2 = stringBufferAppend2.append(clsClass$2.getName()).append("'. ").toString();
                        if (zImplementsLogFactory) {
                            string = new StringBuffer().append(string2).append("The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://commons.apache.org/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. ").toString();
                        } else {
                            string = new StringBuffer().append(string2).append("Please check the custom implementation. ").toString();
                        }
                        String string3 = new StringBuffer().append(string).append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.").toString();
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(string3);
                        }
                        throw new ClassCastException(string3);
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to load factory class via classloader ").append(objectId(classLoader)).append(" - trying the classloader associated with this LogFactory.").toString());
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (clsLoadClass != null) {
                if (class$org$apache$commons$logging$LogFactory == null) {
                    clsClass$ = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = clsClass$;
                } else {
                    clsClass$ = class$org$apache$commons$logging$LogFactory;
                }
                if (!clsClass$.isAssignableFrom(clsLoadClass)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new LogConfigurationException(e3);
        }
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    boolean zIsAssignableFrom = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    z = zIsAssignableFrom;
                    if (zIsAssignableFrom) {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" implements LogFactory but was loaded by an incompatible classloader.").toString());
                    } else {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" does not implement LogFactory.").toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e.getMessage()).toString());
            } catch (SecurityException e2) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e2.getMessage()).toString());
            }
        }
        return z;
    }

    private static InputStream getResourceAsStream(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.3
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                if (this.val$loader != null) {
                    return this.val$loader.getResourceAsStream(this.val$name);
                }
                return ClassLoader.getSystemResourceAsStream(this.val$name);
            }
        });
    }

    private static Enumeration getResources(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.4
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    if (this.val$loader != null) {
                        return this.val$loader.getResources(this.val$name);
                    }
                    return ClassLoader.getSystemResources(this.val$name);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic(new StringBuffer("Exception while trying to find configuration file ").append(this.val$name).append(":").append(e.getMessage()).toString());
                        return null;
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static Properties getProperties(URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction(url) { // from class: org.apache.commons.logging.LogFactory.5
            private final URL val$url;

            {
                this.val$url = url;
            }

            @Override // java.security.PrivilegedAction
            public Object run() throws IOException {
                try {
                    InputStream inputStreamOpenStream = this.val$url.openStream();
                    if (inputStreamOpenStream != null) {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        inputStreamOpenStream.close();
                        return properties;
                    }
                    return null;
                } catch (IOException unused) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic(new StringBuffer("Unable to read URL ").append(this.val$url).toString());
                        return null;
                    }
                    return null;
                }
            }
        });
    }

    private static final Properties getConfigurationFile(ClassLoader classLoader, String str) throws NumberFormatException {
        Enumeration resources;
        Properties properties = null;
        double d = 0.0d;
        URL url = null;
        try {
            resources = getResources(classLoader, str);
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("SecurityException thrown while trying to find/read config files.");
            }
        }
        if (resources == null) {
            return null;
        }
        while (resources.hasMoreElements()) {
            URL url2 = (URL) resources.nextElement();
            Properties properties2 = getProperties(url2);
            if (properties2 != null) {
                if (properties == null) {
                    url = url2;
                    properties = properties2;
                    String property = properties2.getProperty(PRIORITY_KEY);
                    d = 0.0d;
                    if (property != null) {
                        d = Double.parseDouble(property);
                    }
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("[LOOKUP] Properties file found at '").append(url2).append("' with priority ").append(d).toString());
                    }
                } else {
                    String property2 = properties2.getProperty(PRIORITY_KEY);
                    double d2 = 0.0d;
                    if (property2 != null) {
                        d2 = Double.parseDouble(property2);
                    }
                    if (d2 > d) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("[LOOKUP] Properties file at '").append(url2).append("' with priority ").append(d2).append(" overrides file at '").append(url).append("' with priority ").append(d).toString());
                        }
                        url = url2;
                        properties = properties2;
                        d = d2;
                    } else if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("[LOOKUP] Properties file at '").append(url2).append("' with priority ").append(d2).append(" does not override file at '").append(url).append("' with priority ").append(d).toString());
                    }
                }
            }
        }
        if (isDiagnosticsEnabled()) {
            if (properties == null) {
                logDiagnostic(new StringBuffer("[LOOKUP] No properties file of name '").append(str).append("' found.").toString());
            } else {
                logDiagnostic(new StringBuffer("[LOOKUP] Properties file of name '").append(str).append("' found at '").append(url).append(TokenParser.DQUOTE).toString());
            }
        }
        return properties;
    }

    private static String getSystemProperty(String str, String str2) {
        return (String) AccessController.doPrivileged(new PrivilegedAction(str, str2) { // from class: org.apache.commons.logging.LogFactory.6
            private final String val$def;
            private final String val$key;

            {
                this.val$key = str;
                this.val$def = str2;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(this.val$key, this.val$def);
            }
        });
    }

    private static void initDiagnostics() {
        String strObjectId;
        try {
            String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
            if (systemProperty == null) {
                return;
            }
            if (systemProperty.equals("STDOUT")) {
                diagnosticsStream = System.out;
            } else if (systemProperty.equals("STDERR")) {
                diagnosticsStream = System.err;
            } else {
                try {
                    diagnosticsStream = new PrintStream(new FileOutputStream(systemProperty, true));
                } catch (IOException unused) {
                    return;
                }
            }
            try {
                ClassLoader classLoader = thisClassLoader;
                if (thisClassLoader == null) {
                    strObjectId = "BOOTLOADER";
                } else {
                    strObjectId = objectId(classLoader);
                }
            } catch (SecurityException unused2) {
                strObjectId = "UNKNOWN";
            }
            diagnosticPrefix = new StringBuffer("[LogFactory from ").append(strObjectId).append("] ").toString();
        } catch (SecurityException unused3) {
        }
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        if (diagnosticsStream != null) {
            diagnosticsStream.print(diagnosticPrefix);
            diagnosticsStream.flush();
        }
    }

    public static final void logRawDiagnostic(String str) {
        if (diagnosticsStream != null) {
            diagnosticsStream.flush();
        }
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (!isDiagnosticsEnabled()) {
            return;
        }
        try {
            logDiagnostic(new StringBuffer("[ENV] Extension directories (java.ext.dir): ").append(System.getProperty("java.ext.dir")).toString());
            logDiagnostic(new StringBuffer("[ENV] Application classpath (java.class.path): ").append(System.getProperty("java.class.path")).toString());
        } catch (SecurityException unused) {
            logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
        }
        String name = cls.getName();
        try {
            ClassLoader classLoader = getClassLoader(cls);
            logDiagnostic(new StringBuffer("[ENV] Class ").append(name).append(" was loaded via classloader ").append(objectId(classLoader)).toString());
            logHierarchy(new StringBuffer("[ENV] Ancestry of classloader which loaded ").append(name).append(" is ").toString(), classLoader);
        } catch (SecurityException unused2) {
            logDiagnostic(new StringBuffer("[ENV] Security forbids determining the classloader for ").append(name).toString());
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (!isDiagnosticsEnabled()) {
            return;
        }
        if (classLoader != null) {
            logDiagnostic(new StringBuffer().append(str).append(objectId(classLoader)).append(" == '").append(classLoader.toString()).append("'").toString());
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (classLoader != null) {
                StringBuffer stringBuffer = new StringBuffer(new StringBuffer().append(str).append("ClassLoader tree:").toString());
                do {
                    stringBuffer.append(objectId(classLoader));
                    if (classLoader == systemClassLoader) {
                        stringBuffer.append(" (SYSTEM) ");
                    }
                    try {
                        classLoader = classLoader.getParent();
                        stringBuffer.append(" --> ");
                    } catch (SecurityException unused) {
                        stringBuffer.append(" --> SECRET");
                    }
                } while (classLoader != null);
                stringBuffer.append("BOOT");
                logDiagnostic(stringBuffer.toString());
            }
        } catch (SecurityException unused2) {
            logDiagnostic(new StringBuffer().append(str).append("Security forbids determining the system classloader.").toString());
        }
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        return new StringBuffer().append(obj.getClass().getName()).append("@").append(System.identityHashCode(obj)).toString();
    }
}
