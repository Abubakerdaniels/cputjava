/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.Daniels.Assignment.ArrayAssert;
import com.Daniels.Assignment.ArraysAssertImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author Abu
 */
@Configuration
public class Appconfig 
{
      @Bean(name="Hello")
      public ArrayAssert insertItem(String Song)
      {
            return new  ArraysAssertImp();
      }
      @Bean(name="Hello")
      public ArrayAssert getSongAt(int i)
      {
           return new ArraysAssertImp();
      }
      @Bean(name="Hello")
      public ArrayAssert returnSize()
      {
          return new ArraysAssertImp();
      }
     
}
