package symca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testapp {

    @Test
    public void testApp() {
    Mgm t=new Mgm();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
}
