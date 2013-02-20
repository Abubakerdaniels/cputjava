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
public class ArraysAssertImpNGTest 
{
    
    private  static ArrayAssert arraySongs;
    
    public ArraysAssertImpNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        arraySongs=new ArraysAssertImp();
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

    /**
     * Test of insertItem method, of class ArraysAssertImp.
     */
    @Test
    public void testInsertItem()
    {
        System.out.println("insertItem");
        String Song = "Cool";
        int exspectedSize=1;
        arraySongs.insertItem(Song);
        assertEquals(arraySongs.returnSize(),exspectedSize);
        Song="I love and hate you with a passion";
        arraySongs.insertItem(Song);
        exspectedSize=2;
        assertEquals(arraySongs.returnSize(),exspectedSize);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
