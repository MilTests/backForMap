package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class PacketStatus implements Serializable {
	private String mac;
	private java.util.Date ts;
	@JsonIgnore
	private Boolean isOnline;
	@JsonIgnore
	private String name;

	public PacketStatus() {}
	public PacketStatus(String mac, java.util.Date ts, Boolean isOnline, String name) {
		this.mac = mac;
		this.ts = ts;
		this.isOnline = isOnline;
		this.name = name;
	}

	public String getMac() {
		return this.mac;
	}
	public java.util.Date getTs() {
		return this.ts;
	}
	public Boolean getIsOnline() {
		return this.isOnline;
	}
	public String getName() {
		return this.name;
	}

	private String type = "status";
	public String getType() { return this.type; }

	public Status getStatus() {
        return new Status(this.isOnline, this.name);
    }
}