abstract class Human			// 추상 클래스, 객체 생성을 못함, 
{	
	protected abstract void say(); // 추상 메소드, 하위클래스에서 반드시 오버라이딩 해야함
	
}// class

class English extends Human
{
	//super()
	public void say()
	{
		System.out.println("예스");
	}
	
}// class English

class Korean extends Human
{
	public void say()
	{
		System.out.println("예");
	}
}// class Korean

class Japanese extends Human
{
	public void say()
	{
		System.out.println("하이");
	}
}// class Korean
