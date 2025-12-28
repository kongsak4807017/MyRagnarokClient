package o;

import org.apache.http.message.TokenParser;

/* renamed from: o.ܯܶ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0432 {

    /* renamed from: Ą, reason: contains not printable characters */
    String f6847;

    /* renamed from: ą, reason: contains not printable characters */
    String f6848;

    /* renamed from: Ć, reason: contains not printable characters */
    int f6849;

    /* renamed from: ć, reason: contains not printable characters */
    int f6850;

    /* renamed from: ȃ, reason: contains not printable characters */
    String f6851;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    String f6852;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    EnumC0680 f6853;

    /* renamed from: 櫯, reason: contains not printable characters */
    String f6854;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f6855;

    C0432() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m1328(boolean z) {
        String str;
        if (!z && this.f6851 != null) {
            str = this.f6851;
        } else {
            str = this.f6855;
        }
        if (str == null) {
            return null;
        }
        return str.replace('_', TokenParser.SP);
    }
}
