/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

/**
 *
 * @author Abu
 */
public class ProfitEqualsImp
{
    
    public double profitPersentage(double totalIncome,double totalCost)
    {
        
         double present=(totalIncome-totalCost)/totalCost*100;
         return present;
         
    }
}
