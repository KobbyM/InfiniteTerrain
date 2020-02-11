package com.qa.databases;

import java.util.List;

public interface Dao<T> {
	//C
	public void create(T t);
	//R
	public List<T> readAll();
	//U
	public void update(T t);
	//D
	public void delete(T t);
}
