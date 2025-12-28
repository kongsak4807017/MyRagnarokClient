package org.apache.http.conn.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ConnConnectionParamBean extends HttpAbstractParamBean {
    public ConnConnectionParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    @Deprecated
    public void setMaxStatusLineGarbage(int i) {
        this.params.setIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, i);
    }
}
