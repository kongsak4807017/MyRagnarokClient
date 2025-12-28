package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Hashtable logs = new Hashtable();
    protected static Constructor logImplctor = null;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0021
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    static {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            org.apache.commons.logging.LogSource.logs = r0
            r0 = 0
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0
            r0 = 0
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0
            r0 = 0
            org.apache.commons.logging.LogSource.logImplctor = r0
            java.lang.String r0 = "org.apache.log4j.Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r1 == r0) goto L1d
            r0 = 1
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0     // Catch: java.lang.Throwable -> L21
            goto L24
        L1d:
            r0 = 0
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r0 = 0
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0
        L24:
            java.lang.String r0 = "java.util.logging.Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r1 == r0) goto L3a
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r1 == r0) goto L3a
            r0 = 1
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3a:
            r0 = 0
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = 0
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0
        L41:
            r2 = 0
            java.lang.String r0 = "org.apache.commons.logging.log"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L53
            r2 = r0
            if (r0 != 0) goto L52
            java.lang.String r0 = "org.apache.commons.logging.Log"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L53
            r2 = r0
        L52:
        L53:
            if (r2 == 0) goto L60
            setLogImplementation(r2)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L5f
            return
        L5f:
            return
        L60:
            boolean r0 = org.apache.commons.logging.LogSource.log4jIsAvailable     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L6a
            java.lang.String r0 = "org.apache.commons.logging.impl.Log4JLogger"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L7a
            return
        L6a:
            boolean r0 = org.apache.commons.logging.LogSource.jdk14IsAvailable     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L74
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L7a
            return
        L74:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L7a
            return
        L7a:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L80
            return
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogSource.m1663clinit():void");
    }

    private LogSource() {
    }

    public static void setLogImplementation(String str) {
        try {
            logImplctor = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }

    public static void setLogImplementation(Class cls) {
        logImplctor = cls.getConstructor("".getClass());
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log logMakeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, logMakeNewLogInstance);
        return logMakeNewLogInstance;
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(str);
        } catch (Throwable unused) {
            log = null;
        }
        if (log == null) {
            return new NoOpLog(str);
        }
        return log;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }
}
