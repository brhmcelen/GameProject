package Entities;

import java.util.Date;

import interfaces.Entitys;


public class Player implements Entitys{
	
	int id;
	String userName;
	String firstName;
	String lastName;
	String tckn;
	Date dateOfBirth;
	
	public Player() {
		
		
		
		
	}

	public Player(int id, String userName, String firstName, String lastName,Date dateOfBirth,String tckn) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tckn = tckn;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
	

}
