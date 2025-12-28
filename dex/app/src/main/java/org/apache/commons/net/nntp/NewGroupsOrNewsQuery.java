package org.apache.commons.net.nntp;

import java.util.Calendar;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class NewGroupsOrNewsQuery {
    private String __date;
    private boolean __isGMT;
    private String __time;
    private StringBuffer __distributions = null;
    private StringBuffer __newsgroups = null;

    public NewGroupsOrNewsQuery(Calendar calendar, boolean z) {
        this.__isGMT = z;
        StringBuilder sb = new StringBuilder();
        String string = Integer.toString(calendar.get(1));
        int length = string.length();
        if (length >= 2) {
            sb.append(string.substring(length - 2));
        } else {
            sb.append("00");
        }
        String string2 = Integer.toString(calendar.get(2) + 1);
        int length2 = string2.length();
        if (length2 == 1) {
            sb.append('0');
            sb.append(string2);
        } else if (length2 == 2) {
            sb.append(string2);
        } else {
            sb.append("01");
        }
        String string3 = Integer.toString(calendar.get(5));
        int length3 = string3.length();
        if (length3 == 1) {
            sb.append('0');
            sb.append(string3);
        } else if (length3 == 2) {
            sb.append(string3);
        } else {
            sb.append("01");
        }
        this.__date = sb.toString();
        sb.setLength(0);
        String string4 = Integer.toString(calendar.get(11));
        int length4 = string4.length();
        if (length4 == 1) {
            sb.append('0');
            sb.append(string4);
        } else if (length4 == 2) {
            sb.append(string4);
        } else {
            sb.append("00");
        }
        String string5 = Integer.toString(calendar.get(12));
        int length5 = string5.length();
        if (length5 == 1) {
            sb.append('0');
            sb.append(string5);
        } else if (length5 == 2) {
            sb.append(string5);
        } else {
            sb.append("00");
        }
        String string6 = Integer.toString(calendar.get(13));
        int length6 = string6.length();
        if (length6 == 1) {
            sb.append('0');
            sb.append(string6);
        } else if (length6 == 2) {
            sb.append(string6);
        } else {
            sb.append("00");
        }
        this.__time = sb.toString();
    }

    public final void addNewsgroup(String str) {
        if (this.__newsgroups != null) {
            this.__newsgroups.append(',');
        } else {
            this.__newsgroups = new StringBuffer();
        }
        this.__newsgroups.append(str);
    }

    public final void omitNewsgroup(String str) {
        addNewsgroup("!" + str);
    }

    public final void addDistribution(String str) {
        if (this.__distributions != null) {
            this.__distributions.append(',');
        } else {
            this.__distributions = new StringBuffer();
        }
        this.__distributions.append(str);
    }

    public final String getDate() {
        return this.__date;
    }

    public final String getTime() {
        return this.__time;
    }

    public final boolean isGMT() {
        return this.__isGMT;
    }

    public final String getDistributions() {
        if (this.__distributions == null) {
            return null;
        }
        return this.__distributions.toString();
    }

    public final String getNewsgroups() {
        if (this.__newsgroups == null) {
            return null;
        }
        return this.__newsgroups.toString();
    }
}
