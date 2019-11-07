class WrapperTest 
{
	public static void main(String[] args) 
	{
		int a = 10;
		Integer b = new Integer(10);
		String c = "10";

		//값 출력: 모두 10이라는 것이 보이게 된다.
		/*
		System.out.println(a);	// 10
		System.out.println(b);	// 10
		System.out.println(c);	// 10
		*/
		
		// System.out.println("결과는" + (a + a))'; // 괄호를 써야 한다.
		System.out.println();
		System.out.println(a + a);	//20
		System.out.println(a + c);	//1010
		System.out.println(a + "" + b);	//1010
		System.out.println(Integer.toString(a) + b.toString());	//1010 -> int를 String으로 바꾸고, 객체를 String으로 바꾸는 것 
		// Integer.toString(a)은 static이고 parameter를 받는 것이고 b.toString()은 일반 메소드 중 parameter를 받지 않는 것
		System.out.println(a + b.intValue());	//20 -> 객체를 int로 바꿔서 10 + 10을 하는 것


		//기본자료형 -> Wrapper 객체 변환
		Integer d = new Integer(a); // int형 a를 Integer 생성자로 줘 객체 만들기.

		//기본자료형 -> String 변환: 객체를 사용하지 않고 변환
		String e = Integer.toString(a); // static인 Integer.toString()메소드를 쓰면 int를 문자열로 바꿔줌
		//String e = (String) a;			// a는 int형인데 클래스이름으로 형변환한다는 것은 불가능하다. 에러 발생
	
		//String -> Wrapper 객체 변환
		Integer f = new Integer(c); // 생성자 값으로 받아 맘들기

		//String -> 기본자료형 변환
		int g = Integer.parseInt(c); // 문자열을 int로 바꿔줌. 

		//Wrapper 객체 -> 기본자료형 변환
		int h = b.intValue();

		//Wrapper 객체 -> String 변환
		String i = b.toString();



		Integer x = new Integer(100);	// 100이라는 숫자를 보관하는 객체를 만들어 변수 x가 주소를 참조한다.
		Integer y = new Integer(100);	
		// 객체끼리 비교연산은 할 수 없다.
		System.out.println(x == y);	//false -> 주소비교. 객체는 서로 다른 주소를 갖고 있어서 false 나옴
		System.out.println(x > y);	//false	
		System.out.println(x < y);	//false
		System.out.println(x.compareTo(y)); // 0 -> 내용 비교. 같으면 0, 왼쪽이 크면 1 오른쪽이 크면 -1

		/* String 문자열 비교
		String m = "a";
		String n = "c";
		System.out.println(m.compareTo(n)); // -2
		*/

	}//main()
}//class
