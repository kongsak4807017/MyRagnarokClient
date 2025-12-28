package o;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: o.ꆞ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0972 {

    /* renamed from: Ą, reason: contains not printable characters */
    int f8288;

    /* renamed from: ą, reason: contains not printable characters */
    int f8289;

    /* renamed from: Ć, reason: contains not printable characters */
    int f8290;

    /* renamed from: ć, reason: contains not printable characters */
    int f8291;

    /* renamed from: đ, reason: contains not printable characters */
    String f8293;

    /* renamed from: Ē, reason: contains not printable characters */
    String f8294;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f8295;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f8296;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f8297;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f8298;

    /* renamed from: 岱, reason: contains not printable characters */
    int f8301;

    /* renamed from: 庸, reason: contains not printable characters */
    C0973[] f8302;

    /* renamed from: 櫯, reason: contains not printable characters */
    String f8303;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f8306;

    /* renamed from: ċ, reason: contains not printable characters */
    LinkedList<C0975> f8292 = new LinkedList<>();

    /* renamed from: 纫, reason: contains not printable characters */
    LinkedList<C0975> f8304 = new LinkedList<>();

    /* renamed from: 䒧, reason: contains not printable characters */
    LinkedList<C0974> f8300 = new LinkedList<>();

    /* renamed from: 躆, reason: contains not printable characters */
    LinkedList<gt> f8305 = new LinkedList<>();

    /* renamed from: ܕ, reason: contains not printable characters */
    LinkedList<Cif> f8299 = new LinkedList<>();

    C0972() {
    }

    /* renamed from: o.ꆞ$鷭, reason: contains not printable characters */
    class C0975 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8329;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8330;

        C0975(int i, String str) {
            this.f8330 = i;
            this.f8329 = str;
        }
    }

    /* renamed from: o.ꆞ$櫯, reason: contains not printable characters */
    class C0974 {

        /* renamed from: Ą, reason: contains not printable characters */
        byte f8314;

        /* renamed from: ą, reason: contains not printable characters */
        short f8315;

        /* renamed from: Ć, reason: contains not printable characters */
        short f8316;

        /* renamed from: ć, reason: contains not printable characters */
        int f8317;

        /* renamed from: ċ, reason: contains not printable characters */
        int f8318;

        /* renamed from: ȃ, reason: contains not printable characters */
        short f8319;

        /* renamed from: Ȋ, reason: contains not printable characters */
        String f8320;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        short f8321;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        boolean f8322;

        /* renamed from: 岱, reason: contains not printable characters */
        int f8324;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8325;

        /* renamed from: 纫, reason: contains not printable characters */
        int f8326;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8327;

        C0974() {
        }
    }

    /* renamed from: o.ꆞ$ˮ͈, reason: contains not printable characters */
    static class C0973 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8310;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        boolean f8311;

        /* renamed from: 櫯, reason: contains not printable characters */
        boolean f8312;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8313;

        C0973(String str, boolean z, boolean z2, int i) {
            this.f8313 = str;
            this.f8312 = z;
            this.f8311 = z2;
            this.f8310 = i;
        }

        C0973(int i, boolean z, boolean z2, int i2) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(343);
            this.f8313 = String.valueOf(strM649 == null ? "MSG343" : strM649) + " " + (i + 1);
            this.f8312 = false;
            this.f8311 = false;
            this.f8310 = 0;
        }
    }

    /* renamed from: o.ꆞ$if, reason: invalid class name */
    class Cif {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8308;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8309;

        Cif(String str, String str2) {
            this.f8309 = str;
            this.f8308 = str2;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1555(int i) {
        if (this.f8302 == null) {
            this.f8302 = new C0973[i];
        } else if (this.f8302.length < i) {
            this.f8302 = (C0973[]) Arrays.copyOf(this.f8302, i);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final C0973 m1554(int i) {
        m1555(i + 1);
        C0973 c0973 = this.f8302[i];
        if (c0973 == null) {
            C0973 c09732 = new C0973(i, false, false, 0);
            this.f8302[i] = c09732;
            return c09732;
        }
        return c0973;
    }
}
