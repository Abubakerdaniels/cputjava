/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

/**
 *
 * @author Abu
 */
public class IsPalidDromeImp implements IsPalidDrome 
{
    protected  String status=new String("");
    private  IsPalidDromeImp number;
    
     @Override
     public boolean isPalindrome(int  digit)
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
        if (  playBack == digit) 
        {
            return true;
        }
        return false;
    }
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
        if (  playBack == digit) 
        {
            return true;
        }
        return false;
    }
     
     public String returnPalidrome()
     {
        int palindrome = 101; 
        int digit=8;// copied digit into variable
        int playBack = 0;

        while (palindrome != 0) 
        {
            int leftOver = palindrome % 10;
            playBack = playBack * 10 + leftOver;
            palindrome = palindrome / 10;
        }

        // if original and playBack of digit is equal means
        // digit is palindrome in Java
        if (  playBack == digit) 
        {
            return ("true");
        }
        return null;
     }

}
    


