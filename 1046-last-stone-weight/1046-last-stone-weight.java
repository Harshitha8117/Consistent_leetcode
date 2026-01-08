import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int st:stones){
            heap.add(st);
        }
        while(heap.size()>1){
            int y=heap.poll();
            int x=heap.poll();

            if(y!=x){
                heap.add(y-x);
            }
        }
        return heap.isEmpty()?0:heap.peek();
    }
}