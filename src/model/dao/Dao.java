package model.dao;

import java.util.List;

public interface Dao {

	void insert(Object obj);
	void update(Object obj);
	void delete(Object obj);
	void deleById(Integer id);
	Object findById(Integer id);
	List<Object> findAll();	
}