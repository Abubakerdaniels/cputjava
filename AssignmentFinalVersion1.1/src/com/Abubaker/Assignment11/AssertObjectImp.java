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
    
   protected int length;
   protected int width;
    
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
   
    /**
     *
     * @return
     */
    @Override
   public AssertObjectImp returnRectangle()
   {
      AssertObjectImp rectangle=new AssertObjectImp();
      rectangle.setBreadth(20);
      rectangle.setLength(10);
      return rectangle;
   }
   @Override
   public AssertObjectImp returnNullObject()
   {
        AssertObjectImp rectangle = null;
        return rectangle;
   }
   @Override
   public void displayObject()
   {
       System.out.println("Length: "+length+"Width:  "+length);
   }
   
}
