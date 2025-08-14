/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
AB
ABC
ABCD
ABCDE

 */

 // SOLUTION
 class Solution {
    public void pattern14(int n) {
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}