package com.kpeet.springCrud.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long location_id;
	
	private String address;
	private String street_number;
	private String route;
	private String locality;
	private String administrative_area_level_1;
	private String country;
	private double latitude;
	private double longitude;
	private int metersPerHour;

	public long getLocation_id() {
		return location_id;
	}
	public void setLocation_id(long location_id) {
		this.location_id = location_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getAdministrative_area_level_1() {
		return administrative_area_level_1;
	}
	public void setAdministrative_area_level_1(String administrative_area_level_1) {
		this.administrative_area_level_1 = administrative_area_level_1;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public int getMetersPerHour() {
		return metersPerHour;
	}
	public void setMetersPerHour(Integer metersPerHour) {
		this.metersPerHour = metersPerHour;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
