class InheritTest 
{
	public static void main(String[] args) 
	{
		A ob1 = new A();				// A클래스의 생성자 -> 생성자를 이용해 A라는 클래스의 객체 생성. ob1이 레퍼런스 변수이다.
		ob1.print();					// A클래스의 메소드 -> public이라서 변수명으로 접근 가능.
		System.out.println(ob1.num);	// 1 -> 객체 안에 있는 변수의 값을 출력
		System.out.println();
		
										// A클래스의 생성자
		B ob2 = new B();				// B클래스의 생성자 -> 하위 클래스 객체를 만들 때 상위 클래스 객체가 먼저 실행된다.그래서 A클래스의 생성자가 먼저 나옴
		ob2.print();					// B클래스의 print 메소드 -> 메소드 재정의를 하니까 외부부터 먼저 찾는다. 오버라이딩은 상속받은 것을 다시 만드는 것
		System.out.println(ob2.num);	// 2
		System.out.println();

										// A클래스의 생성자
		A ob3 = new B();				// B클래스의 생성자 -> A ob3는 A클래스를 가리킨다. B라는 타입의 객체를 만들지만 A ob3는 B 객체를 보지 못해 있는지도 모른다.
		ob3.print();					// B클래스의 print 메소드
		System.out.println(ob3.num);	// 1
		//ob3.bMethod();				// cannot find symbol
		//System.out.println(ob3 instanceof B);	// true
		//System.out.println(ob3 instanceof A);	// true
		((B)ob3).bMethod();				// B클래스의 bMethod 메소드 -> 원래 주소를 B 타입으로 바꾼다. 좀 지저분한 방법
		B ob4 = (B) ob3;				// ob3가 B 타입이라는 것을 나타내는 깔끔한 방법 -> 변수 ob4가 b
		ob4.bMethod();					// B클래스의 bMethod 메소드
		//System.out.println(ob4 instanceof B);	// true
		//System.out.println(ob4 instanceof A);	// true
		ob4.print();					// B클래스의 print 메소드	
		System.out.println();
	}// main()
}// class
