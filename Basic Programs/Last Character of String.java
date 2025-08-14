/*
 
Given a string s. Return the last character of the given string s.

Examples:
Input : s = "takeuforward"
Output : d
Explanation : The last character of given string is "d".

Input : s = "goodforyou"
Output : u
Explanation : The last character of given string is "u".

Input : s = "lovecoding"
Output:g

Constraints:
1 <= s.length <= 100
s consist of only lowercase English letters

 */


class Solution {
    public char lastChar(String s) {
        return s.charAt(s.length()-1);
    }
}