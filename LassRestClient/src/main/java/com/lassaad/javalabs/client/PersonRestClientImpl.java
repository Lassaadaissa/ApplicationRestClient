package com.lassaad.javalabs.client;

import java.util.List;
import java.util.Map;

import com.lassaad.javalabs.client.builder.Builder;
import com.lassaad.javalabs.client.builder.PersonParamBuilder;
import com.lassaad.javalabs.client.conf.Configuration;
import com.lassaad.javalabs.client.entities.Person;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class PersonRestClientImpl implements PersonRestClient {

	private Configuration conf;
	
	PersonRestClient restClient;
	
	private String baseUrl;
	
	public PersonRestClientImpl(Configuration conf) {
		this.conf=conf;
		initBaseUrl();
		restClient = Feign.builder()
				.encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder())
				.target(PersonRestClient.class, baseUrl);
	}
	private void initBaseUrl()
	{
		baseUrl = conf.getBaseUrl() + conf.getVersion() + conf.getComplementUrl();
	}
	
	public Person createPerson(Person person) {
		return restClient.createPerson(person);
	}

	public Person updatePerson(Person person) {
		return restClient.updatePerson(person);
	}

	public void deletePerson(Long id) {
		restClient.deletePerson(id);
	}

	public List<Person> getAll() {
		return restClient.getAll();
	}

	public List<Person> getByName(String name) {
		return restClient.getByName(name);
	}

	public List<Person> getByFamilyName(String familyName) {
		return restClient.getByFamilyName(familyName);
	}
	public List<Person> getPersons(PersonParamBuilder params) {
		return restClient.getPersons(params);
	}
	
}
