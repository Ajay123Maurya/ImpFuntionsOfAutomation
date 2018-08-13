package com.practise.json;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDemo {

	public static void main(String[] args) {
		Company company = new Company();
		company.setAddress("Power2Sme pvt ltd, Udyog Vihar Phase 4, Gurgaon, Haryana, 122001");
		company.setName("Power2Sme Pvt Ltd");
		company.setcEOName("R. Narayan");
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Vallabhi");
		ar.add("Tashila");
		ar.add("Surug");
		
		company.setMeetingRooms(ar);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(company));
	}
}

