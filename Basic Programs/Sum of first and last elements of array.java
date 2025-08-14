/*

 Given an integer array nums, return the sum of the 1st and last element of the array.

Examples:
Input: nums = [2, 3, 4, 5, 6]
Output: 8
Explanation: 1st element = 2, last element = 6, sum = 2 + 6 = 8.

Input: nums = [2]
Output: 4
Explanation: 1st element = last element = 2, sum = 2 + 2 = 4.

Input: nums = [-1, 2, 4, 1]
Output:0

Constraints:
1 <= Number of elements in nums <= 100
-100 <= nums[i] <= 100

 */

class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        if(nums.length != 0){
            return(nums[0] + nums[nums.length - 1]);
        }
        else{
            return 0;
        }
    }
}