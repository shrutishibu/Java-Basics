/*
You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.

Examples:
Input: n = 121
Output: true
Explanation: When read from left to right : 121. When read from right to left : 121.

Input: n = 123
Output: false
Explanation: When read from left to right : 123. When read from right to left : 321.

Input: 101
Output: true

Constraints:
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.

*/

//Solution
class Solution {
    public boolean isPalindrome(int n) {
        if(n==0) return true;

        int originalNum = n;
        int reversedNum = 0;
        while(n>0){
            reversedNum = reversedNum*10 + (n%10);
            n = n/10;
        }
        if(reversedNum == originalNum){
            return true;
        }
        else return false;
    }
}