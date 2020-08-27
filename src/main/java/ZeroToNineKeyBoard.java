import java.util.ArrayList;
import java.util.List;

public class ZeroToNineKeyBoard {

    List<String> finalResult = new ArrayList<>();

    public static final char dictionary[][] = {
            {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };

    /**
     * Here we process the input int array and call the method to get the result
     * @param digits
     * @return
     */
    public String getResult(int[] digits){
        StringBuilder sb = new StringBuilder();
        for (int temp : digits){
            if(temp < 0 || temp > 9){
                return "Please enter a number between 0 and 9 !";
            }
            if(temp == 1 || temp == 0) continue;
            sb.append(String.valueOf(temp));
        }
        String digitsString = sb.toString();
        if (digitsString.length() == 0)
            return "";
        return commonCombination(digitsString);
    }

    /**
     * Here we call the recursive method to get the result in string form
     * @param digitsString
     * @return
     */
    public String commonCombination(String digitsString){
        List<String> result = new ArrayList<>();
        combinationRecursion(digitsString,result);
        StringBuilder sb = new StringBuilder();
        for(String temp: finalResult){
            sb.append(temp + " ");
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    /**
     * this is achieved by recursion
     * @param digitsString
     * @param result
     */
    public void combinationRecursion(String digitsString, List<String> result){
        if(digitsString.length() == 0) {
            finalResult = result;
            return;
        }
        if(result.size() == 0)
            result.add("");
        List<String> transResult = new ArrayList<>();
        char[] letters = dictionary[Integer.parseInt(digitsString.substring(0,1))];
        for(int i = 0; i < result.size(); i++){
            for(int j = 0; j < letters.length; j++){
                transResult.add(result.get(i) + letters[j]);
            }
        }
        combinationRecursion(digitsString.substring(1,digitsString.length()),transResult);
    }

}
