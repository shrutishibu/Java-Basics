/*

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */

// SOLUTION
class Solution {
    public void pattern20(int n) {
        topHalf(n);
        bottomHalf(n);
    }

    private static void topHalf(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<(n-i)*2-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void bottomHalf(int n){
        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i*2; j++){
                System.out.print(" ");
            }
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}