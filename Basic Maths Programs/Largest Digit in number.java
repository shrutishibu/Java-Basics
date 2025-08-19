/*
You are given an integer n. Return the largest digit present in the number.

Examples:
Input: n = 25
Output: 5
Explanation: The largest digit in 25 is 5.

Input: n = 99
Output: 9
Explanation: The largest digit in 99 is 9.

Input: n = 1
Output: 1
Constraints:
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.

*/

//Solution
import java.util.*;
class Solution {
    public int largestDigit(int n) {
        if(n==0) return 0;

        ArrayList<Integer> digitsOfNumber = new ArrayList<>();
        while(n>0){
            digitsOfNumber.add(n%10);
            n = n/10;
        }

        return Collections.max(digitsOfNumber);
    }
}