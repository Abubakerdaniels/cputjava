/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;


import com.startup.hardware.service.crud.InvoiceCrud;
import com.startup.hardware.service.crud.ItemCrud;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import com.startup.hardware.service.crud.UserCrud;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Wallied
 */
public class JoinClassSalesPerson
{
     private int daily_SalesHandled;
     private Double hisMonthTurnOver;
     private boolean temp;
     private Double proceedPerYear;
     private Double proceedPerMonth;
     private String firstName; 
     private String lastName;
     private Date  dateOfBirth;
     private String emailAddress;
     private String gender;
     private String postalAddress;
     private String physicalAddress;
     private String postalCode;
     private String userName;
     private String password;
     private boolean fulltime;
     private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   
    
    
    public  JoinClassSalesPerson()
    {
     
    }
   
     
     
      
     
     
     
     
     
     
     
     
     
    public int getDaily_SalesHandled() {
        return daily_SalesHandled;
    }

    public void setDaily_SalesHandled(int daily_SalesHandled) {
        this.daily_SalesHandled = daily_SalesHandled;
    }

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

    public Double getProceedPerYear() {
        return proceedPerYear;
    }

    public void setProceedPerYear(Double proceedPerYear) {
        this.proceedPerYear = proceedPerYear;
    }

    public Double getProceedPerMonth() {
        return proceedPerMonth;
    }

    public void setProceedPerMonth(Double proceedPerMonth) {
        this.proceedPerMonth = proceedPerMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
     
}
