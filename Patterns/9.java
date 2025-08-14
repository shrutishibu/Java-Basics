/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */

 // SOLUTION
 class Solution {
    public void pattern9(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n-i)*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}