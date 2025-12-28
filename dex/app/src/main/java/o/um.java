package o;

import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class um {

    /* renamed from: 櫯, reason: contains not printable characters */
    un f5322;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f5323;

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract boolean mo1131(pj.C0079.C0080 c0080);

    protected um(String str, lp lpVar) {
        this.f5323 = str;
        this.f5322 = lpVar;
    }

    /* renamed from: o.um$鷭, reason: contains not printable characters */
    class C0113 extends po {

        /* renamed from: 鷭, reason: contains not printable characters */
        String f5325;

        C0113(String str) {
            this.f5325 = str;
        }

        @Override // o.po
        /* renamed from: 鷭 */
        public final void mo548(long j, long j2) {
            if (j2 < 1) {
                um.this.f5322.mo789(String.valueOf(this.f5325) + "\n[" + pa.m973(j) + " bytes] Downloading...");
            } else {
                um.this.f5322.mo789(String.valueOf(this.f5325) + "\n" + ((100 * j) / j2) + "% [" + pa.m973(j) + "/" + pa.m973(j2) + "] Downloading...");
            }
        }
    }
}
