package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class og {

    /* renamed from: Ą, reason: contains not printable characters */
    int f3253;

    /* renamed from: ą, reason: contains not printable characters */
    int f3254;

    /* renamed from: Ć, reason: contains not printable characters */
    int f3255;

    /* renamed from: ć, reason: contains not printable characters */
    int f3256;

    /* renamed from: ċ, reason: contains not printable characters */
    int f3257;

    /* renamed from: đ, reason: contains not printable characters */
    short f3258;

    /* renamed from: Ē, reason: contains not printable characters */
    short f3259;

    /* renamed from: ē, reason: contains not printable characters */
    short f3260;

    /* renamed from: Ė, reason: contains not printable characters */
    short f3261;

    /* renamed from: ė, reason: contains not printable characters */
    short f3262;

    /* renamed from: Ę, reason: contains not printable characters */
    short f3263;

    /* renamed from: ę, reason: contains not printable characters */
    short f3264;

    /* renamed from: ġ, reason: contains not printable characters */
    byte f3265;

    /* renamed from: ģ, reason: contains not printable characters */
    short f3266;

    /* renamed from: Ĥ, reason: contains not printable characters */
    short f3267;

    /* renamed from: ĥ, reason: contains not printable characters */
    byte[] f3268;

    /* renamed from: Ħ, reason: contains not printable characters */
    int f3269;

    /* renamed from: ħ, reason: contains not printable characters */
    int f3270;

    /* renamed from: Ĩ, reason: contains not printable characters */
    int f3271;

    /* renamed from: Ī, reason: contains not printable characters */
    byte f3272;

    /* renamed from: ȃ, reason: contains not printable characters */
    long f3273;

    /* renamed from: Ȋ, reason: contains not printable characters */
    short f3274;

    /* renamed from: Ƞ, reason: contains not printable characters */
    byte f3275;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f3276;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f3277;

    /* renamed from: ܕ, reason: contains not printable characters */
    short f3278;

    /* renamed from: ܨ, reason: contains not printable characters */
    byte f3279;

    /* renamed from: ঽ্, reason: contains not printable characters */
    byte[] f3280;

    /* renamed from: 㥳, reason: contains not printable characters */
    short f3281;

    /* renamed from: 㱽, reason: contains not printable characters */
    byte f3282;

    /* renamed from: 㵼, reason: contains not printable characters */
    byte f3283;

    /* renamed from: 䒧, reason: contains not printable characters */
    short f3284;

    /* renamed from: 囃, reason: contains not printable characters */
    short f3285;

    /* renamed from: 岱, reason: contains not printable characters */
    int f3286;

    /* renamed from: 庸, reason: contains not printable characters */
    short f3287;

    /* renamed from: 廂, reason: contains not printable characters */
    short f3288;

    /* renamed from: 廅, reason: contains not printable characters */
    byte f3289;

    /* renamed from: 廑, reason: contains not printable characters */
    int f3290;

    /* renamed from: 櫯, reason: contains not printable characters */
    long f3291;

    /* renamed from: 纫, reason: contains not printable characters */
    int f3292;

    /* renamed from: 躆, reason: contains not printable characters */
    short f3293;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f3294;

    /* renamed from: 띥, reason: contains not printable characters */
    short f3295;

    og() {
        this.f3280 = new byte[24];
    }

    og(ByteBuffer byteBuffer) {
        byte[] bArr;
        this.f3280 = new byte[24];
        this.f3294 = byteBuffer.getInt();
        this.f3291 = C0358.f6667.f4784 ? byteBuffer.getLong() : byteBuffer.getInt();
        this.f3276 = byteBuffer.getInt();
        this.f3273 = C0358.f6667.f4784 ? byteBuffer.getLong() : byteBuffer.getInt();
        this.f3253 = byteBuffer.getInt();
        this.f3254 = byteBuffer.getInt();
        this.f3255 = byteBuffer.getInt();
        this.f3256 = byteBuffer.getInt();
        this.f3277 = byteBuffer.getInt();
        this.f3286 = byteBuffer.getInt();
        this.f3274 = byteBuffer.getShort();
        this.f3257 = C0358.f6667.f4800 > 20081217 ? byteBuffer.getInt() : byteBuffer.getShort();
        this.f3292 = C0358.f6667.f4800 > 20081217 ? byteBuffer.getInt() : byteBuffer.getShort();
        this.f3284 = byteBuffer.getShort();
        this.f3293 = byteBuffer.getShort();
        this.f3278 = byteBuffer.getShort();
        this.f3287 = byteBuffer.getShort();
        this.f3258 = byteBuffer.getShort();
        this.f3259 = C0358.f6667.f4818 ? byteBuffer.getShort() : (short) 0;
        this.f3260 = byteBuffer.getShort();
        this.f3295 = byteBuffer.getShort();
        this.f3281 = byteBuffer.getShort();
        this.f3261 = byteBuffer.getShort();
        this.f3262 = byteBuffer.getShort();
        this.f3263 = byteBuffer.getShort();
        this.f3264 = byteBuffer.getShort();
        this.f3288 = byteBuffer.getShort();
        this.f3285 = byteBuffer.getShort();
        byteBuffer.get(this.f3280);
        this.f3289 = byteBuffer.get();
        this.f3283 = byteBuffer.get();
        this.f3282 = byteBuffer.get();
        this.f3275 = byteBuffer.get();
        this.f3265 = byteBuffer.get();
        this.f3279 = byteBuffer.get();
        this.f3266 = byteBuffer.getShort();
        this.f3267 = C0358.f6667.f4800 >= 20061023 ? byteBuffer.getShort() : (short) 0;
        if (C0358.f6667.f4778) {
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            bArr = bArr2;
        } else {
            bArr = null;
        }
        this.f3268 = bArr;
        this.f3269 = C0358.f6667.f4779 ? byteBuffer.getInt() : 0;
        this.f3270 = C0358.f6667.f4777 ? byteBuffer.getInt() : 0;
        this.f3271 = C0358.f6667.f4819 ? byteBuffer.getInt() : 0;
        this.f3290 = C0358.f6667.f4832 ? byteBuffer.getInt() : 0;
        this.f3272 = C0358.f6667.f4783 ? byteBuffer.get() : C0358.f6688.f6690;
        if (this.f3272 == 99) {
            this.f3272 = C0358.f6688.f6690;
        }
    }
}
