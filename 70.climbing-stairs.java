/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (43.48%)
 * Total Accepted:    359.6K
 * Total Submissions: 827.1K
 * Testcase Example:  '2'
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * Note: Given n will be a positive integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * 
 */
class Solution {
    public int climbStairs(int n) {
        int count=0;
        int p = n/2;
        int q = n%2;
        for(; p+q<=n;p=p-1,q=q+2){
            count=count+sort(p+q, q);
        }
        return count;
        
        
    }

    public static int sort(int a,int b){
        if(b==0||a==b)
            return 1;
        int x=a,y=b,z=a-b,t=a-b;
        while(a>1){
            x=x*(--a);
        }
        while(b>1){
            y=y*(--b);
        }
        while(t>1){
            z=z*(--t);
        }
        return x/(y*z);
    }
}

