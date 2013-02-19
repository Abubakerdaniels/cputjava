/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

/**
 *
 * @author Abu
 */
public class ArraysAssertImp implements ArrayAssert 
{
    /**
     *
     * @param Array
     * @throws Exception
     */
    @Override
    public void displayListContent(String listWanted[])
    {
        String[] ListHave=new String[]{"Spur Ribs","T bone Steak","Big Mac Burger"};
        int j;
        int i;
        for( j=0; j< ListHave.length;j++)
        {
          for(i=0; i < listWanted.length;i++)
          {
             if(listWanted[i].equalsIgnoreCase(ListHave[j]))
             {
                System.out.println("Available:"+listWanted[i]);
             }
            
          }
        }
    }
}
