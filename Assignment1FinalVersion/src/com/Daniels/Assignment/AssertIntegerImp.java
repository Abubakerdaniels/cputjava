/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels.Assignment;

/**
 *
 * @author Abu
 */
public class AssertIntegerImp implements AssertInteger
{
    private int stockRecieved;
    
     @Override
     public int getStockRecieved()
     {   
        return  stockRecieved;  
     }
     
     @Override
     public void setStockRecieved(int recieved)
     {
        stockRecieved=recieved;   
     }
     
}
