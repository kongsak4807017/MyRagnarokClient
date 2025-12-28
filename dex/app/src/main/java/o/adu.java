package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.SocketClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adu {

    /* renamed from: Ą, reason: contains not printable characters */
    private ady f530;

    /* renamed from: ȃ, reason: contains not printable characters */
    private String f532;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final String f533;

    /* renamed from: 鷭, reason: contains not printable characters */
    public String f535;

    /* renamed from: ą, reason: contains not printable characters */
    private int f531 = 120000;

    /* renamed from: 櫯, reason: contains not printable characters */
    public final Map<String, String> f534 = new HashMap();

    public adu(String str) {
        this.f533 = str;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final adu m359(Map<String, String> map) throws UnsupportedEncodingException {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                arrayList.add(URLEncoder.encode(str, HTTP.UTF_8) + "=" + URLEncoder.encode(str2, HTTP.UTF_8));
            }
            String strJoin = TextUtils.join("&", arrayList);
            this.f534.put("Content-Type", URLEncodedUtils.CONTENT_TYPE);
            this.f532 = strJoin;
            return this;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final adu m358(Map<String, String> map, Context context, List<Uri> list) throws FileNotFoundException {
        try {
            this.f530 = new ady();
            this.f530.m373();
            for (String str : map.keySet()) {
                ady adyVar = this.f530;
                String str2 = map.get(str);
                adyVar.m373();
                adyVar.f545.write(("Content-Disposition: form-data; name=\"" + str + "\"\r\n").getBytes());
                adyVar.f545.write("Content-Type: text/plain; charset=UTF-8\r\n".getBytes());
                adyVar.f545.write("Content-Transfer-Encoding: 8bit\r\n\r\n".getBytes());
                adyVar.f545.write(str2.getBytes());
                adyVar.f545.write(("\r\n--" + adyVar.f544 + SocketClient.NETASCII_EOL).getBytes());
            }
            int i = 0;
            while (i < list.size()) {
                Uri uri = list.get(i);
                this.f530.m374("attachment" + i, uri.getLastPathSegment(), context.getContentResolver().openInputStream(uri), "application/octet-stream", i == list.size() + (-1));
                i++;
            }
            this.f530.m372();
            this.f534.put("Content-Type", "multipart/form-data; boundary=" + this.f530.f544);
            return this;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final HttpURLConnection m357() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f533).openConnection();
        httpURLConnection.setConnectTimeout(this.f531);
        httpURLConnection.setReadTimeout(this.f531);
        if (Build.VERSION.SDK_INT <= 9) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        if (!TextUtils.isEmpty(this.f535)) {
            httpURLConnection.setRequestMethod(this.f535);
            if (!TextUtils.isEmpty(this.f532) || this.f535.equalsIgnoreCase(HttpPost.METHOD_NAME) || this.f535.equalsIgnoreCase(HttpPut.METHOD_NAME)) {
                httpURLConnection.setDoOutput(true);
            }
        }
        for (String str : this.f534.keySet()) {
            httpURLConnection.setRequestProperty(str, this.f534.get(str));
        }
        if (!TextUtils.isEmpty(this.f532)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), HTTP.UTF_8));
            bufferedWriter.write(this.f532);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        if (this.f530 != null) {
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.f530.m371()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(this.f530.m370().toByteArray());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return httpURLConnection;
    }
}
