package o;

import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class iw implements of {

    /* renamed from: Ĥ, reason: contains not printable characters */
    Thread f1700;

    /* renamed from: ĥ, reason: contains not printable characters */
    LinkedList<Runnable> f1701 = new LinkedList<>();

    @Override // o.of
    /* renamed from: 鷭 */
    public synchronized void mo139(Runnable runnable) {
        synchronized (this.f1701) {
            this.f1701.add(runnable);
        }
        synchronized (this.f1700) {
            this.f1700.notify();
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final synchronized Runnable m696() {
        Runnable runnablePoll;
        synchronized (this.f1701) {
            runnablePoll = this.f1701.poll();
        }
        return runnablePoll;
    }

    /* renamed from: ˮ͈ */
    void mo451() {
        while (true) {
            Runnable runnableM696 = m696();
            if (runnableM696 != null) {
                runnableM696.run();
            } else {
                synchronized (this.f1700) {
                    this.f1700.wait(1000L);
                }
            }
        }
    }

    iw(String str) {
        this.f1700 = new Thread(new ix(this), str);
        this.f1700.start();
    }
}
