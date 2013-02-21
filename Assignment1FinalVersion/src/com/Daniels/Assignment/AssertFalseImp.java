/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels.Assignment;

/**
 *
 * @author Abu
 */
public class AssertFalseImp implements AsserFalse {
     @Override
     public boolean isNotPalindrome(int  digit)
     {
        int palindrome = digit; // copied digit into variable
        int playBack = 0;

        while (palindrome != 0) {
            int leftOver = palindrome % 10;
            playBack = playBack * 10 + leftOver;
            palindrome = palindrome / 10;
        }

        // if original and playBack of digit is equal means
        // digit is palindrome in Java
        if (playBack == digit) 
        {
            return true;//<editor-fold defaultstate="collapsed" desc="comment">
        }
        //</editor-fold>
        return false;
    }
   
}
