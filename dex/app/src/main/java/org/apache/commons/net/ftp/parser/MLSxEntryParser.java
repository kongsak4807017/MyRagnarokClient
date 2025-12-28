package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;
import org.apache.commons.net.nntp.NNTP;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class MLSxEntryParser extends FTPFileEntryParserImpl {
    private static final MLSxEntryParser PARSER = new MLSxEntryParser();
    private static final HashMap<String, Integer> TYPE_TO_INT;
    private static int[] UNIX_GROUPS;
    private static int[][] UNIX_PERMS;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        TYPE_TO_INT = map;
        map.put("file", 0);
        TYPE_TO_INT.put("cdir", 1);
        TYPE_TO_INT.put("pdir", 1);
        TYPE_TO_INT.put("dir", 1);
        UNIX_GROUPS = new int[]{0, 1, 2};
        UNIX_PERMS = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        SimpleDateFormat simpleDateFormat;
        String[] strArrSplit = str.split(" ", 2);
        if (strArrSplit.length != 2) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        fTPFile.setName(strArrSplit[1]);
        String[] strArrSplit2 = strArrSplit[0].split(";");
        boolean zContains = strArrSplit[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
        for (String str2 : strArrSplit2) {
            String[] strArrSplit3 = str2.split("=");
            if (strArrSplit3.length == 2) {
                String lowerCase = strArrSplit3[0].toLowerCase(Locale.ENGLISH);
                String str3 = strArrSplit3[1];
                String lowerCase2 = str3.toLowerCase(Locale.ENGLISH);
                if ("size".equals(lowerCase)) {
                    fTPFile.setSize(Long.parseLong(str3));
                } else if ("sizd".equals(lowerCase)) {
                    fTPFile.setSize(Long.parseLong(str3));
                } else if ("modify".equals(lowerCase)) {
                    if (str3.contains(".")) {
                        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                    } else {
                        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    }
                    TimeZone timeZone = TimeZone.getTimeZone("GMT");
                    simpleDateFormat.setTimeZone(timeZone);
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                    try {
                        gregorianCalendar.setTime(simpleDateFormat.parse(str3));
                    } catch (ParseException unused) {
                    }
                    fTPFile.setTimestamp(gregorianCalendar);
                } else if ("type".equals(lowerCase)) {
                    Integer num = TYPE_TO_INT.get(lowerCase2);
                    if (num == null) {
                        fTPFile.setType(3);
                    } else {
                        fTPFile.setType(num.intValue());
                    }
                } else if (lowerCase.startsWith("unix.")) {
                    String lowerCase3 = lowerCase.substring(5).toLowerCase(Locale.ENGLISH);
                    if ("group".equals(lowerCase3)) {
                        fTPFile.setGroup(str3);
                    } else if ("owner".equals(lowerCase3)) {
                        fTPFile.setUser(str3);
                    } else if ("mode".equals(lowerCase3)) {
                        int length = str3.length() - 3;
                        for (int i = 0; i < 3; i++) {
                            int iCharAt = str3.charAt(length + i) - '0';
                            if (iCharAt >= 0 && iCharAt <= 7) {
                                for (int i2 : UNIX_PERMS[iCharAt]) {
                                    fTPFile.setPermission(UNIX_GROUPS[i], i2, true);
                                }
                            }
                        }
                    }
                } else if (!zContains && "perm".equals(lowerCase)) {
                    doUnixPerms(fTPFile, lowerCase2);
                }
            }
        }
        return fTPFile;
    }

    private void doUnixPerms(FTPFile fTPFile, String str) {
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'c':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'd':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                    fTPFile.setPermission(0, 0, true);
                    break;
                case 'l':
                    fTPFile.setPermission(0, 2, true);
                    break;
                case 'm':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'p':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'r':
                    fTPFile.setPermission(0, 0, true);
                    break;
                case NNTP.DEFAULT_PORT /* 119 */:
                    fTPFile.setPermission(0, 1, true);
                    break;
            }
        }
    }

    public static FTPFile parseEntry(String str) {
        return PARSER.parseFTPEntry(str);
    }

    public static MLSxEntryParser getInstance() {
        return PARSER;
    }
}
