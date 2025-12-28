package o;

/* renamed from: o.캤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1126 {

    /* renamed from: Ą, reason: contains not printable characters */
    String f8934;

    /* renamed from: ȃ, reason: contains not printable characters */
    String f8935;

    /* renamed from: 鷭, reason: contains not printable characters */
    C1129 f8938 = new C1129();

    /* renamed from: 櫯, reason: contains not printable characters */
    Cif f8937 = new Cif();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C1130 f8936 = new C1130();

    /* renamed from: o.캤$櫯, reason: contains not printable characters */
    class C1129 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f8960;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8961;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8962;

        C1129() {
        }
    }

    /* renamed from: o.캤$if, reason: invalid class name */
    class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        String f8939;

        /* renamed from: ą, reason: contains not printable characters */
        String f8940;

        /* renamed from: Ć, reason: contains not printable characters */
        C1127if f8941 = new C1127if();

        /* renamed from: ć, reason: contains not printable characters */
        C1128 f8942 = new C1128();

        /* renamed from: ȃ, reason: contains not printable characters */
        String f8943;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f8944;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8946;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8947;

        Cif() {
        }

        /* renamed from: o.캤$if$if, reason: invalid class name and collision with other inner class name */
        class C1127if {

            /* renamed from: Ą, reason: contains not printable characters */
            String f8948;

            /* renamed from: ȃ, reason: contains not printable characters */
            String f8950;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            String f8951;

            /* renamed from: 櫯, reason: contains not printable characters */
            String f8952;

            /* renamed from: 鷭, reason: contains not printable characters */
            String f8953;

            C1127if() {
            }
        }

        /* renamed from: o.캤$if$鷭, reason: contains not printable characters */
        class C1128 {

            /* renamed from: ȃ, reason: contains not printable characters */
            String f8955;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            String f8956;

            /* renamed from: 櫯, reason: contains not printable characters */
            String f8957;

            /* renamed from: 鷭, reason: contains not printable characters */
            String f8958;

            C1128() {
            }
        }
    }

    /* renamed from: o.캤$鷭, reason: contains not printable characters */
    class C1130 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8964;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8965;

        C1130() {
        }
    }

    C1126(String str) {
        String[] strArrSplit;
        for (String str2 : str.split("\n")) {
            if (!str2.startsWith("//") && !str2.startsWith("\n") && (strArrSplit = str2.split(":", 2)) != null && strArrSplit.length >= 2) {
                strArrSplit[0] = strArrSplit[0].trim();
                strArrSplit[1] = strArrSplit[1].trim();
                if (strArrSplit[0].equals("texture/user_interface")) {
                    this.f8938.f8962 = strArrSplit[1];
                } else if (strArrSplit[0].equals("texture/water")) {
                    this.f8938.f8961 = strArrSplit[1];
                } else if (strArrSplit[0].equals("texture/user_interface/background")) {
                    this.f8938.f8960 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/male")) {
                    this.f8935 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/female")) {
                    this.f8934 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/monster")) {
                    this.f8937.f8947 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/shields")) {
                    this.f8937.f8946 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/skillicon")) {
                    this.f8937.f8944 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/headgear")) {
                    this.f8937.f8943 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/unknown")) {
                    this.f8937.f8939 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/player")) {
                    this.f8937.f8941.f8953 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/doram")) {
                    this.f8937.f8941.f8952 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/robe")) {
                    this.f8937.f8940 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/effect")) {
                    this.f8937.f8942.f8958 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/effect/cart_prefix")) {
                    this.f8937.f8942.f8957 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/effect/baby_cart_postfix")) {
                    this.f8937.f8942.f8956 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/effect/damage")) {
                    this.f8937.f8942.f8955 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/player/body")) {
                    this.f8937.f8941.f8951 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/player/head")) {
                    this.f8937.f8941.f8950 = strArrSplit[1];
                } else if (strArrSplit[0].equals("sprite/player/weapontrail")) {
                    this.f8937.f8941.f8948 = strArrSplit[1];
                } else if (strArrSplit[0].equals("palette/hair")) {
                    this.f8936.f8965 = strArrSplit[1];
                } else if (strArrSplit[0].equals("palette/cloth")) {
                    this.f8936.f8964 = strArrSplit[1];
                }
            }
        }
    }
}
