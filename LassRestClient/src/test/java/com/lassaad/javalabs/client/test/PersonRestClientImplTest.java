package com.lassaad.javalabs.client.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lassaad.javalabs.client.PersonRestClient;
import com.lassaad.javalabs.client.PersonRestClientImpl;
import com.lassaad.javalabs.client.builder.Builder;
import com.lassaad.javalabs.client.builder.PersonParamBuilder;
import com.lassaad.javalabs.client.conf.Configuration;
import com.lassaad.javalabs.client.conf.ConfigurationImpl;
import com.lassaad.javalabs.client.entities.Person;

public class PersonRestClientImplTest {

	private PersonRestClient restClient;
	private Configuration config;
	@Before
	public void setUp()
	{
		config=new ConfigurationImpl();
		config.setBaseUrl("http://localhost:8081/");
		config.setVersion("v1");
		config.setComplementUrl("/person");
		restClient = new PersonRestClientImpl(config);
		
	}
	
	@Test
	public void testGetAllPersons() {
		List<Person> persons = restClient.getAll();
		System.out.println(persons.size());
		assertTrue(persons.size() == 10);
	}
	
	@Test
	@Ignore
	public void createPerson()
	{
		Person person = new Person();
		person.setName("Bug");
		person.setFamilyName("Aissa");
		person.setAdress("Adresse");
		person.setMail("lass@aissa.com");
		Person createdPerson = restClient.createPerson(person);
		assertTrue(createdPerson.getIdPerson() != null && "Bug".equals(createdPerson.getName()));
	}
	
	@Test
	public void testParams() 
	{
		PersonParamBuilder params = new Builder().param1("Lass").param2("Aissa").build();
		List<Person> persons = restClient.getPersons(params);
		assertTrue(persons.size() == 10);
	}

}
