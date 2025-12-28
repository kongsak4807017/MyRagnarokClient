package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.http.client.methods.HttpTrace;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class Log4JLogger implements Serializable, Log {
    private static final String FQCN;
    static Class class$org$apache$commons$logging$impl$Log4JLogger;
    static Class class$org$apache$log4j$Level;
    static Class class$org$apache$log4j$Priority;
    private static Priority traceLevel;
    private transient Logger logger;
    private String name;

    static {
        Class clsClass$;
        Class clsClass$2;
        Class<?> clsClass$3;
        Class clsClass$4;
        if (class$org$apache$commons$logging$impl$Log4JLogger == null) {
            clsClass$ = class$("org.apache.commons.logging.impl.Log4JLogger");
            class$org$apache$commons$logging$impl$Log4JLogger = clsClass$;
        } else {
            clsClass$ = class$org$apache$commons$logging$impl$Log4JLogger;
        }
        FQCN = clsClass$.getName();
        if (class$org$apache$log4j$Priority == null) {
            clsClass$2 = class$("org.apache.log4j.Priority");
            class$org$apache$log4j$Priority = clsClass$2;
        } else {
            clsClass$2 = class$org$apache$log4j$Priority;
        }
        if (class$org$apache$log4j$Level == null) {
            clsClass$3 = class$("org.apache.log4j.Level");
            class$org$apache$log4j$Level = clsClass$3;
        } else {
            clsClass$3 = class$org$apache$log4j$Level;
        }
        if (!clsClass$2.isAssignableFrom(clsClass$3)) {
            throw new InstantiationError("Log4J 1.2 not available");
        }
        try {
            if (class$org$apache$log4j$Level == null) {
                clsClass$4 = class$("org.apache.log4j.Level");
                class$org$apache$log4j$Level = clsClass$4;
            } else {
                clsClass$4 = class$org$apache$log4j$Level;
            }
            traceLevel = (Priority) clsClass$4.getDeclaredField(HttpTrace.METHOD_NAME).get(null);
        } catch (Exception unused) {
            traceLevel = Priority.DEBUG;
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Log4JLogger() {
        this.logger = null;
        this.name = null;
    }

    public Log4JLogger(String str) {
        this.logger = null;
        this.name = null;
        this.name = str;
        this.logger = getLogger();
    }

    public Log4JLogger(Logger logger) {
        this.logger = null;
        this.name = null;
        if (logger == null) {
            throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
        }
        this.name = logger.getName();
        this.logger = logger;
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        getLogger().log(FQCN, traceLevel, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th) {
        getLogger().log(FQCN, traceLevel, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        getLogger().log(FQCN, Priority.DEBUG, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.DEBUG, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        getLogger().log(FQCN, Priority.INFO, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.INFO, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        getLogger().log(FQCN, Priority.WARN, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.WARN, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        getLogger().log(FQCN, Priority.ERROR, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.ERROR, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        getLogger().log(FQCN, Priority.FATAL, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.FATAL, obj, th);
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isEnabledFor(Priority.ERROR);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isEnabledFor(Priority.FATAL);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isEnabledFor(traceLevel);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isEnabledFor(Priority.WARN);
    }
}
