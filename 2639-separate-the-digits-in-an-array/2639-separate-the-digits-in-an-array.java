class Solution {
    public int[] separateDigits(int[] nums) {
        
        int size = 0;
        for (int i : nums) {
            while (i > 0) {
                size++;
                i /= 10;
            }
        }

        int[] arr = new int[size];
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp > 0) {
                arr[--size] = temp % 10;
                temp /= 10;
            }
        }
        return arr;
    }
}





/*class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int num:nums){
            if(num>9){
                List<Integer> arr=new ArrayList<>();
                while(num>0){
                arr.add(num%10);
                num/=10;
                }
                Collections.reverse(arr);
                li.addAll(arr);
            }
            else
            li.add(num);
        }
        int n=li.size();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=li.get(i);
        }
        return a;
    }
}*/