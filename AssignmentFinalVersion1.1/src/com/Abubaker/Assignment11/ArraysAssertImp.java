/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker.Assignment11;
import java.util.*;
/**
 *
 * @author Abu
 */
public class ArraysAssertImp implements ArrayAssert 
{
    
    private List<String> album=new ArrayList<String>();
    /**
     *
     * @param 
     * @throws Exception
     */
    @Override
    public void insertItem(String Song)
    {
           album.add(Song);
    }

    
    public String getSongAt(int i)
    {
        return album.get(i);
    }
    
    public int returnSize()
    {
        return album.size();    
    }
}
