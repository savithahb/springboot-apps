package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZCompany implements Company {
	
	private BusinessOperation branch;
	@Autowired
	private Process accounting;
	@Autowired
	private Process production;
	
	
	public XYZCompany(BusinessOperation branch) {
		super();
		this.branch = branch;
	}


	@Override
	public void establish (String name) {
			//todo auto generated method stub
			System.out.println("Registered and Started "+name+" Company");
			branch.perform("Bengaluru");
			accounting.process("Second Quarter");
			production.process("Nuts and Bolts");
	}
}
