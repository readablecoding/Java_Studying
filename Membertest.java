public class Membertest
{
	public static void main(String[] args) 
	{
		/*
		Member a = new Member(); // 모든 멤버변수가 null또는 0.0으로 초기화
		Member b = new Member("홍길동", "010101"); // 이름과 생년월일만 초기화
		Member c = new Member("김철수", "991111", 161.0, 56, "AB"); // 모든 변수 초기화

		c.setHeight(155.5); // 키 수정
		System.out.println(c.getName());	 // 이름 읽기 -> 김철수
		System.out.println(c.getAge());		// 나이 읽기 -> 20
		System.out.println(c.getBmi());		// BMI 지수, 19.5처럼 실수형으로 리턴 -> 23.159396615006052
		System.out.println(c.getBmi("GRADE")); // 저체중, 비만 등 문자열로 리턴 -> 정상
		*/

		Member array[]; // array는 주소를 담는 레퍼런스 변수 생성
		array = new Member[5]; // 배열이 만들어졌다. 멤버 타입 배열 5개를 만드는 것. null로 초기화됨
		array[0] = new Member("김", "110101");  //new는 객체를 만드는 것 
		array[1] = new Member("이", "990909");
		array[2] = new Member("박", "880808");

		System.out.println(array[1].getName()); // 이 -> array[1]는 멤버 객체의 주소이므로 .을 찍고 name을 쓴다. private이라 외부 접근 불가. getName()으로 접근 가능 이름을 가져왔으니 String이 된다.
		System.out.println(array[1].getName().length()); // 1 -> int값 길이를 보여준다.
		System.out.println(array[2].getBirth().charAt(0)); // 8 -> char값 한 글자만 읽어온다. 
		System.out.println();

		//첫번째 회원의 출생년도를 int형으로 읽어서 출력 -> 2011년도라면 11이 나오게 함
		System.out.println(Integer.parseInt(array[0].getBirth().substring(0, 2))); // 11
	
	} // main
} // class
