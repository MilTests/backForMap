package net.bonvio.model;

import java.io.Serializable;

public class Status implements Serializable {
	private Boolean isOnline;
	private String name;

	public Status() {}
	public Status(Boolean isOnline, String name) {
		this.isOnline = isOnline;
		this.name = name;
	}	public Boolean getIsOnline() {
		return this.isOnline;
	}
	public String getName() {
		return this.name;
	}
}