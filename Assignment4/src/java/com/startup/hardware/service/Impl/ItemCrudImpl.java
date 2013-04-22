/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Item1;
import com.startup.hardware.model.Item1;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.ItemCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("ItemCrud")
@Transactional
public class ItemCrudImpl implements ItemCrud {

    
     @Autowired
    private GenericDAO<Item1> dao;
     
      public final void setDao(final GenericDAO< Item1> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Item1.class);
    }
    public Item1 findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<Item1> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(Item1 entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(Item1 entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(Item1 entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        Item1 v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<Item1> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public Item1 getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<Item1> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
    
}
