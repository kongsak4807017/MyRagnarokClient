package o;

/* renamed from: o.յ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0413 extends C0784 {
    C0413(C0539 c0539) {
        if (!(C0358.f6669.f2048.f1554.f1675.get("guild_minimap_mark") != null)) {
            int[] iArr = new int[256];
            iArr[0] = 0;
            iArr[1] = -2130706433;
            iArr[2] = -22830;
            C0358.f6669.f2048.f1554.m691(new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 2, 2, 2, 2, 2, 2, 1, 0, 0, 1, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 1, 2, 2, 2, 2, 1, 0, 0, 0, 0, 1, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}, iArr, 10, 8, "guild_minimap_mark", null);
            C0851 c0851 = C0358.f6669.f2066;
            RunnableC1005 runnableC1005 = new RunnableC1005();
            synchronized (c0851) {
                c0851.f7979.add(runnableC1005);
            }
        }
        super.m1471(c0539, C0358.f6669.f2048.f1554, "guild_minimap_mark", 2.0f);
    }
}
