package global.sesoc.java1.exception;

//예외 처리
public class ExTest1 
{
	public static void main(String[] args) 
	{
		//초기값, 변수 선언 -> 꼭 해야 하는 곳
		String a = "10";
		String b = "0";
		int i, j, k;
		
		//예외 처리
		try
		{
			i = Integer.parseInt(a); // 문자열을 숫자로 변환 
			j = Integer.parseInt(b);
			k = i / j;		
			System.out.println(k);
		}
		catch(NumberFormatException e) // 예외 발생 대비
		{
			System.out.println("숫자가 아닙니다");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			//return;  		// finally로 이동해 일을 하고 프로그램 종료
			System.exit(0); //finally를 거치지 않고 프로그램 종료
		}
		catch(Exception e) 	// 상위 타입이므로 가장 뒤로 옮김 -> 다시 입력하라고 할 때 이 거 하나만 써도 됨
		{
			System.out.println("그 밖의 예외");
		}
		finally // 꼭 마무리해야 할 것이 있을 때 finally에 넣는다.
		{
			System.out.println("finally 블럭");
		}
		
		//마지막에 나와야 하는 부분
		System.out.println("프로그램을 종료합니다.");
	}
}
