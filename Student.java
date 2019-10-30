// 사용자 정의 자료형
class Student // Student는 자료형을 의미한다.
{
	// 속성 = 변수 (멤버 변수, 필드)
	// 접근지정자 (public > protected > (default) > private)
	// private을 붙여 외부에서 값을 변경 못하게 하고 나만 수정이 가능
	private String name;	//  학생이름 -> 외부에서 값을 못 넣는다.
	private int kor;		//  국어점수 -> 외부에서 값을 못 넣는다.
	private int eng;		//  영어점수 -> 외부에서 값을 못 넣는다.
	private int mat;		//  수학점수 -> 외부에서 값을 못 넣는다.

	// 기능 = 메서드
	// 1) 국어 점수
	public void setKor(int k) //k라는 변수가 생겨 100을 넣음. 돌려보내지 않음 -> 값 수정
	{
		if(k < 0 || k > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.kor = k;
	}
	public int getKor()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기
	{
		return kor;			// 나를 부른 곳으로 값을 보내준다. 
	}

	// 2) 영어 점수
	public void setEng(int e) //k라는 변수가 생겨 100을 넣음. 돌려보내지 않음 -> 값 수정
	{
		if(e < 0 || e > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.eng = e;
	}
	public int getEng()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기
	{
		return eng;			// 나를 부른 곳으로 값을 보내준다. 
	}
	
	// 3) 수학 점수
	public void setMat(int m) //k라는 변수가 생겨 100을 넣음. 돌려보내지 않음 -> 값 수정
	{
		if(m < 0 || m > 100)
		{
			return;	// 잘못 입력시 끝냄
		}
		this.mat = m;
	}
	public int getMat()	// parameter가 없다. int형으로 돌려보냄 -> 값 읽기
	{
		return mat;			// 나를 부른 곳으로 값을 보내준다. 
	}

	public void print()
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
	}

} //class Student
