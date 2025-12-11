package com.setec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booked {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)    
	  private Integer id;
	  private String name;
	  private String phoneNumber;
	  private String email;
	  private String date;
	  private String time;
	  private int person;
	  
	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getPhoneNumber() {
	    return phoneNumber;
	  }

	  public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getDate() {
	    return date;
	  }

	  public void setDate(String date) {
	    this.date = date;
	  }

	  public String getTime() {
	    return time;
	  }

	  public void setTime(String time) {
	    this.time = time;
	  }

	  public Integer getPerson() { return person; }
	  public void setPerson(Integer person) { this.person = person; }

	  @Override
	  public String toString() {
	      return "Booked{" +
	              "id=" + id +
	              ", name='" + name + '\'' +
	              ", phoneNumber='" + phoneNumber + '\'' +
	              ", email='" + email + '\'' +
	              ", date='" + date + '\'' +
	              ", time='" + time + '\'' +
	              ", person=" + person +
	              '}';
	  }

}
