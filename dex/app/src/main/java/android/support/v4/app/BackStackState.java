package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecord;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: android.support.v4.app.BackStackState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(BackStackRecord backStackRecord) {
        int size = 0;
        for (BackStackRecord.Op op = backStackRecord.mHead; op != null; op = op.next) {
            if (op.removed != null) {
                size += op.removed.size();
            }
        }
        this.mOps = new int[(backStackRecord.mNumOp * 7) + size];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (BackStackRecord.Op op2 = backStackRecord.mHead; op2 != null; op2 = op2.next) {
            int i2 = i;
            int i3 = i + 1;
            this.mOps[i2] = op2.cmd;
            int i4 = i3 + 1;
            this.mOps[i3] = op2.fragment != null ? op2.fragment.mIndex : -1;
            int i5 = i4 + 1;
            this.mOps[i4] = op2.enterAnim;
            int i6 = i5 + 1;
            this.mOps[i5] = op2.exitAnim;
            int i7 = i6 + 1;
            this.mOps[i6] = op2.popEnterAnim;
            int i8 = i7 + 1;
            this.mOps[i7] = op2.popExitAnim;
            if (op2.removed != null) {
                int size2 = op2.removed.size();
                i = i8 + 1;
                this.mOps[i8] = size2;
                for (int i9 = 0; i9 < size2; i9++) {
                    int i10 = i;
                    i++;
                    this.mOps[i10] = op2.removed.get(i9).mIndex;
                }
            } else {
                i = i8 + 1;
                this.mOps[i8] = 0;
            }
        }
        this.mTransition = backStackRecord.mTransition;
        this.mTransitionStyle = backStackRecord.mTransitionStyle;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
    }

    public final BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i = 0;
        int i2 = 0;
        while (i < this.mOps.length) {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int i3 = i;
            int i4 = i + 1;
            op.cmd = this.mOps[i3];
            if (FragmentManagerImpl.DEBUG) {
                new StringBuilder("Instantiate ").append(backStackRecord).append(" op #").append(i2).append(" base fragment #").append(this.mOps[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.mOps[i4];
            if (i6 >= 0) {
                op.fragment = fragmentManagerImpl.mActive.get(i6);
            } else {
                op.fragment = null;
            }
            int i7 = i5 + 1;
            op.enterAnim = this.mOps[i5];
            int i8 = i7 + 1;
            op.exitAnim = this.mOps[i7];
            int i9 = i8 + 1;
            op.popEnterAnim = this.mOps[i8];
            int i10 = i9 + 1;
            op.popExitAnim = this.mOps[i9];
            i = i10 + 1;
            int i11 = this.mOps[i10];
            if (i11 > 0) {
                op.removed = new ArrayList<>(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    if (FragmentManagerImpl.DEBUG) {
                        new StringBuilder("Instantiate ").append(backStackRecord).append(" set remove fragment #").append(this.mOps[i]);
                    }
                    int i13 = i;
                    i++;
                    op.removed.add(fragmentManagerImpl.mActive.get(this.mOps[i13]));
                }
            }
            backStackRecord.addOp(op);
            i2++;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
        backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
    }
}
