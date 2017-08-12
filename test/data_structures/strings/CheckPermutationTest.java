package data_structures.strings;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckPermutationTest extends TestCase {

    CheckPermutation checkPermutation;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        checkPermutation = new CheckPermutation();
    }

    @Test(expected = NullPointerException.class)
    public void checkPermutationNull() throws Exception {
        String a = null;
        String b = null;

        checkPermutation.checkPermutation(a, b);
    }

    @Test
    public void checkPermutationDifferentLength(){
        String a = "a";
        String b = "";

        assertFalse(checkPermutation.checkPermutation(a, b));
    }


    @Test
    public void checkPermutation(){
        String a = "abc";
        String b = "bca";

        assertTrue(checkPermutation.checkPermutation(a, b));
    }

    @Test
    public void checkPermutationDifferent(){
        String a = "abc";
        String b = "bcd";

        assertFalse(checkPermutation.checkPermutation(a, b));
    }

}