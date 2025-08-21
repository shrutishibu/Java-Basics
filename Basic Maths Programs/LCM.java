/*
You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.
*/

//Solution
class Solution {
    public int LCM(int n1, int n2) {
        int n = Math.max(n1, n2);
        
        int i = 1;
        int lcm;

        while(true){
            if((n*i) % n1 == 0 && (n*i) % n2 == 0){
                lcm = n*i;
                break;
            }
            i++;
        }

        return lcm;
    }
}