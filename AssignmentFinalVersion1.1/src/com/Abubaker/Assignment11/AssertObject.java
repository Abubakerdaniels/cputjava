/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker.Assignment11;

/**
 *
 * @author Abu
 */
public interface AssertObject 
{
   public AssertObjectImp returnRectangle();
   public AssertObjectImp returnNullObject(); 
    /**
     *
     */
   public void displayObject();
   public void setLength(int length);
   public void setBreadth(int breadth);
 
}
