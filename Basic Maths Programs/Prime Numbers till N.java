/*
You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). Return the number of prime numbers in the range.

A prime number is a number which has no divisors except, 1 and itself.
 */

 //Solution
 class Solution {
    public int primeUptoN(int n) {
        int primeCount = 0;
        int flag = 0;
        while(n>1){
            flag = 0;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) primeCount++;
            n--;
        }
        return primeCount;
    }
}