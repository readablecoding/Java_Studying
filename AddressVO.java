package workbook.address3.vo;

import java.io.Serializable;

/**
 * 회원 정보를 담을 VO 클래스 -> 한 사람의 정보가 담긴다
 */
public class AddressVO implements Serializable 
//implements Serializable를 통해 객체 직렬화, implements Serializable가 없으면 객체 저장이 안된다.
{
	//멤버변수 선언 -> 어떤 데이터를 다룰 것인가? private로 변경 못하게 하고 public인 메소드로 접근하게 함
	/**
	 * 회원 번호
	 */
	private int num; 
	/**
	 * 이름
	 */
	private String name;
	/**
	 * 전화번호
	 */
	private String phone;
	/**
	 * 주소
	 */
	private String address;
	
	/**
	 * 기본 생성자
	 */
	public AddressVO() 
	{
		
	}

	/**
	 * 초기값을 전달받아 초기화하는 생성자
	 * @param num 		회원번호
	 * @param name 		이름
	 * @param phone 	전화번호
	 * @param address 	주소
	 */
	public AddressVO(int num, String name, String phone, String address) 
	{
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * Setter, Getter 메소드들
	 */
	public int getNum() //외부에서 그 객체 안에 어떤 값을 읽고 싶을 때, 이게 없으면 외부에서 읽을 수 없다.
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	@Override
	public String toString() //데이터 출력시 편하게 하는 방법을 toString()을 오버라이딩. 꼭 만들어 놓기
	{
		return "회원번호:" + num + ", 이름:" + name + ", 전화번호:" + phone + ", 주소:" + address;
	}
}
