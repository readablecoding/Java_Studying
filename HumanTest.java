class HumanTest 
{
	public static void main(String[] args) 
	{
		test(new Korean());	// test()메소드를 호출해 처리하고 돌아오게끔 한다.
		test(new English());
		test(new Japanese());
		
	}// main

	public static void test(Human ob) // Human 타입으로 받으면 Human 타입 뿐만 아니라 하위 클래스의 값을 받을 수 있다. Object는 say()를 못 알아본다.
	{
		ob.say();
		if(ob instanceof Korean)
		{
			System.out.println("한국어입니다.");
		}
		else if(ob instanceof English)
		{	
			System.out.println("영어입니다.");
		}	
		else if(ob instanceof Japanese)
		{
			System.out.println("일본어입니다.");
		}

	}

}// class
