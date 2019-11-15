package global.sesoc.java1.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExTest2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
	
		while(true)
		{
			System.out.print("정수 입력: ");
			try
			{
				n = scan.nextInt(); // 잘못될 수 있는 부분을 try~catch로 감싼다.	
			}
			catch(InputMismatchException ex)
			{
				System.out.println("입력 오류. 다시 입력하세요.");
				scan.nextLine(); // 잘못 입력한 것 지우기
				continue; // 반복문의 조건으로 이동->while(true)로 이동
			}
			if(n == 0)
			{
				break; // 끝내겠다는 신호 -> 0대신 a를 입력하면 아무것도 못하고 뻗어버린다.
			}
			s = s + n;	
				
		}
		System.out.println("합계: " + s);
		
	}

}
