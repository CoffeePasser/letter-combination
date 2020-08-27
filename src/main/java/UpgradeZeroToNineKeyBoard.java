public class UpgradeZeroToNineKeyBoard extends ZeroToNineKeyBoard {
    /**
     * Here we process the input int array and call the  method to get the result
     * @param digits
     * @return
     */
    @Override
    public String getResult(int[] digits){
        if(digits.length == 0)
            return "An empty array was entered";
        StringBuilder sb = new StringBuilder();
        for (int temp : digits){
            if(temp < 0 || temp > 99){
                return "Please enter a number between 0 and 99 !";
            }
            if(temp == 1 || temp == 0) continue;
            for(char c : String.valueOf(temp).toCharArray()){
                if(c == '1' || c == '0') continue;
                sb.append(c);
            }
        }
        String digitsString = sb.toString();
        if (digitsString.length() == 0)
            return "All numbers entered are 0 or 1";
        return commonCombination(digitsString);
    }
}
