package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Vector;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.io.DotTerminatedMessageReader;
import org.apache.commons.net.io.DotTerminatedMessageWriter;
import org.apache.commons.net.io.Util;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class NNTPClient extends NNTP {
    private void __parseArticlePointer(String str, ArticleInfo articleInfo) throws MalformedServerReplyException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length >= 3) {
            try {
                articleInfo.articleNumber = Long.parseLong(strArrSplit[1]);
                articleInfo.articleId = strArrSplit[2];
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse article pointer.\nServer reply: " + str);
    }

    private static void __parseGroupReply(String str, NewsgroupInfo newsgroupInfo) throws MalformedServerReplyException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length >= 5) {
            try {
                newsgroupInfo._setArticleCount(Long.parseLong(strArrSplit[1]));
                newsgroupInfo._setFirstArticle(Long.parseLong(strArrSplit[2]));
                newsgroupInfo._setLastArticle(Long.parseLong(strArrSplit[3]));
                newsgroupInfo._setNewsgroup(strArrSplit[4]);
                newsgroupInfo._setPostingPermission(0);
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse newsgroup info.\nServer reply: " + str);
    }

    static NewsgroupInfo __parseNewsgroupListEntry(String str) throws NumberFormatException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 4) {
            return null;
        }
        NewsgroupInfo newsgroupInfo = new NewsgroupInfo();
        newsgroupInfo._setNewsgroup(strArrSplit[0]);
        try {
            long j = Long.parseLong(strArrSplit[1]);
            long j2 = Long.parseLong(strArrSplit[2]);
            newsgroupInfo._setFirstArticle(j2);
            newsgroupInfo._setLastArticle(j);
            if (j2 == 0 && j == 0) {
                newsgroupInfo._setArticleCount(0L);
            } else {
                newsgroupInfo._setArticleCount((j - j2) + 1);
            }
            switch (strArrSplit[3].charAt(0)) {
                case 'M':
                case 'm':
                    newsgroupInfo._setPostingPermission(1);
                    return newsgroupInfo;
                case 'N':
                case 'n':
                    newsgroupInfo._setPostingPermission(3);
                    return newsgroupInfo;
                case 'Y':
                case 'y':
                    newsgroupInfo._setPostingPermission(2);
                    return newsgroupInfo;
                default:
                    newsgroupInfo._setPostingPermission(0);
                    return newsgroupInfo;
            }
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Article __parseArticleEntry(String str) {
        Article article = new Article();
        article.setSubject(str);
        String[] strArrSplit = str.split("\t");
        if (strArrSplit.length > 6) {
            try {
                article.setArticleNumber(Long.parseLong(strArrSplit[0]));
                article.setSubject(strArrSplit[1]);
                article.setFrom(strArrSplit[2]);
                article.setDate(strArrSplit[3]);
                article.setArticleId(strArrSplit[4]);
                article.addReference(strArrSplit[5]);
            } catch (NumberFormatException unused) {
            }
        }
        return article;
    }

    private NewsgroupInfo[] __readNewsgroupListing() throws IOException {
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Vector vector = new Vector(2048);
        while (true) {
            try {
                String line = dotTerminatedMessageReader.readLine();
                if (line != null) {
                    NewsgroupInfo newsgroupInfo__parseNewsgroupListEntry = __parseNewsgroupListEntry(line);
                    if (newsgroupInfo__parseNewsgroupListEntry != null) {
                        vector.addElement(newsgroupInfo__parseNewsgroupListEntry);
                    } else {
                        throw new MalformedServerReplyException(line);
                    }
                } else {
                    int size = vector.size();
                    if (size <= 0) {
                        return new NewsgroupInfo[0];
                    }
                    NewsgroupInfo[] newsgroupInfoArr = new NewsgroupInfo[size];
                    vector.copyInto(newsgroupInfoArr);
                    return newsgroupInfoArr;
                }
            } finally {
                dotTerminatedMessageReader.close();
            }
        }
    }

    private BufferedReader __retrieve(int i, String str, ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(sendCommand(i, str))) {
                return null;
            }
        } else if (!NNTPReply.isPositiveCompletion(sendCommand(i))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    private BufferedReader __retrieve(int i, long j, ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (!NNTPReply.isPositiveCompletion(sendCommand(i, Long.toString(j)))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveArticle(String str, ArticleInfo articleInfo) {
        return __retrieve(0, str, articleInfo);
    }

    public Reader retrieveArticle(String str) {
        return retrieveArticle(str, (ArticleInfo) null);
    }

    public Reader retrieveArticle() {
        return retrieveArticle((String) null);
    }

    public BufferedReader retrieveArticle(long j, ArticleInfo articleInfo) {
        return __retrieve(0, j, articleInfo);
    }

    public BufferedReader retrieveArticle(long j) {
        return retrieveArticle(j, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleHeader(String str, ArticleInfo articleInfo) {
        return __retrieve(3, str, articleInfo);
    }

    public Reader retrieveArticleHeader(String str) {
        return retrieveArticleHeader(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleHeader() {
        return retrieveArticleHeader((String) null);
    }

    public BufferedReader retrieveArticleHeader(long j, ArticleInfo articleInfo) {
        return __retrieve(3, j, articleInfo);
    }

    public BufferedReader retrieveArticleHeader(long j) {
        return retrieveArticleHeader(j, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleBody(String str, ArticleInfo articleInfo) {
        return __retrieve(1, str, articleInfo);
    }

    public Reader retrieveArticleBody(String str) {
        return retrieveArticleBody(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleBody() {
        return retrieveArticleBody((String) null);
    }

    public BufferedReader retrieveArticleBody(long j, ArticleInfo articleInfo) {
        return __retrieve(1, j, articleInfo);
    }

    public BufferedReader retrieveArticleBody(long j) {
        return retrieveArticleBody(j, (ArticleInfo) null);
    }

    public boolean selectNewsgroup(String str, NewsgroupInfo newsgroupInfo) throws MalformedServerReplyException {
        if (!NNTPReply.isPositiveCompletion(group(str))) {
            return false;
        }
        if (newsgroupInfo != null) {
            __parseGroupReply(getReplyString(), newsgroupInfo);
            return true;
        }
        return true;
    }

    public boolean selectNewsgroup(String str) {
        return selectNewsgroup(str, null);
    }

    public String listHelp() throws IOException {
        if (!NNTPReply.isInformational(help())) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Util.copyReader(dotTerminatedMessageReader, stringWriter);
        dotTerminatedMessageReader.close();
        stringWriter.close();
        return stringWriter.toString();
    }

    public String[] listOverviewFmt() throws IOException {
        if (!NNTPReply.isPositiveCompletion(sendCommand("LIST", "OVERVIEW.FMT"))) {
            return null;
        }
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = dotTerminatedMessageReader.readLine();
            if (line != null) {
                arrayList.add(line);
            } else {
                dotTerminatedMessageReader.close();
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
    }

    public boolean selectArticle(String str, ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(stat(str))) {
                return false;
            }
        } else if (!NNTPReply.isPositiveCompletion(stat())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectArticle(String str) {
        return selectArticle(str, (ArticleInfo) null);
    }

    public boolean selectArticle(ArticleInfo articleInfo) {
        return selectArticle((String) null, articleInfo);
    }

    public boolean selectArticle(long j, ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (!NNTPReply.isPositiveCompletion(stat(j))) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectArticle(long j) {
        return selectArticle(j, (ArticleInfo) null);
    }

    public boolean selectPreviousArticle(ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (!NNTPReply.isPositiveCompletion(last())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectPreviousArticle() {
        return selectPreviousArticle((ArticleInfo) null);
    }

    public boolean selectNextArticle(ArticleInfo articleInfo) throws MalformedServerReplyException {
        if (!NNTPReply.isPositiveCompletion(next())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectNextArticle() {
        return selectNextArticle((ArticleInfo) null);
    }

    public NewsgroupInfo[] listNewsgroups() {
        if (!NNTPReply.isPositiveCompletion(list())) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewsgroupListing() throws IOException {
        if (NNTPReply.isPositiveCompletion(list())) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups() {
        return new NewsgroupIterator(iterateNewsgroupListing());
    }

    public NewsgroupInfo[] listNewsgroups(String str) {
        if (!NNTPReply.isPositiveCompletion(listActive(str))) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewsgroupListing(String str) throws IOException {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST ACTIVE " + str + " command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups(String str) {
        return new NewsgroupIterator(iterateNewsgroupListing(str));
    }

    public NewsgroupInfo[] listNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewNewsgroupListing(NewGroupsOrNewsQuery newGroupsOrNewsQuery) throws IOException {
        if (NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWGROUPS command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        return new NewsgroupIterator(iterateNewNewsgroupListing(newGroupsOrNewsQuery));
    }

    public String[] listNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) throws IOException {
        if (!NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        Vector vector = new Vector();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        while (true) {
            try {
                String line = dotTerminatedMessageReader.readLine();
                if (line == null) {
                    break;
                }
                vector.addElement(line);
            } finally {
                dotTerminatedMessageReader.close();
            }
        }
        int size = vector.size();
        if (size <= 0) {
            return new String[0];
        }
        String[] strArr = new String[size];
        vector.copyInto(strArr);
        return strArr;
    }

    public Iterable<String> iterateNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) throws IOException {
        if (NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWNEWS command failed: " + getReplyString());
    }

    public boolean completePendingCommand() {
        return NNTPReply.isPositiveCompletion(getReply());
    }

    public Writer postArticle() {
        if (!NNTPReply.isPositiveIntermediate(post())) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    public Writer forwardArticle(String str) {
        if (!NNTPReply.isPositiveIntermediate(ihave(str))) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    public boolean logout() {
        return NNTPReply.isPositiveCompletion(quit());
    }

    public boolean authenticate(String str, String str2) {
        if (authinfoUser(str) == 381 && authinfoPass(str2) == 281) {
            this._isAllowedToPost = true;
            return true;
        }
        return false;
    }

    private BufferedReader __retrieveArticleInfo(String str) {
        if (!NNTPReply.isPositiveCompletion(xover(str))) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveArticleInfo(long j) {
        return __retrieveArticleInfo(Long.toString(j));
    }

    public BufferedReader retrieveArticleInfo(long j, long j2) {
        return __retrieveArticleInfo(j + "-" + j2);
    }

    public Iterable<Article> iterateArticleInfo(long j, long j2) throws IOException {
        BufferedReader bufferedReaderRetrieveArticleInfo = retrieveArticleInfo(j, j2);
        if (bufferedReaderRetrieveArticleInfo == null) {
            throw new IOException("XOVER command failed: " + getReplyString());
        }
        return new ArticleIterator(new ReplyIterator(bufferedReaderRetrieveArticleInfo, false));
    }

    private BufferedReader __retrieveHeader(String str, String str2) {
        if (!NNTPReply.isPositiveCompletion(xhdr(str, str2))) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveHeader(String str, long j) {
        return __retrieveHeader(str, Long.toString(j));
    }

    public BufferedReader retrieveHeader(String str, long j, long j2) {
        return __retrieveHeader(str, j + "-" + j2);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i, int i2) {
        return retrieveHeader(str, i, i2);
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i, int i2) {
        return retrieveArticleInfo(i, i2);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i) {
        return retrieveHeader(str, i);
    }

    @Deprecated
    public boolean selectArticle(int i, ArticlePointer articlePointer) throws MalformedServerReplyException {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        boolean zSelectArticle = selectArticle(i, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return zSelectArticle;
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i) {
        return retrieveArticleInfo(i);
    }

    @Deprecated
    public boolean selectArticle(int i) {
        return selectArticle(i);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i) {
        return retrieveArticleHeader(i);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticleHeader = retrieveArticleHeader(i, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticleHeader;
    }

    @Deprecated
    public Reader retrieveArticleBody(int i) {
        return retrieveArticleBody(i);
    }

    @Deprecated
    public Reader retrieveArticle(int i, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticle = retrieveArticle(i, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticle(int i) {
        return retrieveArticle(i);
    }

    @Deprecated
    public Reader retrieveArticleBody(int i, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticleBody = retrieveArticleBody(i, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticle = retrieveArticle(str, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticleBody(String str, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticleBody = retrieveArticleBody(str, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticleHeader(String str, ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        BufferedReader bufferedReaderRetrieveArticleHeader = retrieveArticleHeader(str, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return bufferedReaderRetrieveArticleHeader;
    }

    @Deprecated
    public boolean selectArticle(String str, ArticlePointer articlePointer) throws MalformedServerReplyException {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        boolean zSelectArticle = selectArticle(str, articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return zSelectArticle;
    }

    @Deprecated
    public boolean selectArticle(ArticlePointer articlePointer) {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        boolean zSelectArticle = selectArticle(articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return zSelectArticle;
    }

    @Deprecated
    public boolean selectNextArticle(ArticlePointer articlePointer) throws MalformedServerReplyException {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        boolean zSelectNextArticle = selectNextArticle(articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return zSelectNextArticle;
    }

    @Deprecated
    public boolean selectPreviousArticle(ArticlePointer articlePointer) throws MalformedServerReplyException {
        ArticleInfo articleInfo__ap2ai = __ap2ai(articlePointer);
        boolean zSelectPreviousArticle = selectPreviousArticle(articleInfo__ap2ai);
        __ai2ap(articleInfo__ap2ai, articlePointer);
        return zSelectPreviousArticle;
    }

    private ArticleInfo __ap2ai(ArticlePointer articlePointer) {
        if (articlePointer == null) {
            return null;
        }
        return new ArticleInfo();
    }

    private void __ai2ap(ArticleInfo articleInfo, ArticlePointer articlePointer) {
        if (articlePointer != null) {
            articlePointer.articleId = articleInfo.articleId;
            articlePointer.articleNumber = (int) articleInfo.articleNumber;
        }
    }
}
