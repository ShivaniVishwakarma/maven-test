package com.luv2.code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver_1 {

	public static void main(String[] args) {
		
		try {
			
			//Create ObjectMapper
			ObjectMapper mapper = new ObjectMapper();
			
			//Read the JSON file data/sample-lite.json and convert it to java POJO
			Student myStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//Print out firstName and lastName:
			System.out.println("First name : " + myStudent.getFirstName());
			System.out.println("Last name : " + myStudent.getLastName());
			
			//Print out address: city and state
			Address add = myStudent.getAddress();
			System.out.println("City : " + add.getCity());
			System.out.println("State : " + add.getState());
			
			//Print out languages:
			System.out.println("Languages:");
			for (String lang : myStudent.getLanguages()) {
				System.out.println(lang);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
