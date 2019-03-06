/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (32.14%)
 * Total Accepted:    247.2K
 * Total Submissions: 769.1K
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * Example:
 * 
 * Input: "Hello World"
 * Output: 5
 * 
 * 
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i = s.length()-1;
        if(s.length()==0)
            return count;
        if(s.charAt(i)==' '){
            for(--i;i>0&&s.charAt(i)==' ';i--){
            }
        }
        for(;i>=0&&s.charAt(i)!=' ';i--){
            count++;
        }
        return count;
        
    }
}

