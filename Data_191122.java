package myPractice;

import java.io.Serializable;

public class Data_191122 implements Serializable
{
	//변수 선언
	String name;
	int age;
	String address;
	
	//생성자
	public Data_191122() 
	{
		super();
		
	}

	public Data_191122(String name, int age, String address) 
	{
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//getter, setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	//toString
	@Override
	public String toString() {
		return "Data_191122 [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}//class Data_191122
