package com.jamesfen.myjee.aop.annotation;

public interface PersonService {

	public String getNameById(Long id);

	public void save(String name);

	public void update(String name, Long id);
}
