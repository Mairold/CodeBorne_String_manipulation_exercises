import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {


    private ReverseString stringUtils;

    @Test
    void reverseString() {
        stringUtils = new ReverseString();
        assertEquals("lause! test on See", stringUtils.reverseString("See on test lause!"));
    }
}