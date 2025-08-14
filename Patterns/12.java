/*
 
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321

 */

 // SOLUTION
 class Solution {
    public void pattern12(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(j+1);
            }
            for(int space = i; space <n*2-i; space++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}