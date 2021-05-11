package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="adress")
public class Address {
	@Id
private int houseNo;
private String cityName;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
}
