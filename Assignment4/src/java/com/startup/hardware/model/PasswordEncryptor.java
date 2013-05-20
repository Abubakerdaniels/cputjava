/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 210057610
 */
public class PasswordEncryptor 
{
    
   public  static String encrypt(String  freeText)
   {
     // String Buffer getString = new String Buffer( ) ;
      try
      {
        MessageDigest msg = MessageDigest.getInstance("md5" , "SUN") ;
        byte bs[] = freeText.getBytes() ;
        byte digest[] = msg.digest( bs ) ;
        for ( int i = 0 ; i < digest.length ; ++i ) 
        {
      //    getString.append(Integer.toHexString(0x0100+(digest[i]&0x00FF)).substring(1)) ;
        }
     }
     catch ( NoSuchAlgorithmException ex ) 
     {
       Logger.getLogger ( PasswordEncryptor.class.getName()).log(Level.SEVERE , null , ex ) ;
     }
     catch ( NoSuchProviderException ex ) 
     {
         Logger.getLogger(PasswordEncryptor.class.getName()).log(Level.SEVERE,null , ex ) ;
     }
     return  ""; //getString.toString( ) ;
   }
}
    

