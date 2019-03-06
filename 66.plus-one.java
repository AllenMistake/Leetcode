/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (40.70%)
 * Total Accepted:    355.6K
 * Total Submissions: 873.8K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * 
 * 
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        for(int i=n;i!=-1;i--){
            if(digits[i]<9){
                ++digits[i];
                return digits;
            }
            
            digits[i]=0; 
        }
        int[] a = new int[n+2];
        a[0]=1;
            
        return a;
    }
}

