package com.example.demo;

public class Trigger {
	private int eventid;
	private int customerid;
	private String sourcename;

	public Trigger(int eventid, int customerid, String sourcename) {
		this.eventid = eventid;
		this.customerid = customerid;
		this.sourcename = sourcename;
	}

	public int getEventid() {
		return eventid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public String getSourcename() {
		return sourcename;
	}

}
