package com.Registration.model;

import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="user",uniqueConstraints = @UniqueConstraint(columnNames="username"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String  bday;
	private String phnumber;
	private String email;
	private String country;
	private String state;
	private String username;
	private String password;
	private String createddate;
	private String createdby;
	private String updateddate;
	private String updatedby;
	private String status;

	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name="users_role",
			joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
	
	private Collection<Role> role;

	
	public User(String name, String bday, String phnumber, Collection<Role> role, String email, String country, String state, String username, String password, String createddate, String createdby, String updatedby, String updateddate, String status) {
		super();
		this.name = name;
		this.bday = bday;
		this.phnumber = phnumber;
		this.email = email;
		this.country = country;
		this.state = state;
		this.username = username;
		this.password = password;
		this.createddate = createddate;
		this.createdby = createdby;
		this.updateddate = updateddate;
		this.updatedby = updatedby;
		this.status = status;
		this.role = role;
	}
	public User() {}
	public User(String name, String username, String password, List<Role> asList) {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Collection<Role> getRole() {
		return role;
	}
	public void setRole(Collection<Role> role) {
		this.role = role;
	}
	

}
