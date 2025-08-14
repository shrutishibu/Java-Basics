/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
BB
CCC
DDDD
EEEEE

 */

 // SOLUTION
 class Solution {
    public void pattern16(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}