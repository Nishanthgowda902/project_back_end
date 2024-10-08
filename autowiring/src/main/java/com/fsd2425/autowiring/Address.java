package com.fsd2425.autowiring;

public class Address {
	private String place;
	private String city;
	private String pin;
	
	public Address() {}

	public Address(String place, String city, String pin) {
		super();
		this.place = place;
		this.city = city;
		this.pin = pin;
	}
	public Address(String place, String city) {
		super();
		this.place = place;
		this.city = city;
		this.pin = "PIN NOT DEFINED";
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return("{\"Place\":\""+place+"\",\n\"City\":\""+city+"\",\n\"Pin\":\""+pin+"\"}");
	}

}


