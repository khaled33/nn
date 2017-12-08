package com.exem.Dao;

import java.util.List;


public interface DaoRap<T> {
	public T ajout(T obj);
	public T modif(T obj);
	public boolean delete(int id);
	public List<T> list();
	public T recherche(int id);
}
