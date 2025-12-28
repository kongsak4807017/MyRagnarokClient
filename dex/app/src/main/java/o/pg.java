package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum pg {
    BC_KEEPALIVE_ACK(67),
    BC_VERIFYPURCHASEACK,
    CB_KEEPALIVE,
    CB_VERIFYPURCHASE,
    RB_AUTHREQ,
    BR_AUTHREPLY,
    BR_ADDPOINTSREQ,
    RB_ADDPOINTSACK,
    CB_SERVERNAME,
    CB_RESOURCEREQ,
    BC_RESOURCEACK,
    BC_RESOURCECHUNK,
    BC_RESOURCEFINISH,
    CB_RESOURCEREQ_ASCII,
    BC_RESOURCEACK_ASCII,
    CB_SERVERNAME_ASCII,
    CB_CRASHREPORT,
    BC_SHOWMESSAGEBOX,
    CB_VERSIONINFO,
    CB_RESOURCESIZEREQ,
    BC_RESOURCESIZEACK,
    CB_CLIENTCHECKSUMREQ,
    BC_CLIENTCHECKSUM,
    CB_RESOURCEREQ2,
    BC_RESOURCEACK2,
    CB_SERVERNAME2,
    CB_LOGMESSAGE;


    /* renamed from: 囃, reason: contains not printable characters */
    public short f4538 = 0;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static pg[] valuesCustom() {
        pg[] pgVarArrValuesCustom = values();
        int length = pgVarArrValuesCustom.length;
        pg[] pgVarArr = new pg[length];
        System.arraycopy(pgVarArrValuesCustom, 0, pgVarArr, 0, length);
        return pgVarArr;
    }

    static {
        pg[] pgVarArrValuesCustom = valuesCustom();
        int i = -1;
        for (int i2 = 0; i2 < pgVarArrValuesCustom.length; i2++) {
            if (pgVarArrValuesCustom[i2].f4538 != 0) {
                i = pgVarArrValuesCustom[i2].f4538;
            } else {
                pgVarArrValuesCustom[i2].f4538 = (short) (i + 1);
                i++;
            }
        }
    }

    pg(int i) {
    }

    pg() {
    }
}
