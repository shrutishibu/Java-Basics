/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */

 // SOLUTION
 class Solution {
    public void pattern19(int n) {
        pyramid(n);
        invertedPyramid(n);
    }

    private static void pyramid(int n){
        for(int i = 0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int space = 0; space<i*2; space++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedPyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int space = 0; space<(n-i)*2; space++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}