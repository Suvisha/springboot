package com.studentmgr.common.dao;

import java.util.List;
import org.springframework.data.mongodb.core.MongoOperations;

import com.studentmgr.common.exception.DataAccessException;

public interface GenericDao<T> 
{
	
	T getById(Object id) throws DataAccessException;
	List<T> getAllById(Object id) throws DataAccessException;
	List<T> getAll() throws DataAccessException;
	void delete(T object) throws DataAccessException;
    void add(T object) throws DataAccessException;
	void modify(T object) throws DataAccessException;
	MongoOperations getMongoOperations();

}
