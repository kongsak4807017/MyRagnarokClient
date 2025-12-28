package android.support.v4.media;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    private RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    public final String toString() {
        return "Rating:style=" + this.mRatingStyle + " rating=" + (this.mRatingValue < 0.0f ? "unrated" : String.valueOf(this.mRatingValue));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.mRatingStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    public static RatingCompat newHeartRating(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newThumbRating(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        switch (i) {
            case 3:
                f2 = 3.0f;
                break;
            case 4:
                f2 = 4.0f;
                break;
            case 5:
                f2 = 5.0f;
                break;
            default:
                Log.e(TAG, "Invalid rating style (" + i + ") for a star rating");
                return null;
        }
        if (f < 0.0f || f > f2) {
            Log.e(TAG, "Trying to set out of range star-based rating");
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f < 0.0f || f > 100.0f) {
            Log.e(TAG, "Invalid percentage-based rating value");
            return null;
        }
        return new RatingCompat(6, f);
    }

    public final boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public final int getRatingStyle() {
        return this.mRatingStyle;
    }

    public final boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public final boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public final float getStarRating() {
        switch (this.mRatingStyle) {
            case 3:
            case 4:
            case 5:
                if (isRated()) {
                    return this.mRatingValue;
                }
                return RATING_NOT_RATED;
            default:
                return RATING_NOT_RATED;
        }
    }

    public final float getPercentRating() {
        if (this.mRatingStyle != 6 || !isRated()) {
            return RATING_NOT_RATED;
        }
        return this.mRatingValue;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        int ratingStyle = RatingCompatApi21.getRatingStyle(obj);
        if (RatingCompatApi21.isRated(obj)) {
            switch (ratingStyle) {
                case 1:
                    ratingCompatNewUnratedRating = newHeartRating(RatingCompatApi21.hasHeart(obj));
                    break;
                case 2:
                    ratingCompatNewUnratedRating = newThumbRating(RatingCompatApi21.isThumbUp(obj));
                    break;
                case 3:
                case 4:
                case 5:
                    ratingCompatNewUnratedRating = newStarRating(ratingStyle, RatingCompatApi21.getStarRating(obj));
                    break;
                case 6:
                    ratingCompatNewUnratedRating = newPercentageRating(RatingCompatApi21.getPercentRating(obj));
                    break;
                default:
                    return null;
            }
        } else {
            ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
        }
        ratingCompatNewUnratedRating.mRatingObj = obj;
        return ratingCompatNewUnratedRating;
    }

    public final Object getRating() {
        if (this.mRatingObj != null || Build.VERSION.SDK_INT < 21) {
            return this.mRatingObj;
        }
        if (isRated()) {
            switch (this.mRatingStyle) {
                case 1:
                    this.mRatingObj = RatingCompatApi21.newHeartRating(hasHeart());
                    break;
                case 2:
                    this.mRatingObj = RatingCompatApi21.newThumbRating(isThumbUp());
                    break;
                case 3:
                case 4:
                case 5:
                    this.mRatingObj = RatingCompatApi21.newStarRating(this.mRatingStyle, getStarRating());
                    break;
                case 6:
                    this.mRatingObj = RatingCompatApi21.newPercentageRating(getPercentRating());
                    return null;
                default:
                    return null;
            }
        } else {
            this.mRatingObj = RatingCompatApi21.newUnratedRating(this.mRatingStyle);
        }
        return this.mRatingObj;
    }
}
