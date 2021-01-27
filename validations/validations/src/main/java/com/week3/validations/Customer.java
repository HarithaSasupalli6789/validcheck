package com.week3.validations;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	//@NotEmpty(message ="no null")
	@NotNull(message="null not allowed")
	@Min(value=1, message="<1")
	@Max(value=10,message=">1")
	private int no;
	
	@NotNull(message="null value is not allowed")
	@Size(min=5, message="size is less than 5")
	private String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
