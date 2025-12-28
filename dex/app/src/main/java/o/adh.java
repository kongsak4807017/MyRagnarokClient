package o;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class adh<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* renamed from: 鷭, reason: contains not printable characters */
    static String m337(BufferedInputStream bufferedInputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream), 1024);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line + "\n");
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
