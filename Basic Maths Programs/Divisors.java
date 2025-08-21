/*
You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.
*/

//Solution
import java.util.Arrays;
class Solution {
    public int[] divisors(int n) {
        int[] sortedDivisors = new int[n];
        int j=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sortedDivisors[j++] = i;
            }
        }
        sortedDivisors = Arrays.copyOf(sortedDivisors, j);
        return sortedDivisors;
    }
}