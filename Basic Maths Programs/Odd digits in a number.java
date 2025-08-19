/*
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Examples:
Input: n = 5
Output: 1
Explanation: 5 is an odd digit.

Input: n = 25
Output: 1
Explanation: The only odd digit in 25 is 5.

Input: n = 15
Output: 2

Constraints:
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.

 */

 //Solution
 class Solution {
    public int countOddDigit(int n) {
        int oddDigits = 0;
        if(n!=0){
            while(n>0){
                if((n%10)%2 != 0){
                    oddDigits++;
                }
                n = n/10;
            }
        }
        return oddDigits;
    }
}