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
    protected  String status="";
    private  IsPalidDromeImp number;
    private  float digits;
    
    public IsPalidDromeImp()
    {
        
    }
    
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
        if (  playBack == digit) 
        {
            return true;
        }
        return false;
    }
   
     @Override
     public   IsPalidDromeImp  ObjectPalidreturn(int digit)
     {
             IsPalidDromeImp palid;
           //  palid=null;
             palid=new IsPalidDromeImp();
             
             palid.setPalid(digit);
             return palid;
     }
     
     @Override
     public void setPalid(int digit)
     {
       digits=digit;   
     }
     @Override
     public float  getPalid()
     {
          return digits;
     }
     
     
     
     
}
    


