class Solution {
    public int minElement(int[] nums) {
        int i=0;
        List<Integer> a=new ArrayList<>();
        while(i<nums.length){
            if(nums[i]>9){
                int temp=nums[i];
                int rev=0;
                while(temp>0){
                    int dig=temp%10;
                    rev+=dig;
                    temp/=10;
                }
                nums[i]=rev;
            }
            a.add(nums[i]);
            i++;
        }
        Collections.sort(a);
        return a.get(0);
    }
}