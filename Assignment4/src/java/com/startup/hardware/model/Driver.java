/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wallied
 */
@Entity
public class Driver implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    
    private  String  route;
   
    private  Double driven_km;

    public Double getDriven_km() {
        return driven_km;
    }

    public void setDriven_km(Double driven_km) {
        this.driven_km = driven_km;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    private  Double petrol_Used;
    private  boolean gPRSAllocated; 

    public boolean isgPRSAllocated() {
        return gPRSAllocated;
    }

    public void setgPRSAllocated(boolean gPRSAllocated) {
        this.gPRSAllocated = gPRSAllocated;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route)
    {
        this.route = route;
    }
    public Double getPetrol_Used() {
        return petrol_Used;
    }

    public void setPetrol_Used(Double petrol_Used) {
        this.petrol_Used = petrol_Used;
    }

   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hardware.model.Driver[ id=" + id + " ]";
    }
    
}
