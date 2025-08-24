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
        // Convert integers to strings manually
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = "" + nums[i];
        }

        // Manual sort using custom comparison logic
        for (int i = 0; i < strNums.length; i++) {
            for (int j = i + 1; j < strNums.length; j++) {
                String ij = strNums[i] + strNums[j];
                String ji = strNums[j] + strNums[i];
                if (ji.compareTo(ij) > 0) {
                    // Swap
                    String temp = strNums[i];
                    strNums[i] = strNums[j];
                    strNums[j] = temp;
                }
            }
        }

        // Edge case: if the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Concatenate manually
        String result = "";
        for (int i = 0; i < strNums.length; i++) {
            result += strNums[i];
        }

        return result;
    }
}
