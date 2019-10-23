import java.util.Scanner;
class ArrayTest9 
{
	public static void main(String[] args) 
	{
		// 배열 생성하고 무작위 수 5개를 채움 ( 1 ~ 15 까지의 수로)
		// 사용자에게 정수 하나를 입력 받음
		// 입력받은 수가 배열 내에 있는지? -> 하나하나 확인을 해봐야 한다.

		// 1) 카운트 하는 변수 cnt를 활용하는 방법
		/*
		Scanner scan = new Scanner(System.in); // 입력 받을 준비
		int a[] = new int[5];	// int형 배열 5개 생성하고 0으로 초기화
		int cnt = 0;			// 일치한 수를 확인하기 위해 만든 변수

		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 15) + 1; // 임의 값을 배열에 순서대로 넣음
			for(int j = 0; j < i; j++)
			{
				if(a[i] == a[j])	// 뒤의 배열과 앞의 배열의 값이 같을 때
				{
					i--;			// 앞의 배열에 다시 값을 집어 넣기 위해 i를 1 감소
				}
			}	
		}
		
		/*
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " "); // 값이 어떻게 나왔는지 확인하는 용도
		}
		*/

		/*
		System.out.println();
		System.out.print("정수 1 ~ 15 까지 중 하나를 입력하세요 : ");	
		int n = scan.nextInt();	// 입력한 정수를 n에 대입
		
		
		for(int i = 0; i < a.length; i++)
		{
			if(n == a[i])
			{
				System.out.println("값이 일치합니다");	// 일치한다는 문구 보임
				cnt++;	// 값이 일치한다는 것을 보여주기 위해 cnt 값을 1 증가시킴
				break;	// for문을 벗어나는 용도
			}
		}

		if(cnt == 0)
		{
			System.out.println("값이 일치하지 않습니다");
		}
		*/
		

		// 2) 변수 i를 활용하는 방법
		Scanner in = new Scanner(System.in);
		int ar[] = new int[5];
		int i, num;
		
		for(i = 0; i < ar.length; i++)	// 0부터 4까지 반복
		{
			ar[i] = (int)(Math.random() * 15) + 1; // 1 ~ 15까지 숫자가 들어오게끔 만듦
		}
		System.out.print("정수를 입력하세요 : ");
		num = in.nextInt();
		 
		for(i = 0; i < ar.length ; i++)	// 0부터 4까지 반복
		{
			if(num == ar[i])
			{
				break; 
			}	
		}
		if(i == ar.length)	// i를 쓰기 위해 for문 전에 미리 i를 선언함. for문을 다 돌았을 때 break 안되면
		{
			System.out.println("X");
		}
		else
		{
			System.out.println("O");
		}
		
	} // main
}	// class
