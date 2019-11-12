interface Human				// 인터페이스, 객체 생성을 못함, 상수와 추상메소드로만 이루어짐
{	
	public static final int a = 0;	// 메모리에 하나만 생기고 Human.a 하면 상수 0을 리턴함
	protected abstract void say(); // 추상 메소드, 하위클래스에서 반드시 오버라이딩 해야함
	
}// interface

class English implements Human		// 인터페이스는 상속받을 때 implements를 써야 한다.
{
	//super()
	public void say()
	{
		System.out.println("예스");
	}
	
}// class English

class Korean implements Human
{
	public void say()
	{
		System.out.println("예");
	}
}// class Korean

class Japanese implements Human
{
	public void say()
	{
		System.out.println("하이");
	}
}// class Japanese