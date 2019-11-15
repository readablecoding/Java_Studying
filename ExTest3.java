package global.sesoc.java1.exception;

//정수를 반복 입력받아 합계. 정수가 아닌 값이 들어오면 종료

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
		try
		{
			while(true) 
			{
				System.out.print("정수 입력 : ");
				n = scan.nextInt(); // 예외 발생 위치 - 정수가 아닌 게 들어오면 catch로 가니 while문 탈출한다.
				if(n < 0) throw new InputMismatchException(); // InputMismatchException를 만들어 catch가 예외를 처리하게끔 한다.	
				s = s + n;
			}
		}
		catch(InputMismatchException e) // catch문은 while문을 빠져나감.거기까지만 입력하게끔 한다.
		{
			System.out.println("음수를 입력했습니다.");
		}
		System.out.println("합계: " + s);
	}//main()
}//class Extest3 
