/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.SalesPersonCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("SalesPersonCrud")
@Transactional
public class SalesPersonCrudImpl  implements SalesPersonCrud
{
    @Autowired
    private GenericDAO<SalesPerson> dao;
     
      public final void setDao(final GenericDAO< SalesPerson> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(SalesPerson.class);
    }
      
    public SalesPerson findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<SalesPerson> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(SalesPerson entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(SalesPerson entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(SalesPerson entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        SalesPerson v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<SalesPerson> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public SalesPerson getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<SalesPerson> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
     
}
