package com.develop.solidprinciplesv1.core.service;

import java.util.List;

public interface RepositoryService<T> extends Service {

  List<T> getAll();

  T get(Long id);

  T create(T entity);

  T save(T entity);

  void delete(Long id);

  Integer getTotal();
}
