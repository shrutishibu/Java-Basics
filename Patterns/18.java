/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

E 
D E 
C D E 
B C D E 
A B C D E

 */

 // SOLUTION
 class Solution {
    public void pattern18(int n) {
        for(int i = 0; i<n; i++){
            for(int j = n-i-1; j<=n-1; j++){
                System.out.print((char)('A'+j) + " ");
            }
            System.out.println();
        }
    }
}