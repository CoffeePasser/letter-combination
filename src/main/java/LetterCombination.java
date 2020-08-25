import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LetterCombination
 * @Description the solutin of letter combination
 * @Author Shawn
 * @Date 2020/8/25 16:33
 * @Version 1.0
 */
public class LetterCombination {
    /**
     * description: this method according to the digits and dictionary,return the letter combination
     * @param digits
     * @param IDictionary
     * @return
     */
    public List<String> letterCombination(String[] digits, IDictionary IDictionary) {
        List<String> results = new ArrayList<>();
        String oneResource = "";
        if (digits.length == 0) {
            return results;
        }
        //acquire the dictionay
        String[] dictionary = IDictionary.getDictionary();
        int[] digitInts = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            digitInts[i] = Integer.parseInt(digits[i]);
        }
        //possessing the recursion
        combinationRecursion(digitInts, 0, dictionary, results, oneResource);
        //return the final results
        return results;
    }

    /**
     * this is a recursion method
     * @param digits
     * @param n
     * @param dictionary
     * @param results
     * @param oneResource
     */
    public void combinationRecursion(int[] digits, int n, String[] dictionary, List<String> results, String oneResource) {
        if (n == digits.length) {
            results.add(oneResource);
            return;
        }
        for (int j = 0; j < dictionary[digits[n]].length(); j++) {
            oneResource = oneResource + dictionary[digits[n]].charAt(j);
            combinationRecursion(digits, n + 1, dictionary, results, oneResource);
            oneResource = oneResource.substring(0, oneResource.length() - 1);
        }
    }


}
