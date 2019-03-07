/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (37.99%)
 * Total Accepted:    278K
 * Total Submissions: 731.5K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */
    class Solution {
        public String addBinary(String a, String b) {
            if(a==null || b==null){
                return a==null ? b : a;
            }
            
            char carry = '0';
            StringBuilder result = new StringBuilder();
            int i=a.length()-1, j=b.length()-1;
            for(; i>=0 || j>=0 || carry=='1'; i--,j-- ){
                char[] sum = add(i>=0 ? a.charAt(i) : '0', j>=0 ? b.charAt(j) : '0');
                char[] sum2 = add(sum[0],carry);
                result.insert(0,sum2[0]);
                carry = sum[1] == '1' || sum2[1]=='1' ? '1' : '0';
            }
            
            return result.toString();
            
            
        }
         
        private char[] add(char a, char b){
            char[] result = new char[2];
            result[0] = a==b ? '0' : '1';
            result[1] = a==b ? (a=='0' ? '0' : '1') : '0';
            return result;
        }
    }
    


