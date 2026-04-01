package br.com.ucsal.olimpiadas.repository;

import java.util.List;

public interface Repository<T> {
    T add(T entity);
    List<T> list();
}
