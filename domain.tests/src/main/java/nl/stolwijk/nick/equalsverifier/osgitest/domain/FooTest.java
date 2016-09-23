package nl.stolwijk.nick.equalsverifier.osgitest.domain;
import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;
public class FooTest {

    @Test
    public void testVerifier() {
        EqualsVerifier.forClass(Foo.class).verify();
    }

}