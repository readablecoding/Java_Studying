package myPractice;

public class ThrowTest191116 
{

	public static void main(String[] args) 
	{
		try
		{
			summary(); //at myPractice.ThrowTest.main(ThrowTest.java:10)
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//main()
	
	//선언부의 throws Exception는 divide() 메소드에서 Exception 객체가 발생되어 예외처리를 호출된 곳으로 던질 수 있다.
	public static int divide(int n, int m) throws Exception
	{
		return n / m;
	}
	
	//선언부의 throws Exception는 summary() 메서드에서 Exception 객체가 발생되어 예외처리를 호출된 곳으로 던질 수 있다.
	public static void summary() throws Exception
	{
		try
		{
			System.out.println("계산결과 : " + divide(10,0)); //divide() 메서드 호출
		}
		catch(Exception e) 
		{
			throw new Exception("계산 오류"); //at myPractice.ThrowTest.summary(ThrowTest.java:33)
			//새로운 예외 객체 Exception을 생성하여 "계산 오류"라는 메시지를 탑재, summary()메소드를 호출한 main()메소드로 예외처리 책임을 넘김
		}
	}//summary()

}//class ThrowTest
