package com.richfaces.test;

import javax.faces.bean.*;


@ManagedBean(name="helloworld")
@RequestScoped
public class HelloWorld {
	
	private String name ="Hello World";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
