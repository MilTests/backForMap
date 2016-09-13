package net.bonvio.model;

import java.io.Serializable;

public class Location implements Serializable {
	private Double lon;
	private Double lat;
	private Double alt;

	public Location() {}
	public Location(Double lon, Double lat, Double alt) {
		this.lon = lon;
		this.lat = lat;
		this.alt = alt;
	}	public Double getLon() {
		return this.lon;
	}
	public Double getLat() {
		return this.lat;
	}
	public Double getAlt() {
		return this.alt;
	}
}