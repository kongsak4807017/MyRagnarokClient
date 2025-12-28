package org.apache.commons.net.nntp;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface Threadable {
    boolean isDummy();

    Threadable makeDummy();

    String messageThreadId();

    String[] messageThreadReferences();

    void setChild(Threadable threadable);

    void setNext(Threadable threadable);

    String simplifiedSubject();

    boolean subjectIsReply();
}
