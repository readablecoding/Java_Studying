// 이름, 생년월일, 키, 몸무게, 혈액형
// 예) 홍길동, 900101, 177.7. 88.8, 
import java.util.Calendar;
public class Member 
{
	// 속성
	private String name;
	private String birth;
	private double height;
	private double weight;
	private String type;


	

	// 생성자
	public Member()	// 생성자 만들어 놓기 
	{

	}
	public Member(String name, String birth) // 이름과 생일을 받는 생성자
	{
		this.name = name;
		this.birth = birth;
	}
	public Member(String name, String birth, double height, double weight, String type) // 모든 것을 다 받는 생성자
	{
		this(name, birth);
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	// Setters,  Getters -> 값 읽기, 값 돌려보내기

	public void setName(String n)
	{
		this.name = n;
	}
	public String getName()
	{
		return this.name;
	}

	public void setBirth(String b)
	{
		this.birth = b;
	}
	public String getBirth()
	{
		return this.birth;
	}

	public void setHeight(double h)
	{
		this.height = h;
	}
	public double getHeight()
	{
		return this.height;
	}


	public void setWeight(double w)
	{
		this.weight = w;
	}
	public double getWeight()
	{
		return this.weight;
	}


	public void setType(String t)
	{
		this.type= t;
	}
	public String getType()
	{
		return this.type.toUpperCase();
	}

	// 필요한 계산

	public int getAge()
	{
		Calendar c = Calendar.getInstance(); // calendar 클래스로 올해 년도 알기
		int year = Integer.parseInt(birth.substring(0, 2)); // Inter.parseInt는 문자열을 정수로 바꾸기
		int age = c.get(Calendar.YEAR) - 1900 - year;	// 올해 나이 구하기 
		if(age > 100)
		{
			age -= 100;
		}
		return age;
	}

	public double getBmi()
	{
		double bmi = Math.round(this.weight / Math.pow(height / 100.0, 2))* 100 / 100.0; // 소수점 둘째자리 까지 나타냄. Math.pow()는 제곱함수.
		return bmi;
	}

	public String getBmi(String msg)
	{
		double bmi = getBmi();
		String s = "";

		if(msg.equalsIgnoreCase("GRADE")) // GRADE라는 문자가 들어오면 어떤 반응이 나타나는가?
		{

			if(bmi < 18.5)
			{
				s = "저체중";
			}
			else if(bmi < 23.0)
			{
				s = "정상체중";
			}
			else if(bmi < 25.0)
			{
				s = "과체중";
			}
			else
			{
				s = "비만";
			}
		}
		return s;

	}
} // class
	
