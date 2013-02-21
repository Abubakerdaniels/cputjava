/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels.Assignment;

/**
 *
 * @author Abu
 */
public class AssertFailImp implements AssertFail
{
    @Override
    public void timer(int time)
    {
        System.out.print("Elapsed Time");
        for(int i=0; i < time;i++)
        {
            System.out.println(time+"");
        }
    }
    
}
