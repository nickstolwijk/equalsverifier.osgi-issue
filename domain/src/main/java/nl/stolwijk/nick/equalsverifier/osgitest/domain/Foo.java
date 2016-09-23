package nl.stolwijk.nick.equalsverifier.osgitest.domain;

import java.util.Objects;
import org.eclipse.jdt.annotation.NonNull;

public final class Foo {
    @NonNull
    private final String bar;

    public Foo(String bar) {
        this.bar = bar;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) { return false; }
        if (other == this) { return true; }
        if (other.getClass() != getClass()) {
            return false;
        }
        Foo rhs = (Foo) other;
        return Objects.equals(bar, rhs.bar);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash += (this.bar != null ? this.bar.hashCode() : 0);
        return hash;
    }
}