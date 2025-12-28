package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import o.aes;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
abstract class aer {

    /* renamed from: 鷭, reason: contains not printable characters */
    final int f632;

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int[] f631 = new int[4];

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final aet f628 = new aet();

    /* renamed from: ȃ, reason: contains not printable characters */
    final short[][] f626 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 12, 16);

    /* renamed from: Ą, reason: contains not printable characters */
    final short[] f621 = new short[12];

    /* renamed from: ą, reason: contains not printable characters */
    final short[] f622 = new short[12];

    /* renamed from: Ć, reason: contains not printable characters */
    final short[] f623 = new short[12];

    /* renamed from: ć, reason: contains not printable characters */
    final short[] f624 = new short[12];

    /* renamed from: ˮ͍, reason: contains not printable characters */
    final short[][] f629 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 12, 16);

    /* renamed from: 岱, reason: contains not printable characters */
    final short[][] f630 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 4, 64);

    /* renamed from: Ȋ, reason: contains not printable characters */
    final short[][] f627 = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};

    /* renamed from: ċ, reason: contains not printable characters */
    final short[] f625 = new short[16];

    aer(int i) {
        this.f632 = (1 << i) - 1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    void mo423() {
        this.f631[0] = 0;
        this.f631[1] = 0;
        this.f631[2] = 0;
        this.f631[3] = 0;
        this.f628.f652 = 0;
        for (int i = 0; i < this.f626.length; i++) {
            Arrays.fill(this.f626[i], (short) 1024);
        }
        Arrays.fill(this.f621, (short) 1024);
        Arrays.fill(this.f622, (short) 1024);
        Arrays.fill(this.f623, (short) 1024);
        Arrays.fill(this.f624, (short) 1024);
        for (int i2 = 0; i2 < this.f629.length; i2++) {
            Arrays.fill(this.f629[i2], (short) 1024);
        }
        for (int i3 = 0; i3 < this.f630.length; i3++) {
            Arrays.fill(this.f630[i3], (short) 1024);
        }
        for (int i4 = 0; i4 < this.f627.length; i4++) {
            Arrays.fill(this.f627[i4], (short) 1024);
        }
        Arrays.fill(this.f625, (short) 1024);
    }

    /* renamed from: o.aer$if, reason: invalid class name */
    abstract class Cif {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        final /* synthetic */ aer f633;

        /* renamed from: 櫯, reason: contains not printable characters */
        final int f634;

        /* renamed from: 鷭, reason: contains not printable characters */
        final int f635;

        Cif(aes aesVar, int i, int i2) {
            this.f633 = aesVar;
            this.f635 = i;
            this.f634 = (1 << i2) - 1;
        }

        /* renamed from: o.aer$if$鷭, reason: contains not printable characters */
        abstract class AbstractC0016 {

            /* renamed from: 櫯, reason: contains not printable characters */
            final /* synthetic */ Cif f636;

            /* renamed from: 鷭, reason: contains not printable characters */
            final short[] f637 = new short[768];

            AbstractC0016(aes.Cif cif) {
                this.f636 = cif;
            }
        }
    }

    /* renamed from: o.aer$鷭, reason: contains not printable characters */
    abstract class AbstractC0017 {

        /* renamed from: Ą, reason: contains not printable characters */
        final /* synthetic */ aer f638;

        /* renamed from: 鷭, reason: contains not printable characters */
        final short[] f642 = new short[2];

        /* renamed from: 櫯, reason: contains not printable characters */
        final short[][] f641 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 16, 8);

        /* renamed from: ˮ͈, reason: contains not printable characters */
        final short[][] f640 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 16, 8);

        /* renamed from: ȃ, reason: contains not printable characters */
        final short[] f639 = new short[256];

        AbstractC0017(aes aesVar) {
            this.f638 = aesVar;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m424() {
            Arrays.fill(this.f642, (short) 1024);
            for (int i = 0; i < this.f641.length; i++) {
                Arrays.fill(this.f641[i], (short) 1024);
            }
            for (int i2 = 0; i2 < this.f641.length; i2++) {
                Arrays.fill(this.f640[i2], (short) 1024);
            }
            Arrays.fill(this.f639, (short) 1024);
        }
    }
}
