/*class Solution {
    public String largestNumber(int[] nums) {
        String[] strarr = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            strarr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strarr,(a,b) ->(b+a).compareTo(a+b) );
        if(strarr[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s: strarr){
            sb.append(s);
        }
      
      return sb.toString();
    }
}*/

class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = "" + nums[i];
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                String a = str[i] + str[j];
                String b = str[j] + str[i];
                if (b.compareTo(a) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        if (str[0].equals("0")) {
            return "0";
        }
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += str[i];
        }
        return result;
    }
}
