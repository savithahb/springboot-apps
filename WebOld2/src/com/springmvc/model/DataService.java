package com.springmvc.model;

import org.springframework.stereotype.Service;

@Service
public class DataService {

	public String[] getPeople() {
		String n[]= {"Savitha","Monisha","Kumar","Saroja"};
		return n;
	}
	
}
