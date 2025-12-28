package org.apache.http.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class RegistryBuilder<I> {
    private final Map<String, I> items = new HashMap();

    public static <I> RegistryBuilder<I> create() {
        return new RegistryBuilder<>();
    }

    RegistryBuilder() {
    }

    public final RegistryBuilder<I> register(String str, I i) {
        Args.notEmpty(str, "ID");
        Args.notNull(i, "Item");
        this.items.put(str.toLowerCase(Locale.ROOT), i);
        return this;
    }

    public final Registry<I> build() {
        return new Registry<>(this.items);
    }

    public final String toString() {
        return this.items.toString();
    }
}
