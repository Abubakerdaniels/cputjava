/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("ItemSpecificCrud")
@Transactional
public class ItemSpecificCrudImpl  implements  ItemSpecificCrud {
    
     
     @Autowired
    private GenericDAO<ItemSpecific> dao;
     
      public final void setDao(final GenericDAO< ItemSpecific> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(ItemSpecific.class);
    }
      
    public ItemSpecific findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<ItemSpecific> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(ItemSpecific entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(ItemSpecific entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(ItemSpecific entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        ItemSpecific v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<ItemSpecific> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public ItemSpecific getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<ItemSpecific> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
    
}
