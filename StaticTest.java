class StaticTest 
{
	public static void main(String[] args) 
	{
		StaticObject.printCnt(); // cnt는 0 
		// -> -> 첫번째로 실행되는 곳. static이므로 객체 안 만들어진 상태에서 실행됨
		System.out.println();
		StaticObject a = new StaticObject(); // 객체 하나 생성 
		System.out.println();
		// -> StaticObject라는 객체를 만들어라. 객체 생성시 생성자가 있으면 호출함
		// -> num은 새로 만들었으니 1이 됨. cnt는 계속 같이 쓰고 있으니 누적해서 0에서 1로 됨
		a.printNum();	// num은 1 
		a.printCnt();	// cnt는 1 
		System.out.println();
		StaticObject b = new StaticObject(); // 객체 하나 생성
		System.out.println();
		// -> num은 새로 만들었으니 1이 됨. cnt는 계속 같이 쓰고 있으니 누적해서 1에서 2로 바뀜
		b.printNum();	// num은 1 
		b.printCnt();	// cnt는 2 
		System.out.println();
		
	} //main
} //class
