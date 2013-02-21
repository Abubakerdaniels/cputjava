/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker.Assignment11;

/**
 *
 * @author Abu
 */
public class IsPalidDromeImp implements IsPalidDrome 
{
    protected  String status="";
    private  IsPalidDromeImp number;
    private  float digits;
    
    public IsPalidDromeImp()
    {
        
    }
    
  
     
    
     @Override
     public   IsPalidDromeImp  ObjectPalidreturn(int digit)
     {
             IsPalidDromeImp palid;
           //  palid=null;
             palid=new IsPalidDromeImp();
             
             palid.setPalid(digit);
             return palid;
     }
     
     @Override
     public void setPalid(int digit)
     {
       digits=digit;   
     }
     @Override
     public float  getPalid()
     {
          return digits;
     }
     
     
     
     
}
    


