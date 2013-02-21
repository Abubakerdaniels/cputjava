/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels.Assignment;

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
public class AssertObjectImpNGTest
{
    private static AssertObject rectangleO;
    public AssertObjectImpNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        rectangleO=new AssertObjectImp();
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
     * Test of setLength method, of class AssertObjectImp.
     */
    @Test
    public void testSetLength() 
    {
        int length1 = 10;
        rectangleO.setLength(length1);
    }

    /**
     * Test of setBreadth method, of class AssertObjectImp.
     */
    @Test
    public void testSetBreadth() {
        
        int breadth = 20;
        
        rectangleO.setBreadth(breadth);
        
    }

    /**
     * Test of returnRectangle method, of class AssertObjectImp.
     */
    @Test
    public void testReturnRectangle()
    {
        
        AssertObjectImp rectangleExspected = new AssertObjectImp();
        rectangleExspected.setLength(10);
        rectangleExspected.setBreadth(20);
        AssertObjectImp rectangle1;
        rectangle1 = rectangleO.returnRectangle();
        assertNotSame(rectangle1,rectangleExspected);
    }
    public void testReturnRectangle1()
    {
        AssertObjectImp rectangleExspected = new AssertObjectImp();
        rectangleExspected.setLength(10);
        rectangleExspected.setBreadth(20);
        AssertObjectImp rectangle1;
        rectangle1 = rectangleO.returnRectangle();
        assertSame(rectangle1,rectangleExspected);
    }
    @Test
    public void testReturnRectangle12()
    {
         AssertObjectImp rec2;
        rec2=rectangleO.returnNullObject();
        assertNull(rec2);
        
    }
   
}
