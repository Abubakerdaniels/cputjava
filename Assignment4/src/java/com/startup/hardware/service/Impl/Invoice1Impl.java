package com.startup.hardware.service.Impl;


import com.startup.hardware.model.Invoice1;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.InvoiceCrud;
import java.util.List;

import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 *
 * @author Wallied
 */
@Service("InvoiceCrud")
@Transactional
public class Invoice1Impl  implements InvoiceCrud
{
    
  
  
    @Autowired
    private GenericDAO<Invoice1> dao;
   
    
    /**
     *
     * @param daoToSet
     */
    
    public final void setDao(final GenericDAO< Invoice1> daoToSet) 
    {
        this.dao = daoToSet;
        this.dao.setClazz(Invoice1.class);
    }

    
    @Override
    public Invoice1 findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Invoice1> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Invoice1 entity) 
    {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Invoice1 entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Invoice1 entity) 
    {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId)
    {
        setDao(dao);
        Invoice1 v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Invoice1> findInRange(int firstResult, int maxResults)
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
    public Invoice1 getByPropertyName(String name, String value)
    {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Invoice1> getEntitiesByProperName(String name, String value)
    {
       setDao(dao); 
        return dao.getEntitiesByProperName(name, value);
    }


}
