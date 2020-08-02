package com.common.microservicios.service;

import java.util.Optional;

public interface CommonsService<E> {
	
public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E save(E entity);
	
	public void deleteById (Long id);

}
