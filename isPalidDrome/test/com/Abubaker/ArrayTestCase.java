/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Abu
 */
public class ArrayTestCase 
{
    private  static ArrayAssert assertArray;
    
    public ArrayTestCase() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
          assertArray=new ArraysAssertImp();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test()
    public void displayListContent(String listWanted[]) 
    {
       String[] actual =new String[]{"Spur Ribs","T bone Steak","Big Mac Burger"};
       

       String[] var=new String[]{"Pizza","Rave Burger","Corner Boys"};
       assertArray.displayListContent(var);
       for(int i=0; i < actual.length;i++)
       {
            assertEquals("Two arrays should contain same content",actual[i],var[i]);
            
       }
    }

}
