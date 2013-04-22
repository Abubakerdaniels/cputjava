/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Sales;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.SalesCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("SalesCrud")
@Transactional
public class SalesCrudImpl implements  SalesCrud
{
     @Autowired
    private GenericDAO<Sales> dao;
     
      public final void setDao(final GenericDAO< Sales> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Sales.class);
    }
      
    public Sales findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<Sales> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(Sales entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(Sales entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(Sales entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        Sales v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<Sales> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public Sales getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<Sales> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
}
