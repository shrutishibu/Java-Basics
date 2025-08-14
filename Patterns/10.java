/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*
**
***
****
*****
****
***
**
*

 */

 // SOLUTION
 class Solution {
    public void pattern10(int n) {
        topPyramid(n);
        bottomPyramid(n);
    }

    private static void topPyramid(int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void bottomPyramid(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}