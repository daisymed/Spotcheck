package com.spotcheck.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;


@Entity
public class Account
{
	@Id
	String userId;
	String firstName;
	String lastName;
	String email;
	String password;

	/**
	 * Just making the default constructor private.
	 */
	private Account() {}

	/**
	 * Public constructor for Profile.
	 * @param userId The user id, obtained from the email
	 * @param firstName Any string user wants us to display him/her on this system.
	 * @param lastName Any string user wants us to display him/her on this system.
	 * @param email User's main e-mail address.
	 * @param password The User's account password
	 *
	 */
	public Account(String userId, String firstName, String lastName, String email, String password)
	{
		if (userId == null) userId = "default";
		if (firstName == null) firstName = "first name";
		if (lastName == null) lastName = "last name";
		if (email == null) email = "example@email.com";
		if (password == null) password = "password";

		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public void update(String firstName, String lastName, String email, String password)
	{
		if (firstName != null) this.firstName = firstName;
		if (lastName != null) this.lastName = lastName;
		if (email != null) this.email = email;
		if (password != null) this.password = password;
	}

	public String getFirstName() { return firstName; }

	public String getLastName() { return lastName; }

	public String getEmail() { return email; }

	public String getPassword() { return password; }

	public String getUserId() { return userId; }

}
