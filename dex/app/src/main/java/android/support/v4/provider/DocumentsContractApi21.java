package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DocumentsContractApi21 {
    private static final String TAG = "DocumentFile";

    DocumentsContractApi21() {
    }

    public static Uri createFile(Context context, Uri uri, String str, String str2) {
        return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
    }

    public static Uri createDirectory(Context context, Uri uri, String str) {
        return createFile(context, uri, "vnd.android.document/directory", str);
    }

    public static Uri prepareTreeUri(Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    public static Uri[] listFiles(Context context, Uri uri) throws Exception {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
            while (cursorQuery.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
            }
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
        } finally {
            closeQuietly(cursorQuery);
        }
        return (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
    }

    public static Uri renameTo(Context context, Uri uri, String str) {
        return DocumentsContract.renameDocument(context.getContentResolver(), uri, str);
    }

    private static void closeQuietly(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
