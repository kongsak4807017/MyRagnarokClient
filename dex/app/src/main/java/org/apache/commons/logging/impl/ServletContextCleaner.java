package org.apache.commons.logging.impl;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ServletContextCleaner implements ServletContextListener {
    static Class class$java$lang$ClassLoader;
    private Class[] RELEASE_SIGNATURE;

    public ServletContextCleaner() {
        Class clsClass$;
        Class[] clsArr = new Class[1];
        if (class$java$lang$ClassLoader == null) {
            clsClass$ = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = clsClass$;
        } else {
            clsClass$ = class$java$lang$ClassLoader;
        }
        clsArr[0] = clsClass$;
        this.RELEASE_SIGNATURE = clsArr;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader parent = contextClassLoader;
        while (parent != null) {
            try {
                Class<?> clsLoadClass = parent.loadClass(LogFactory.FACTORY_PROPERTY);
                clsLoadClass.getMethod("release", this.RELEASE_SIGNATURE).invoke(null, objArr);
                parent = clsLoadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                parent = null;
            } catch (IllegalAccessException unused2) {
                parent = null;
            } catch (NoSuchMethodException unused3) {
                parent = null;
            } catch (InvocationTargetException unused4) {
                parent = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
