// 이름, 생년월일, 키, 몸무게, 혈액형
// 예) 홍길동, 900101, 177.7. 88.8, 
import java.util.Calendar; // 날짜, 시간 정보 활용
public class Member 
{
	// 속성
	private String name;	// 이름은 문자열로
	private String birth;	// 생년월일도 문자열로 해야 나중에 잘라 쓸 때 편하다.
	private double height;	// 키는 소수점까지 나오므로 double로 정함
	private double weight;	// 키는 소수점까지 나오므로 double로 정함
	private String type;	// 혈액형은 A, B, O, AB 이렇게 2글자도 나오므로 char가 아닌 String으로 한다.

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
		this(name, birth); // 다른 생성자를 호출해서 name과 birth를 가져옴
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	// Setters,  Getters -> 값 읽기, 값 돌려보내기

	public void setName(String n)	// 값을 읽어서 보관
	{
		this.name = n;
	}
	public String getName()			// 보관한 값을 돌려보냄
	{
		return this.name;
	}

	public void setBirth(String b)	// 값을 읽어서 보관
	{
		this.birth = b;
	}
	public String getBirth()		// 보관한 값을 돌려보냄
	{
		return this.birth;
	}

	public void setHeight(double h)		// 값을 읽어서 보관
	{
		this.height = h;
	}
	public double getHeight()		// 보관한 값을 돌려보냄
	{
		return this.height;
	}


	public void setWeight(double w)		// 값을 읽어서 보관
	{
		this.weight = w;
	}
	public double getWeight()		// 보관한 값을 돌려보냄
	{
		return this.weight;
	}


	public void setType(String t)		// 값을 읽어서 보관
	{
		this.type= t;
	}
	public String getType()			// 보관한 값을 돌려보냄
	{
		return this.type.toUpperCase(); // 대문자로 보여줌
	}

	// 필요한 계산

	public int getAge()	
	{
		Calendar c = Calendar.getInstance(); // calendar 클래스를 통해 가져온 정보를 c에 현재 날짜와 시간 정보를 가진 객체를 생성
		int year = Integer.parseInt(birth.substring(0, 2)); // Inter.parseInt는 문자열을 정수로 바꾸기, 처음 두자리 숫자를 통해 태어난 년도 구함
		int age = c.get(Calendar.YEAR) - 1900 - year;	// 올해 나이 구하기 -> 95년생이면 2019-1900-95의 값인 24가 나온다.
		if(age > 100)
		{
			age -= 100;
		}
		return age;
	}

	public double getBmi()
	{
		double bmi = Math.round(this.weight / Math.pow(height / 100.0, 2))* 100 / 100.0; // 소수점 둘째자리 까지 나타냄. Math.pow()는 제곱함수로 100을 곱한 후에 100.0으로 나누면 소수점 첫째자리 반올림
		return bmi;
	}

	public String getBmi(String msg)
	{
		double bmi = getBmi(); // getBmi()를 호출함
		String s = ""; // 문자열 변수 s를 초기화시킴

		if(msg.equalsIgnoreCase("GRADE")) // GRADE라는 문자가 들어오면 bmi 값에 따라 비만 여부를 보여주게 만든다.
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
	