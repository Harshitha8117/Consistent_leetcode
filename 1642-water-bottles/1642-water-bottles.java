class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sol=numBottles;
        while(numBottles>=numExchange){
            sol+=numBottles/numExchange;
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
        }
        return sol;
    }
}



