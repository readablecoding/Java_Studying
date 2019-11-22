package global.sesoc.java1.io;

import java.io.Serializable;

public class Data implements Serializable//Object를 기본적으로 상속받는다. Serializable 인터페이스를 상속받아야 스트림 사용 가능
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //버전 이름 설정, 같은 클래스인지 판단한다.


	//변수 선언
	String name;
	int age;
	String address;
	
	//생성자
	public Data() 
	{
		super();
	}

	public Data(String name, int age, String address) 
	{
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//getter, setter 생성
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	//toString()
	@Override
	public String toString() 
	{
		return "Data [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}//class Data
