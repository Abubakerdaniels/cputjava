/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

/**
 *
 * @author Abu
 */
public interface IsPalidDrome
{
    public abstract  boolean isPalindrome(int  number);
    //<editor-fold defaultstate="collapsed" desc="comment">
  
            //</editor-fold>
    /**
     *
     * @param digit
     * @return
     */
    public abstract  boolean isNotPalindrome(int  digit); 
    /**
     *
     * @return
     */
    public abstract  IsPalidDromeImp  ObjectPalidreturn(int digit);
    public void setPalid(int digit);
    public float  getPalid();
    
    
}
