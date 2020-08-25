import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ZeroToNinetyNineTest
 * @Description test ZeroToNinetyNine
 * @Author Shawn
 * @Date 2020/8/25 17:50
 * @Version 1.0
 */
public class ZeroToNinetyNineTest {
    @org.junit.Test
    public void test() {
        // test numbers
        String[] numbers = {"2","3"};
        // expected String array
        String[] expectedStringArray = new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
        List<String> expectedResult = Arrays.asList(expectedStringArray);
        LetterCombination letterCombination = new LetterCombination();
        // IDictionary IDictionary = new ZeroToNineDictionary();
        IDictionary IDictionary = new ZeroToNinetyNineDictionary();
        // acquire result
        List<String> result = letterCombination.letterCombination(numbers, IDictionary);
        // judge result
        Assert.assertEquals(expectedResult, result);
    }
}
