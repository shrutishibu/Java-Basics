/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5

 */

// SOLUTION
class Solution {
    public void pattern22(int n) {
        for(int i=0; i<n*2 - 1; i++){
            for(int j=0; j<n*2 - 1; j++){
                int top = i;
                int left = j;
                int right = n*2 - j - 2;
                int bottom = n*2 - i - 2;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)) + " ");
            }
            System.out.println();
        }
    }
}