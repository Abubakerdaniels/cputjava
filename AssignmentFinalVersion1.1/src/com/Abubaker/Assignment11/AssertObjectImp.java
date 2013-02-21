/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker.Assignment11;

/**
 *
 * @author Abu
 */
public class AssertObjectImp implements AssertObject
{
    
   private int length;
   private int width;
    
   @Override
   public void setLength(int length1)
   {
       length= length1;  
   }
   
   @Override
   public void setBreadth(int breadth)
   {
       width=breadth;
   }
   
   @Override
   public AssertObjectImp returnRectangle()
   {
      AssertObjectImp rectangle=new AssertObjectImp();
      return rectangle;
   }
   @Override
   public AssertObjectImp returnNullObject()
   {
        AssertObjectImp rectangle = null;
        return rectangle;
   }
   
   
}
