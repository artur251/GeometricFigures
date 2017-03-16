package com.asseco.repository;

import java.util.Calendar;
import java.util.Date;

public class Person implements PersonInterface, Comparable<Person> {
	// atrybuty
	Long id;
	String name;
	String surname;
	Date birthDate;
	Date creationDate;

	// konstruktory
/*	private Person() {
		// prevent external instantiation
	}
*/
	// dla PersonFactory
	public Person(String name, String surname, Date birthDate) {
		// super();
		this.id = PersonSeq.getInstance().getNextSequence();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.creationDate = Calendar.getInstance().getTime();
	}

	// gettery/settery
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate
				+ ", creationDate=" + creationDate + "]";
	}

	@Override
	//https://blog.udemy.com/java-collections-sort/
	public int compareTo(Person person) {
		String surnameTemp;
		String surnameObject;
		if (this.surname != null) {
			surnameTemp = this.surname + "_" + id;
		} else {
			surnameTemp = "_" + id;
		}
		if (person.getSurname() != null) {
			surnameObject = person.getSurname() + "_" + person.getId();
		} else {
			surnameObject = "_" + person.getId();
		}
		return surnameTemp.compareTo(surnameObject);
	}
}
