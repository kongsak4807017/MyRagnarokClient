package android.support.v4.view;

import android.support.v4.view.LayoutInflaterCompatHC;
import android.view.LayoutInflater;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class LayoutInflaterCompatLollipop {
    LayoutInflaterCompatLollipop() {
    }

    static void setFactory(LayoutInflater layoutInflater, LayoutInflaterFactory layoutInflaterFactory) {
        layoutInflater.setFactory2(layoutInflaterFactory != null ? new LayoutInflaterCompatHC.FactoryWrapperHC(layoutInflaterFactory) : null);
    }
}
