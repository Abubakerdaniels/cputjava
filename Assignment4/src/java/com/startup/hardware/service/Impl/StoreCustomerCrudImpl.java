/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */

@Service("StoreCustomerCrud")
@Transactional
public class StoreCustomerCrudImpl  implements  StoreCustomerCrud
{
    @Autowired
    private GenericDAO<StoreCustomer> dao;
     
      public final void setDao(final GenericDAO< StoreCustomer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(StoreCustomer.class);
    }
      
    public StoreCustomer findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<StoreCustomer> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(StoreCustomer entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(StoreCustomer entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(StoreCustomer entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        StoreCustomer v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<StoreCustomer> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public StoreCustomer getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<StoreCustomer> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
     
}
