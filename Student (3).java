// 사용자 정의 자료형
class Student // Student는 자료형을 의미한다.
{
	// 1) 속성 = 변수 (멤버 변수, 필드)
	// -> 접근지정자 (public > protected > (default) > private)
	// -> private을 붙여 외부에서 값을 변경 못하게 하고 나만 수정이 가능
	private String name;	//  학생이름 -> 외부에서 값을 못 넣는다. 외부 접근 금지
	private int kor;		//  국어점수 -> 외부에서 값을 못 넣는다. 외부 접근 금지
	private int eng;		//  영어점수 -> 외부에서 값을 못 넣는다. 외부 접근 금지
	private int mat;		//  수학점수 -> 외부에서 값을 못 넣는다. 외부 접근 금지
	
	// 2) 생성자: 특정 값을 가진 채 만들고 싶은 것. 
 	public Student() // 
	{
		name = "이름없음";
		kor	= 0;
		eng = 0;
		mat = 0;
	}

	public Student(String name)	//String 타입의 이름를 받아 초기화
	{
		this.name = name; 
		//System.out.println(this.name); -> 확인용으로 실제 코드에 안 나오게 함
	}
	
	public Student(int kor, int eng, int mat)	// 정수 3개를 넣고 초기화
	{	
		this();	//같은 클래스 내의 다른 생성자를 호출
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//System.out.println(this.kor + ", " + this.eng + ", " + this.mat); -> 확인용으로 실제 코드에 안 나오게 함
	}

	public Student(String name, int kor, int eng, int mat) //이름, 점수로 초기화
	{
		this(kor, eng, mat); // 다른 생성자를 호출해서 처리하라고 하는 것
		this.name = name;	// 이 생성자는 여기서 추가적으로 name만 하는 것
		//System.out.println(this.name + ", " + this.kor + ", " + this.eng + ", " + this.mat); -> 확인용으로 실제 코드에 안 나오게 함
	}

		


	// 3) 기능 = 메서드
	// 1. 국어 점수 입력받고 돌려보내기
	public void setKor(int k) //k라는 변수가 생겨 100을 넣음. 돌려보내지 않음 -> 값 수정 용도
	{
		if(k < 0 || k > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.kor = k;
	}
	public int getKor()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기 용도
	{
		return kor;			// 나를 부른 곳으로 값을 보내준다. 
	}

	// 2. 영어 점수 입력받고 돌려보내기
	public void setEng(int e) //e라는 변수가 생겨 90을 넣음. 돌려보내지 않음 -> 값 수정 용도
	{
		if(e < 0 || e > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.eng = e;
	}
	public int getEng()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기 용도
	{
		return eng;			// 나를 부른 곳으로 값을 보내준다. 
	}
	
	// 3. 수학 점수 입력받고 돌려보내기
	public void setMat(int m) //m이라는 변수가 생겨 80을 넣음. 돌려보내지 않음 -> 값 수정 용도
	{
		if(m < 0 || m > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.mat = m;
	}
	public int getMat()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기 용도
	{
		return mat;			// 나를 부른 곳으로 값을 보내준다. 
	}

	// 4. 이름, 국어점수, 영어점수, 수학점수를 차례차례 보여주기 위한 용도 -> 이렇게 만들면 안된다.
	public void print() 
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
		return;
	}
	
	// 5.  총점 구하여 리턴하는 메서드
	public int getTotal()	// 총점 메서드 -> 외부 접근 가능, int를 리턴, 외부전달 값은 없다.
	{
		int t = kor + eng + mat;	// 객체의 국어, 영어, 수학 점수 합산 , t는 메서드에서 만들었으니 지역변수로 여기서만 존재
		return t;					// 총점을 t에 담아 돌려 보냄
	}

	// 6.  평균 구하여 리턴하는 메서드
	public double getAvg()	// 평균 메서드 -> 외부 접근 가능, double로 리턴, 외부전달 값은 없다.
	{
		double d = this.getTotal() / 3.0; // 총점을 개수로 나눈 값을 double형 변수 d에 담음 . 3.0으로 나눠야 소수점 아래까지 나옴.
		return d;	// d를 호출한 곳으로 돌려 보냄
	}

	// 7.  등급 구하여 리턴하는 메서드: 수 ~ 가까지의 등급을 리턴
	public String getGrade()
	{
		if(this.getAvg() >= 90.0)
		{
			String g = "수";
			return g;
		}
		else if(this.getAvg() >= 80.0 && this.getAvg() < 90.0)
		{
			String g = "우";
			return g;
		}
		else if(this.getAvg() >= 70.0 && this.getAvg() < 80.0)
		{
			String g = "미";
			return g;
		}
		else if(this.getAvg() >= 60.0 && this.getAvg() < 70.0)
		{
			String g = "양";
			return g;
		}
		else
		{
			String g = "가";
			return g;
		}

		/*
		String g = null; //객체를 가리키지 않는 것 , " "는 객체가 있다는 것이다.
		switch((int) getAvg() / 10)
		{
			case 10: case 9:
				g = "수";
				break;
			case 8:
				g = "우";
				break;
			case 7:
				g = "우";
				break;
			case 6:
				g = "우";
				break;
			default:
				g = "가";
		}
		return g;			
		*/

	}



} //class Student
