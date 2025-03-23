

class Solution {
        public int reverse(int x) {
               long sum=0;
                      int temp=x;
                             if(x<0)
                                    x=x*-1;
                                           while(x>0){
                                                   int digit=x%10;
                                                           sum=(sum*10)+digit;
                                                                   x=x/10;
                                                                          }
                                                                              if(temp<0)
                                                                                  sum=sum*-1;
                                                                                      if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)
                                                                                          sum=0;
                                                                                              return (int)sum;
                                                                                                  }
                                                                                                  }
    
