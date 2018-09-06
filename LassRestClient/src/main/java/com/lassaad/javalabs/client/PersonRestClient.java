package com.lassaad.javalabs.client;

import java.util.List;
import java.util.Map;

import com.lassaad.javalabs.client.builder.Builder;
import com.lassaad.javalabs.client.builder.PersonParamBuilder;
import com.lassaad.javalabs.client.entities.Person;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface PersonRestClient {

	static final String POST = "POST ";
	static final String GET = "GET ";
	static final String PUT = "PUT ";
	static final String DELETE = "DELETE ";
	
	static final String CREATE_PERSON = POST + "/create";
	static final String UPDATE_PERSON = PUT + "/update/{id}";
	static final String DELETE_PERSON = DELETE + "/delete/{id}";
	static final String GET_ALL_PERSONS = GET + "/all";
	static final String GET_ALL_PERSONS_BY_NAME = GET + "\"all/by/name/{name}\"";
	static final String GET_ALL_PERSONS_BY_FAMILY_NAME = GET + "all/by/familyname/{familyname}";
	static final String GET_PERSONS = GET + "/all/params";
			
	@Headers("Content-Type: application/json")
	@RequestLine(CREATE_PERSON)
	Person createPerson(Person person);
	
	@Headers("Content-Type: application/json")
	@RequestLine(UPDATE_PERSON)
	Person updatePerson(Person person);
	
	@RequestLine(DELETE_PERSON)
	void deletePerson(@Param(value="id")Long id);
	
	@RequestLine(GET_ALL_PERSONS)
	List<Person> getAll();
	
	@RequestLine(GET_ALL_PERSONS_BY_NAME)
	List<Person> getByName(String name);
	
	@RequestLine(GET_ALL_PERSONS_BY_FAMILY_NAME)
	List<Person> getByFamilyName(String familyName);
	
	@RequestLine(GET_PERSONS)
	List<Person> getPersons(@QueryMap PersonParamBuilder params);
}
