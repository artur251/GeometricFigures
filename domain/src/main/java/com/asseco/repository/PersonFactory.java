package com.asseco.repository;

import java.util.Date;

public class PersonFactory implements PersonFactoryInterface {

	public PersonInterface create(String name, String surname, Date birthDate)
	{
		Person person = new Person (name, surname, birthDate);
		return person;
	}
}
