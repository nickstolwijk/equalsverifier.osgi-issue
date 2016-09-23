package nl.stolwijk.nick.equalsverifier.osgitest.domain;

import org.eclipse.jdt.annotation.NonNull;

public final class Foo {
    @NonNull
    private final String bar;

    public Foo(String bar) {
        this.bar = bar;
    }

    @Override
    public boolean equals(Object other) {
        return bar.equals(((Foo) other).bar);
    }
}