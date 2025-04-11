package com.forexcard.model;

import java.time.LocalDate;
import java.util.Date;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
=======
import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
>>>>>>> 0efe502 (Added 4 entities)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private LocalDate dob;
	private String gender;
	private String address;
	private String state;
	private String country;
	private String email;
<<<<<<< HEAD
	private Long   phonenumber;
	private String password;
	private String role;
	private double salary;
	private String pan;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
=======
	private Long phonenumber;
	private String password;
	private String role = "user";
	private double salary;
	private String pan;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private ForexCard forexCard;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, LocalDate dob, String gender, String address, String state, String country,
			String email, Long phonenumber, String password, String role, double salary, String pan,
			ForexCard forexCard) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.country = country;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.role = role;
		this.salary = salary;
		this.pan = pan;
		this.forexCard = forexCard;
	}

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public ForexCard getForexCard() {
		return forexCard;
	}

	public void setForexCard(ForexCard forexCard) {
		this.forexCard = forexCard;
	}

>>>>>>> 0efe502 (Added 4 entities)
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address
				+ ", state=" + state + ", country=" + country + ", email=" + email + ", phonenumber=" + phonenumber
<<<<<<< HEAD
				+ ", password=" + password + ", role=" + role + ", salary=" + salary + ", pan=" + pan + "]";
	}
	
=======
				+ ", password=" + password + ", role=" + role + ", salary=" + salary + ", pan=" + pan + ", forexCard="
				+ forexCard + "]";
	}
	
	
>>>>>>> 0efe502 (Added 4 entities)
}

	
	
	
	