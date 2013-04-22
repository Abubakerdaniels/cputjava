/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Inventory;
import com.startup.hardware.model.Inventory;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.InventoryCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("InventoryCrud")
@Transactional
public class InventoryCrudImpl  implements InventoryCrud
{
    @Autowired
    private GenericDAO<Inventory> dao;
   
    
  public final void setDao(final GenericDAO< Inventory> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Inventory.class);
    }

    
    @Override
    public Inventory findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Inventory> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Inventory entity) 
    {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Inventory entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Inventory entity) 
    {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId)
    {
        setDao(dao);
        Inventory v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Inventory> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Inventory getByPropertyName(String name, String value)
    {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Inventory> getEntitiesByProperName(String name, String value)
    {
       setDao(dao); 
        return dao.getEntitiesByProperName(name, value);
    }

  

}
