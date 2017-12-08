package com.exem.Dao;

import com.exem.beans.User;





public interface Dao<T> {
	public     T ajout(T obj);
    public boolean virfConex(String pass ,String email );
    public T recherUser (String email);


}
