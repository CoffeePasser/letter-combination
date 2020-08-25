import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LetterCombinationTest
 * @Description
 * @Author Shawn
 * @Date 2020/8/25 17:30
 * @Version 1.0
 */
public class LetterCombinationTest {
    @org.junit.Test
    public void test() {
        // test numbers
        String[] numbers = {"2","3"};
        // expected String array
        String[] expectedStringArray = new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
        List<String> expectedResult = Arrays.asList(expectedStringArray);
        LetterCombination letterCombination = new LetterCombination();
        IDictionary IDictionary = new ZeroToNineDictionary();
        // acquire result
        List<String> result = letterCombination.letterCombination(numbers, IDictionary);
        // judge result
        Assert.assertEquals(expectedResult, result);
    }
}
