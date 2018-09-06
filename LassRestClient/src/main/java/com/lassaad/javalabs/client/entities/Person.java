package com.lassaad.javalabs.client.entities;

import java.io.Serializable;
public class Person implements Serializable{

//Person
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7772883136132110481L;
	private Long idPerson;
	private String name;
	private String familyName;
	private String adress;
	private String mail;
	private String phone;
	
	public Person()
	{}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
