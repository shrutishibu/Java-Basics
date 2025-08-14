/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*********
 *******
  *****
   ***
    *

 */

// SOLUTION
class Solution {
    public void pattern8(int height) {
        for(int i=0; i<height; i++){
            for(int j=0; j<i ;j++){
                System.out.print(" ");
            }
            for(int j=0; j<(height-i)*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}