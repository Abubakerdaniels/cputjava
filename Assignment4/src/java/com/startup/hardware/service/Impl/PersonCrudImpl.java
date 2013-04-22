/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Person;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.PersonCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("PersonCrud")
@Transactional
public class PersonCrudImpl  implements PersonCrud 
{
       
    @Autowired
    private GenericDAO<Person> dao;
     
      public final void setDao(final GenericDAO< Person> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Person.class);
    }
      
    public Person findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<Person> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(Person entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(Person entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(Person entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        Person v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<Person> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public Person getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<Person> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
     
}
