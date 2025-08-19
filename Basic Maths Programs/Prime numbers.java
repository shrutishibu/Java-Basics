/*
You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.

A prime number is a number which has no divisors except 1 and itself.
 */

 //Solution
 class Solution {
    public boolean isPrime(int n) {
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}