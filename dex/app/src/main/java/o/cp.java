package o;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class cp {

    /* renamed from: Ą, reason: contains not printable characters */
    public String f957;

    /* renamed from: Ć, reason: contains not printable characters */
    private long f958;

    /* renamed from: ć, reason: contains not printable characters */
    private int f959;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f960 = 0;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private boolean f961;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static final HashMap<String, cp> f956 = new HashMap<>();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static final ArrayList<Integer> f954 = new ArrayList<>();

    /* renamed from: 櫯, reason: contains not printable characters */
    private static ArrayList<cp> f955 = new ArrayList<>();

    /* renamed from: ą, reason: contains not printable characters */
    private static final Integer f953 = 0;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static <E extends cp> E m492(String str, Class<E> cls, boolean z, String str2) {
        try {
            return (E) m491(str, cls);
        } catch (uw unused) {
            if (z) {
                nz.m907("Resource not found. Server=" + C0358.f6667.f4851 + " class=" + cls + " filename=" + str);
                return (E) m491(str2, cls);
            }
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static <E extends cp> E m491(String str, Class<E> cls) throws IllegalAccessException, InstantiationException {
        if (str == null) {
            return null;
        }
        synchronized (f956) {
            cp cpVar = f956.get(str);
            if (cpVar != null) {
                synchronized (cpVar) {
                    cpVar.f959++;
                }
                try {
                    return cls.cast(cpVar);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            try {
                E eNewInstance = cls.newInstance();
                eNewInstance.f957 = str;
                if (!eNewInstance.m494()) {
                    return null;
                }
                synchronized (eNewInstance) {
                    ((cp) eNewInstance).f959++;
                }
                synchronized (f956) {
                    f956.put(str, eNewInstance);
                }
                return eNewInstance;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                throw new RuntimeException("Illegal access exception");
            } catch (InstantiationException e3) {
                e3.printStackTrace();
                throw new RuntimeException("Instantiate exception");
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m493() {
        cp[] cpVarArr;
        synchronized (f954) {
            f954.clear();
        }
        synchronized (f956) {
            cpVarArr = new cp[f956.size()];
            int i = 0;
            Iterator<Map.Entry<String, cp>> it = f956.entrySet().iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                cpVarArr[i2] = it.next().getValue();
            }
        }
        for (cp cpVar : cpVarArr) {
            cpVar.m494();
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static IntBuffer m490() {
        IntBuffer intBufferAllocate;
        if (f954.isEmpty()) {
            return null;
        }
        synchronized (f954) {
            intBufferAllocate = IntBuffer.allocate(f954.size());
            Iterator<Integer> it = f954.iterator();
            while (it.hasNext()) {
                intBufferAllocate.put(it.next().intValue());
            }
            intBufferAllocate.position(0);
            f954.clear();
        }
        return intBufferAllocate;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static void m489() {
        ArrayList<cp> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f953) {
            arrayList = f955;
            f955 = new ArrayList<>(f955.size());
        }
        Iterator<cp> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f961 = false;
        }
        Iterator<cp> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cp next = it2.next();
            if (next.f959 <= 0 && !next.f961) {
                if (jCurrentTimeMillis - next.f958 < 60000) {
                    synchronized (f953) {
                        f955.add(next);
                    }
                } else {
                    synchronized (f956) {
                        if (next.f959 <= 0) {
                            f956.remove(next.f957);
                            next.mo495();
                        }
                    }
                }
            }
            next.f961 = true;
        }
    }

    cp() {
    }

    protected void finalize() {
        mo495();
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m496() {
        int i;
        synchronized (this) {
            i = this.f959 - 1;
            this.f959 = i;
        }
        if (i <= 0) {
            if (i < 0) {
                synchronized (f956) {
                    if (f956.get(this.f957) == null) {
                        return;
                    }
                }
            }
            this.f958 = System.currentTimeMillis();
            f955.add(this);
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final boolean m494() {
        switch (this.f960) {
            case 1:
                return true;
            case 2:
                return mo498((byte[]) null);
            default:
                byte[] bArr = (byte[]) C0358.f6685.f1033.m519(mo497(this.f957), false);
                if (bArr == null) {
                    return false;
                }
                this.f960 = 1;
                return mo498(bArr);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected String mo497(String str) {
        return str;
    }

    /* renamed from: ą, reason: contains not printable characters */
    void mo495() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public boolean mo498(byte[] bArr) {
        return false;
    }
}
