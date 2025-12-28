package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class PrintHelperKitkat {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final String LOG_TAG = "PrintHelperKitkat";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    final Context mContext;
    BitmapFactory.Options mDecodeOptions = null;
    private final Object mLock = new Object();
    int mScaleMode = 2;
    int mColorMode = 2;
    int mOrientation = 1;

    public interface OnPrintFinishCallback {
        void onFinish();
    }

    PrintHelperKitkat(Context context) {
        this.mContext = context;
    }

    public void setScaleMode(int i) {
        this.mScaleMode = i;
    }

    public int getScaleMode() {
        return this.mScaleMode;
    }

    public void setColorMode(int i) {
        this.mColorMode = i;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getColorMode() {
        return this.mColorMode;
    }

    public void printBitmap(final String str, final Bitmap bitmap, final OnPrintFinishCallback onPrintFinishCallback) {
        if (bitmap == null) {
            return;
        }
        final int i = this.mScaleMode;
        PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
        PrintAttributes.MediaSize mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new PrintDocumentAdapter() { // from class: android.support.v4.print.PrintHelperKitkat.1
            private PrintAttributes mAttributes;

            @Override // android.print.PrintDocumentAdapter
            public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                this.mAttributes = printAttributes2;
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(str).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            }

            @Override // android.print.PrintDocumentAdapter
            public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) throws IOException {
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelperKitkat.this.mContext, this.mAttributes);
                Bitmap bitmapConvertBitmapForColorMode = PrintHelperKitkat.this.convertBitmapForColorMode(bitmap, this.mAttributes.getColorMode());
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    pageStartPage.getCanvas().drawBitmap(bitmapConvertBitmapForColorMode, PrintHelperKitkat.this.getMatrix(bitmapConvertBitmapForColorMode.getWidth(), bitmapConvertBitmapForColorMode.getHeight(), new RectF(pageStartPage.getInfo().getContentRect()), i), null);
                    printedPdfDocument.finishPage(pageStartPage);
                    try {
                        printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                        writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                    } catch (IOException e) {
                        Log.e(PrintHelperKitkat.LOG_TAG, "Error writing printed content", e);
                        writeResultCallback.onWriteFailed(null);
                    }
                    printedPdfDocument.close();
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (bitmapConvertBitmapForColorMode != bitmap) {
                        bitmapConvertBitmapForColorMode.recycle();
                    }
                } finally {
                }
            }

            @Override // android.print.PrintDocumentAdapter
            public void onFinish() {
                if (onPrintFinishCallback != null) {
                    onPrintFinishCallback.onFinish();
                }
            }
        }, new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.mColorMode).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Matrix getMatrix(int i, int i2, RectF rectF, int i3) {
        float fMin;
        Matrix matrix = new Matrix();
        float fWidth = rectF.width() / i;
        if (i3 == 2) {
            fMin = Math.max(fWidth, rectF.height() / i2);
        } else {
            fMin = Math.min(fWidth, rectF.height() / i2);
        }
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((rectF.width() - (i * fMin)) / 2.0f, (rectF.height() - (i2 * fMin)) / 2.0f);
        return matrix;
    }

    public void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, uri, onPrintFinishCallback, this.mScaleMode);
        PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.mColorMode);
        if (this.mOrientation == 1) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (this.mOrientation == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, anonymousClass2, builder.build());
    }

    /* renamed from: android.support.v4.print.PrintHelperKitkat$2, reason: invalid class name */
    class AnonymousClass2 extends PrintDocumentAdapter {
        private PrintAttributes mAttributes;
        Bitmap mBitmap = null;
        AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;
        final /* synthetic */ OnPrintFinishCallback val$callback;
        final /* synthetic */ int val$fittingMode;
        final /* synthetic */ Uri val$imageFile;
        final /* synthetic */ String val$jobName;

        AnonymousClass2(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.val$jobName = str;
            this.val$imageFile = uri;
            this.val$callback = onPrintFinishCallback;
            this.val$fittingMode = i;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.support.v4.print.PrintHelperKitkat$2$1] */
        @Override // android.print.PrintDocumentAdapter
        public void onLayout(final PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.mAttributes = printAttributes2;
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.mBitmap != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.val$jobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() { // from class: android.support.v4.print.PrintHelperKitkat.2.1
                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: android.support.v4.print.PrintHelperKitkat.2.1.1
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                AnonymousClass2.this.cancelLoad();
                                cancel(false);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public Bitmap doInBackground(Uri... uriArr) {
                        try {
                            return PrintHelperKitkat.this.loadConstrainedBitmap(AnonymousClass2.this.val$imageFile, PrintHelperKitkat.MAX_PRINT_SIZE);
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Bitmap bitmap) {
                        super.onPostExecute((AnonymousClass1) bitmap);
                        AnonymousClass2.this.mBitmap = bitmap;
                        if (bitmap != null) {
                            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(AnonymousClass2.this.val$jobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
                        } else {
                            layoutResultCallback.onLayoutFailed(null);
                        }
                        AnonymousClass2.this.mLoadBitmap = null;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onCancelled(Bitmap bitmap) {
                        layoutResultCallback.onLayoutCancelled();
                        AnonymousClass2.this.mLoadBitmap = null;
                    }
                }.execute(new Uri[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancelLoad() {
            synchronized (PrintHelperKitkat.this.mLock) {
                if (PrintHelperKitkat.this.mDecodeOptions != null) {
                    PrintHelperKitkat.this.mDecodeOptions.requestCancelDecode();
                    PrintHelperKitkat.this.mDecodeOptions = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            cancelLoad();
            if (this.mLoadBitmap != null) {
                this.mLoadBitmap.cancel(true);
            }
            if (this.val$callback != null) {
                this.val$callback.onFinish();
            }
            if (this.mBitmap != null) {
                this.mBitmap.recycle();
                this.mBitmap = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) throws IOException {
            PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelperKitkat.this.mContext, this.mAttributes);
            Bitmap bitmapConvertBitmapForColorMode = PrintHelperKitkat.this.convertBitmapForColorMode(this.mBitmap, this.mAttributes.getColorMode());
            try {
                PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                pageStartPage.getCanvas().drawBitmap(bitmapConvertBitmapForColorMode, PrintHelperKitkat.this.getMatrix(this.mBitmap.getWidth(), this.mBitmap.getHeight(), new RectF(pageStartPage.getInfo().getContentRect()), this.val$fittingMode), null);
                printedPdfDocument.finishPage(pageStartPage);
                try {
                    printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                    writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                } catch (IOException e) {
                    Log.e(PrintHelperKitkat.LOG_TAG, "Error writing printed content", e);
                    writeResultCallback.onWriteFailed(null);
                }
                printedPdfDocument.close();
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                }
                if (bitmapConvertBitmapForColorMode != this.mBitmap) {
                    bitmapConvertBitmapForColorMode.recycle();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap loadConstrainedBitmap(Uri uri, int i) throws IOException {
        BitmapFactory.Options options;
        if (i <= 0 || uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i2 = options2.outWidth;
        int i3 = options2.outHeight;
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        int iMax = Math.max(i2, i3);
        int i4 = 1;
        while (iMax > i) {
            iMax >>>= 1;
            i4 <<= 1;
        }
        if (i4 <= 0 || 0 >= Math.min(i2, i3) / i4) {
            return null;
        }
        synchronized (this.mLock) {
            this.mDecodeOptions = new BitmapFactory.Options();
            this.mDecodeOptions.inMutable = true;
            this.mDecodeOptions.inSampleSize = i4;
            options = this.mDecodeOptions;
        }
        try {
            Bitmap bitmapLoadBitmap = loadBitmap(uri, options);
            synchronized (this.mLock) {
                this.mDecodeOptions = null;
            }
            return bitmapLoadBitmap;
        } catch (Throwable th) {
            synchronized (this.mLock) {
                this.mDecodeOptions = null;
                throw th;
            }
        }
    }

    private Bitmap loadBitmap(Uri uri, BitmapFactory.Options options) throws IOException {
        if (uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(uri);
            inputStream = inputStreamOpenInputStream;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return bitmapDecodeStream;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap convertBitmapForColorMode(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
