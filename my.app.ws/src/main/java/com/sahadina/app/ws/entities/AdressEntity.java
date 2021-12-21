package com.sahadina.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name = "adresses")
public class AdressEntity implements Serializable {

	
	private static final long serialVersionUID = -1465492214637318946L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(length =40, nullable = false)
	private String adressId;
	
	@Column(length =20, nullable = false)
	private String city;
	
	@Column(length =20, nullable = false)
	private String country;	
	
	@Column(length =50, nullable = false)
	private String street;
	
	@Column(length =7, nullable = false)
	private String postal;	
	
	@Column(length =20, nullable = false)
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "users_id")
	private UserEntity user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdressId() {
		return adressId;
	}

	public void setAdressId(String adressId) {
		this.adressId = adressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	

}
