package com.qa.ims.persistence.dao;

import java.util.List;

import com.qa.ims.persistence.domain.Games;

public interface Dao<T> {

    List<T> readAll();
     
    T create(T t);
     
    T update(T t);
     
    void delete(long id);
}
	