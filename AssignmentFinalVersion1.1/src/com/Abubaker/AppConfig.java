/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

import com.Abubaker.Assignment11.ArrayAssert;
import com.Abubaker.Assignment11.ArraysAssertImp;
import com.Abubaker.Assignment11.AsserFalse;
import com.Abubaker.Assignment11.AssertFail;
import com.Abubaker.Assignment11.AssertFailImp;
import com.Abubaker.Assignment11.AssertFalseImp;
import com.Abubaker.Assignment11.AssertFloat;
import com.Abubaker.Assignment11.AssertFloatImp;
import com.Abubaker.Assignment11.AssertInteger;
import com.Abubaker.Assignment11.AssertIntegerImp;
import com.Abubaker.Assignment11.AssertObject;
import com.Abubaker.Assignment11.AssertObjectImp;
import com.Abubaker.Assignment11.AssertTrue;
import com.Abubaker.Assignment11.AssertTrueImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Abu
 */

    
@Configuration
public class AppConfig {


   
    //<editor-fold defaultstate="collapsed" desc="comment">
 
    //</editor-fold>
    /**
     *
     * @return
     */
   @Bean(//<editor-fold defaultstate="collapsed" desc="comment">
            name
            //</editor-fold>
            = "Hello")
   
      public ArrayAssert insertItem()
      {
            return new  ArraysAssertImp();
      }
     
      /**
     *
     * 
     * @return
     */
    
      @Bean(name="Hello")
      public ArrayAssert getSongAt()
      {
           return new ArraysAssertImp();
      }
      
      /**
     *
     * @return
     */
     @Bean(name="Hello")
      public ArrayAssert returnSize()
      {
          return new ArraysAssertImp();
      }
    
      /**
     *
     * 
     * @return
     */
      @Bean(name="False")
      public AsserFalse isNotPalindrome()
      {
          return new AssertFalseImp();
      }
      /**
     *
     * 
     */
      @Bean(name="Fail")
      public AssertFail timer()
      {
          return new AssertFailImp();
      }
      @Bean(name="Float")
      public AssertFloat average()
      {
          return new AssertFloatImp();
      }
      @Bean(name="Integer")
      public AssertInteger getStockRecieved()
      {  
         return new AssertIntegerImp(); 
      
      }
      @Bean(name="Integer")
      public AssertInteger setStockRecieved()
      {
          return new AssertIntegerImp();
      }
      @Bean(name="Object")
      public AssertObject returnRectangle()
      {
           return new AssertObjectImp();
      }
      /**
     *
     * @return
     */
      @Bean(name="Object")
      public AssertObject returnNullObject()
      {
          return new AssertObjectImp();
      }
      @Bean(name="Object")
      public AssertObject setLength()
      {
           return new AssertObjectImp();
      }
      @Bean(name="Object")
      public AssertObject setBreadth()
      {
          return new AssertObjectImp();
      }
      @Bean(name="True")
      public AssertTrue isPalindrome()
      {
          return new AssertTrueImp();
      }
              
    
}
