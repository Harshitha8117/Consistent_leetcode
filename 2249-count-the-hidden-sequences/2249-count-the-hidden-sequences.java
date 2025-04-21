class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {

        long min = 0;
        long max = 0;

        long sum = (long)differences[0];

        for(int i=0;i<differences.length;i++)
        {
            if(i!=0)
                sum += (long)differences[i];
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

      
        long lower_bound = (long)lower - min;
        long upper_bound = (long)upper - max;

        if(upper_bound<lower_bound)
            return 0;
        else
            return ((int)(upper_bound - lower_bound) + 1);
        
    }
}