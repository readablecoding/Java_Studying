import java.util.Scanner;
class HomeWork_191018 
{
	public static void main(String[] args) 
	{
		// 문제 1번 : 정수를 입력받아 1부터 그 수까지의 합계 구하기
		Scanner in = new Scanner(System.in);
		int n; // 입력 받을 변수
		int s = 0; //합계를 모을 변수
		System.out.println("문제 1번 : 정수를 입력 받아 1부터 그 수까지의 합계 구하기");
		System.out.println("정수를 입력하고 엔터를 누르세요. 1이상 입력해야 합니다.");
		while(true)
		{
			n = in.nextInt(); // 입력 받는 양의 정수를 n에 대입
			if(n <= 0) // n이 0이거나 0보다 작으면 break를 통해 while문을 빠져나간다.
			{
				System.out.println("1이상 입력하지 않아 프로그램을 종료합니다."); 
				break;
			}
			s = s + n ; // s에 n값을 누적한다.
		}
		System.out.println("합계는 " + s + "입니다."); // 합계를 보여줌
		System.out.println("------------------------------------------------------------");   // 한 줄 띄기




		// 문제 2번 : 100의 모든 약수를 출력
		System.out.println("문제 2번: 100의 모든 약수를 출력");
		n = 2;
		System.out.print("100의 모든 약수는 ");
		while(n <= 100)
		{

			if(100 % n == 0) // 100을 n과 나눠서 나머지가 0이면 100의 약수가 된다.
			{	
				System.out.print(n + " ");
				n++;
			}
			else
			{
				n++;
			}   
		}
		System.out.print("입니다");
		System.out.println();
		System.out.println("------------------------------------------------------------");
		

		// 문제 3번 입력받은 숫자의 n! 구하기
		System.out.println("문제 3번 :  입력받은 숫자의 n! 구하기");
		System.out.print("정수 입력 : ");
		n = in.nextInt();
		int m = n; // 나중에 n의 값을 그대로 보여주기 위해 m에 저장함
		double sum = 1;
		if(m < 1 || m > 100)
		{
			System.out.println("1 ~ 100 사이의 수를 입력하세요");
			return; 
		}
		while(m > 0)
		{
			sum = sum * m;
			m--;
			
		}
			System.out.println(n + "! = " + (int)sum);
			System.out.println("------------------------------------------------------------");
		

		// 문제 4번 : 입력 받은 수 범위 내에서 3의 배수이거나 7의 배수인 수의 개수
		System.out.println("문제 4번 : 입력 받은 수 범위 내에서 3의 배수이거나 7의 배수인 수의 개수");
		System.out.println("정수를 입력해주세요. 10까지만 입력됩니다.");
		n = 0;
		int cnt = 0;
		for(int i = 0; i < 10; i++)  // 10개까지만 받는다.
		{
			n = in.nextInt();
			if(n <= 0 )
			{	
				System.out.println("잘못 입력했습니다. 다시 입력하세요");
				n = in.nextInt();
			}
			if((n % 3 == 0) || (n % 7 == 0))
			{
				cnt++;
			}
		}
		System.out.println("3의 배수이거나 7의 배수는 " + cnt + "개 입니다.");

		/* 메모하는 부분
		입력받은 수는 무조건 1이상이어야 한다. 1보다 작으면 종료. (입력 받은 수의 변수명) < 1 -> 종료
		결과는 무조건 cnt만 나오도록 한다.
		(입력받은 수) % 3 == 0 || (입력받은 수) % 7 == 0
		그러면 cnt++;
		다 끝나고 System.out.println("3의 배수이거나 7의 배수는 " + cnt + "개 입니다.");
		for(int cnt = 0; (n % 3 == 0) || (n % 7 == 0); cnt++)
		*/

	} // main
} // class
