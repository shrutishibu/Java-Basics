/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

 */

// SOLUTION
class Solution {
    int toggle = 1; 

    public void pattern11(int n) {
        for(int i=1; i<=n; i++){
            if(i%2==0){
                toggle = 0;
            } else {
                toggle = 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(toggle + " ");
                toggle = 1 - toggle;
            }
            System.out.println();
        }
    }
}