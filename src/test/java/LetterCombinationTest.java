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
        //digits numbers
        String[] numbers = {"2","3"};
        // expected String array
        String[] expectedStringArray = new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
        List<String> expectedResult = Arrays.asList(expectedStringArray);
        LetterCombination letterCombination = new LetterCombination();
        // begin test zero to nine
        IDictionary zeroToNineDictionary = new ZeroToNineDictionary();
        List<String> zeroToNineDictionaryResult = letterCombination.letterCombination(numbers, zeroToNineDictionary);
        // judge result
        Assert.assertEquals(expectedResult, zeroToNineDictionaryResult);
        // end test zero to nine

        // begin test zero to ninety-nine
        IDictionary zeroToNinetyNineDictionary = new ZeroToNinetyNineDictionary();
        // acquire result
        List<String> zeroToNinetyNineDictionaryResult = letterCombination.letterCombination(numbers, zeroToNinetyNineDictionary);
        // judge result
        Assert.assertEquals(expectedResult, zeroToNinetyNineDictionaryResult);
        // end test zero to ninety-nine

        // begin test digits's length is zero
        String[] nullNumbers = {};
        // null expected String array
        String[] nullExpectedStringArray = new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
        List<String> nullExpectedResult = Arrays.asList(nullNumbers);
        // acquire result
        List<String> nullResult = letterCombination.letterCombination(nullNumbers, zeroToNinetyNineDictionary);
        // judge result
        Assert.assertEquals(nullExpectedResult, nullResult);
        // end ttest digits's length is zero


    }
}
