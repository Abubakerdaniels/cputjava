/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Wallied
 */

@Entity
public class Invoice1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePrinteds;
    private String companyTo;

    public Date getDatePrinteds() 
    {
        return datePrinteds;
    }

    public void setDatePrinteds(Date datePrinteds) {
        this.datePrinteds = datePrinteds;
    }

    public String getCompanyTo() {
        return companyTo;
    }

    public void setCompanyTo(String companyTo) {
        this.companyTo = companyTo;
    }
    private String supplier; 

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier;
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
        if (!(object instanceof Invoice1)) {
            return false;
        }
        Invoice1 other = (Invoice1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hardware.model.Invoice[ id=" + id + " ]";
    }
    
}
