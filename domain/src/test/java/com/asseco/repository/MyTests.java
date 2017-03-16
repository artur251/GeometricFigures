package com.asseco.repository;

//import java.util.Calendar;
import java.util.Collection;
//import org.junit.Assert;

public class MyTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PersonRepositoryInterface personRepository = new PersonRepository();
		PersonFactoryInterface personFactory = new PersonFactory();
        //Calendar.getInstance().getTime()
		personRepository.save(personFactory.create("Imie_1", "Nazwisko_1", null));
		personRepository.save(personFactory.create("Imie_2", "Nazwisko_2", null));
		personRepository.save(personFactory.create("Imie_3", "Nazwisko_3", null));
		personRepository.save(personFactory.create("Imie_4", "Nazwisko_4", null));
		personRepository.save(personFactory.create("Imie_5", "Nazwisko_5", null));
		
		System.out.println("repository="+personRepository.toString());
		System.out.println("repository="+((PersonRepository)personRepository).sizes());
	
		//test findAll
		System.out.println("test findAll:");
		Collection<PersonInterface> persons;
		persons = personRepository.findAll();
		System.out.println("test findAll A ="+persons.size()+":"+persons);
		persons.clear();
		persons = personRepository.findAll();
		System.out.println("test findAll B ="+persons.size()+":"+persons);

		//test findOne
		System.out.println("test findOne:");
		Long id=3L;
		System.out.println("test findOne id="+id+" result="+personRepository.findOne(3L));
		
		//test update
		System.out.println("test update:");
		id=2L;
		System.out.println("test update przed update personRepository  ="+personRepository);	
		PersonInterface personN = new Person("Xxxx_2", "Xxxxxxxx_2", null);
		personN.setId(2L);
		personRepository.update(personN);
		System.out.println("test update PO update id="+id+" personRepository="+personRepository);	
		
		
		
		
	}

}
