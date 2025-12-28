package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class pb {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m989(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        if (!absolutePath.startsWith(str)) {
            throw new IllegalArgumentException("get_relative_path: " + absolutePath + " is not in " + str + " directory");
        }
        return file.getAbsolutePath().substring(str.length() + 1);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static byte[] m992(String str) {
        try {
            return pa.m956(str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m990(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m990(file2);
            }
        }
        file.delete();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m991(File file, LinkedList<File> linkedList) {
        if (!file.exists()) {
            return;
        }
        if (!file.isDirectory()) {
            linkedList.add(file);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            m991(file2, linkedList);
        }
    }
}
