package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class PacketLocation implements Serializable {
	private String mac;
	private java.util.Date ts;
	@JsonIgnore
	private Double lon;
	@JsonIgnore
	private Double lat;
	@JsonIgnore
	private Double alt;

	public PacketLocation() {}
	public PacketLocation(String mac, java.util.Date ts, Double lon, Double lat, Double alt) {
		this.mac = mac;
		this.ts = ts;
		this.lon = lon;
		this.lat = lat;
		this.alt = alt;
	}

	public String getMac() {
		return this.mac;
	}
	public java.util.Date getTs() {
		return this.ts;
	}
	public Double getLon() {
		return this.lon;
	}
	public Double getLat() {
		return this.lat;
	}
	public Double getAlt() {
		return this.alt;
	}

	private String type = "location";
	public String getType() { return this.type; }

	public Location getLocation() {
        return new Location(this.lon, this.lat, this.alt);
    }
}