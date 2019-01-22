package model.dao;

import java.util.List;

public interface Dao<T, T2> {

	void insert(T obj);
	void update(T obj);
	void deleById(Integer id);
	T findById(Integer id);
	List<T> findByDepartment(T2 obj);
	List<T> findAll();
}