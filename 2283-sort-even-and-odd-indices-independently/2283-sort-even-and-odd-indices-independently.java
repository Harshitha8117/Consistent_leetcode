/*class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(e++);
            }
            else{
                nums[i]=odd.get(o++);
            }
        }
        return nums;
    }
}*/


class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Separate even and odd indexed elements
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        // Sort even list in ascending order
        for (int i = 0; i < even.size(); i++) {
            for (int j = i + 1; j < even.size(); j++) {
                if (even.get(i) > even.get(j)) {
                    int temp = even.get(i);
                    even.set(i, even.get(j));
                    even.set(j, temp);
                }
            }
        }

        // Sort odd list in descending order
        for (int i = 0; i < odd.size(); i++) {
            for (int j = i + 1; j < odd.size(); j++) {
                if (odd.get(i) < odd.get(j)) {
                    int temp = odd.get(i);
                    odd.set(i, odd.get(j));
                    odd.set(j, temp);
                }
            }
        }

        // Merge back into nums
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }

        return nums;
    }
}
