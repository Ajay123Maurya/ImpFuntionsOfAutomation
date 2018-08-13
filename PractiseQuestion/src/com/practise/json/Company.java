package com.practise.json;

import java.util.List;

public class Company {
	private String name;
	private String address;
    private String cEOName;
	
    private List<String> meetingRooms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getcEOName() {
		return cEOName;
	}

	public void setcEOName(String cEOName) {
		this.cEOName = cEOName;
	}

	public List<String> getMeetingRooms() {
		return meetingRooms;
	}

	public void setMeetingRooms(List<String> meetingRooms) {
		this.meetingRooms = meetingRooms;
	}

}
