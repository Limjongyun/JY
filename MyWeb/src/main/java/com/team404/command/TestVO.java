package com.team404.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter
@AllArgsConstructor //모든변수 초기화 생성자
@NoArgsConstructor //기본생성자
public class TestVO {

	@Override
	public String toString() {
		return "TestVO [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private int age;
	private String name;
	private String id;
	public TestVO(int age, String name, String id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public TestVO() {
		
	}
	
}
