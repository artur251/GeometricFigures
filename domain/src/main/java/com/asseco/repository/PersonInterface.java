package com.asseco.repository;

import java.util.Date;

/**
 * Struktura osoby
 * 
 * TODO Zaimplementowac strukture osoby
 */
public interface PersonInterface {

	void setId(Long id);
	
	Long getId();

	String getName();

	String getSurname();

	Date getBirthDate();

	Date getCreationDate();
	
}
