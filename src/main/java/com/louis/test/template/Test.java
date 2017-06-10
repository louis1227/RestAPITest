package com.louis.test.template;

import com.louis.test.template.annotation.RestAPI;

public class Test {
	
	
	private String id;
	
	
	@RestAPI(value="haha")
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	@RestAPI(id="haha")
	public void print(){
		System.out.println("id="+id);
	}

}
