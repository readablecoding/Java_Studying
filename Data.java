package global.sesoc.java1.io;

import java.io.Serializable;

public class Data implements Serializable//Object�� �⺻������ ��ӹ޴´�. Serializable �������̽��� ��ӹ޾ƾ� ��Ʈ�� ��� ����
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //���� �̸� ����, ���� Ŭ�������� �Ǵ��Ѵ�.


	//���� ����
	String name;
	int age;
	String address;
	
	//������
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

	//getter, setter ����
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
