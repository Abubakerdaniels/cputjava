/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Wallied
 */
@Embeddable
public class JoinClassItem implements  Serializable
{
    private static final long serialVersionUID = 1L;
  
    private int quantity;
    private String Description;
    private int    Item_ID;
    private double sizes;
    private String model;   
    private double  Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public double getSizes() {
        return sizes;
    }

    public void setSizes(double sizes) {
        this.sizes = sizes;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
}
