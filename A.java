class A
{
	public int num = 1;
	public A()	// 생성자 만들기
	{
		System.out.println("A클래스의 생성자");
	}

	public void print() 
	{
		System.out.println("A클래스의 메소드");
	}
}// class A

class B extends A
{
	public int num = 2;	// 상속받는 것이 아니라 새로 쓰겠다.
	public B()
	{
		super(); // 기본으로 생기는 것으로 클래스 A의 기본생성자를 호출한다. 지금은 생략해도 된다.
		System.out.println("B클래스의 생성자");
	}
	public void bMethod()
	{
		System.out.println("B클래스의 bMethod 메소드");
	}
	public void print() 
	{
		super.print(); // A클래스의 print()를 사용하겠다.
		System.out.println("B클래스의 print 메소드");
	}
}// class B

class C extends A
{
	public int num = 3;
	public C()
	{
		System.out.println("C클래스의 생성자");
	}
	public void cMethod()
	{
		System.out.println("C클래스의 bMethod 메소드");
	}
	public void print() 
	{
		System.out.println("C클래스의 print 메소드");
	}
}// class C