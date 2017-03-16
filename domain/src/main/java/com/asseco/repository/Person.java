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

	private String sName;
	private String sSurname;

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

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSurname() {
		return sSurname;
	}

	public void setsSurname(String sSurname) {
		this.sSurname = sSurname;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate
				+ ", creationDate=" + creationDate + "]";
	}

	@Override
	//https://blog.udemy.com/java-collections-sort/
	public int compareTo(Person p) {
		String thisSurname;
		String oSurname;
		if (this.sSurname != null) {
			thisSurname = this.sSurname + "_" + id;
		} else {
			thisSurname = "_" + id;
		}
		if (p.getsSurname() != null) {
			oSurname = p.getsSurname() + "_" + p.getId();
		} else {
			oSurname = "_" + p.getId();
		}
		return thisSurname.compareTo(oSurname);
	}


}
