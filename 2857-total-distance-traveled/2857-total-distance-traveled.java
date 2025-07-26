class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sol=0;
        while(mainTank>=5 && additionalTank>0){
            mainTank-=5;
            sol+=50;
            additionalTank--;
            mainTank++;
        }
        sol+=mainTank*10;
        return sol;
    }
}



