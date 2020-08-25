/**
 * @ClassName ZeroToNineDictionary
 * @Description one of the IDictionary implements
 * @Author Shawn
 * @Date 2020/8/25 17:01
 * @Version 1.0
 */
public class ZeroToNineDictionary implements IDictionary {
    private String[] dictionary = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz","aaa"};
    public String[] getDictionary(){
        return this.dictionary;
    }
}
