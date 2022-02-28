import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AppTest extends App {

    @Test
    public void Test() {

        assertEquals(true, isPalindrome("hellohello"));

        assertEquals(1, wordCount("hello hello hello x", "x"));

        Character expectedCharacter = 't';
        assertEquals(expectedCharacter, firstNoRepeatedChar("stress"));

        List<String> l1 = new ArrayList<>() {
            {
                add("a");
                add("b");
            }
        };
        List<Integer> l2 = new ArrayList<>() {
            {
                add(1);
                add(2);
            }
        };
        assertEquals(Arrays.asList("a", "b", "1", "2"), concat(l1, l2));
    }

}
