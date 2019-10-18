import java.util.Scanner; 
class LoopTest 
{
	public static void main(String[] args) 
	{   // 반복 전에 한 번만 하는 단계
		Scanner scan = new Scanner(System.in);  
	    int n;
		int s = 0; // 계속 더해주기 위해 0으로 초기화함
		
		//for문 사용. 정수 5개 입력받아 합계
		for(int i = 0; i < 5; i++)
		{
			n = scan.nextInt(); //
			s = s + n; //입력한 숫자를 5번 더하게 하는 것
		}
		System.out.println("합계: " + s);	
		System.out.println(); 

		//while문 사용. 정수 반복 입력받아 합계. 0 입력하면 종료
		s = 0;
		while(true)
		{
			n = scan.nextInt();
			if(n == 0)
			{
				break; // 입력 받아 0이 되면 
			}
			s = s + n;
			
		}
		System.out.println("합계: " + s);
		System.out.println(); 

		// do ~ while문을 사용. 정수 반복 입력받아 합계. 0 입력하면 종료
		s = 0;
		do
		{
			n = scan.nextInt();
			s = s + n;
		}
		while (n != 0);
		System.out.println("합계: " + s);
		System.out.println(); 

		// 1부터 100까지의 홀수 계산
		s = 0;
		n = 0;
		while(n <= 100)
		{
			if(n % 2 == 1)
			{
				s = s + n;
			}
			n++;
		}
		System.out.println("합계: " + s);
		System.out.println();
		System.out.println();
		
		// 5 x 5 숫자 나오게 하는 방법
		n = 0;
		
		while(n < 5)
		{
			s = 0;
			while(s < 5 )
			{
				
				System.out.print(s + " ");
				s++;
			}
			System.out.println();
			n++;
		}
		System.out.println();
		

		//중첩된 while문 -> 0 1 2 3 4를 5줄 만듦
		int x, y;
		x = 0; // x를 쓰기 전에 0으로 만들어 테스트 준비
		while(x < 5)
		{
			y = 0; // y를 쓰기 전에 0으로 만들어 테스트 준비
			while(y < 5)
			{
				System.out.print(y + " ");
				y++; // y를 1에서 4까지 사용하기 위함
			}
			System.out.println(); // 5개 넣고 다음 줄로 옮기는 용도
			x++; // x를 1에서 4까지 사용하기 위함
		}
		System.out.println();

		// 1부터 25까지 나오는데 5줄로 끊음
		int a, b;
		int cnt = 0;
		a = 0; // a를 쓰기 전에 0으로 만들어 테스트 준비
		while(a < 5)
		{
			b = 0; // b를 쓰기 전에 0으로 만들어 테스트 준비
			while(b < 5)
			{
				cnt++;
				System.out.print(cnt + " ");
				b++; // b를 1에서 4까지 사용하기 위함
			}
			System.out.println(); // 5개 넣고 다음 줄로 옮기는 용도
			a++; // a를 1에서 4까지 사용하기 위함
		}
		System.out.println();

		// *을  5 x 5로 만듦 
		int i, j;

		i = 0;
		while(i < 5)
		{
			j = 0;
			while(j < 5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-------------");


		 /*
		 *****
		 ****
		 ***
		 **
		 *
		 ------------
		 */
		i = 0;
		while(i < 5)
		{
			j = 0;
			while(j < (5 - i))
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-------------");

		i = 0;
		int start = 3;
		int end = 3;
		while(i < 4)
		{
			j = 0;
			while(j < 7)
			{

				System.out.print("*");	
	
				j++;	
			}
			while(start <= 
			System.out.println();
			i++;
			start++;
			end--;
		}

	} // main
} // class