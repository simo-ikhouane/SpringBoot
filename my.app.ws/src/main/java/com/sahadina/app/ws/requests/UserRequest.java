package com.sahadina.app.ws.requests;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRequest {
	
	
	@NotBlank(message = "Ce champ ne doit pas etre vide !!")
	@Size(min = 3, message = "Ce champ doit avoir au moins 3 caracteres !")
	private String firstName;
	
	@NotEmpty(message = "Ce champ ne doit pas etre vide !!")
	@Size(min = 3, message = "Ce champ doit avoir au moins 3 caracteres !")
	private String lastName;
	
	@NotNull(message = "Ce champ ne doit pas etre null !!")
	@Email(message = "Ce champs doit respecter le format email !")
	private String email;
	
	@NotNull(message = "Ce champ ne doit pas etre null !!")
	@Size(min = 8, message = "mot de passe doit avoir au mois 8 caractere !")
	@Size(max = 12, message = "mot de passe doit avoir au maximum 12 caractere !")
	@Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$", message = "Mot de passe invalide")
	private String password;
	
	private List<AdressRequest> adresses;
	
	private ContactRequest contact;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<AdressRequest> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<AdressRequest> adresses) {
		this.adresses = adresses;
	}
	public ContactRequest getContact() {
		return contact;
	}
	public void setContact(ContactRequest contact) {
		this.contact = contact;
	}
	
	
	
}
