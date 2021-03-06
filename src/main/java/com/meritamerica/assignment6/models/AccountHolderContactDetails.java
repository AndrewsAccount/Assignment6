package com.meritamerica.assignment6.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Contact_Details")
public class AccountHolderContactDetails {

	// contact details for each account holder
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Integer id;
	@NotBlank   // @notblank/@notnull to ensure required fields
	@NotNull 
	String email;
	@NotBlank
	@NotNull
	Integer phoneNumber;
	
	// each set of Details is related to 1 one Account Holder and each Account Holder has only 1 set of Details
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountHolder_id", referencedColumnName = "accountHolder_id") // join by foreign key
	AccountHolder accountHolder;
	
	public AccountHolderContactDetails() {	// all persistent classes in must have default constructor for Hibernate to instantiate
	}

	//--- Getters/Setters
	public Integer getId() {
		return id;
	}

	public AccountHolderContactDetails setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public AccountHolderContactDetails setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public AccountHolderContactDetails setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public AccountHolderContactDetails setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
		return this;
	}	
}
