/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Wallied
 */
@Entity
public class SalesPerson implements Serializable {
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int daily_SalesHandled;
    private Double hisMonthTurnOver;
    private boolean temp;

    public Double getHisMonthTurnOver() {
        return hisMonthTurnOver;
    }

    public void setHisMonthTurnOver(Double hisMonthTurnOver) {
        this.hisMonthTurnOver = hisMonthTurnOver;
    }

    public boolean isTemp() {
        return temp;
    }

    public void setTemp(boolean temp) {
        this.temp = temp;
    }

 
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToMany//(orphanRemoval=true,cascade= CascadeType.ALL)
    @JoinColumn(name="SalesID")
    private  List<Sales> sales;

    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }
    
    @OneToOne(orphanRemoval=true, cascade= CascadeType.ALL)
    @JoinColumn(name="SalesPersonID")
    private Person person;
    
    
    public int getDaily_SalesHandled() {
        return daily_SalesHandled;
    }

    public void setDaily_SalesHandled(int daily_SalesHandled) {
        this.daily_SalesHandled = daily_SalesHandled;
    }

    
   

    public boolean isFullTIme() {
        return FullTIme;
    }

    public void setFullTIme(boolean FullTIme) {
        this.FullTIme = FullTIme;
    }
    private boolean FullTIme;
    
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
        if (!(object instanceof SalesPerson)) {
            return false;
        }
        SalesPerson other = (SalesPerson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hardware.model.SalesPerson[ id=" + id + " ]";
    }
    
}
