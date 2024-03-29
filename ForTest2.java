class ForTest2 
{
	public static void main(String[] args) 
	{
		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0; //합계를 보여줄 변수는 for문 전에 미리 선언함
		for(int i = 1; i <= 10; i++)
		{
			sum = sum + i; //처음 sum의 값에 i의 값을 더하고 그것을 다시 sum에 넣는다.
		}
		System.out.println("1 ~ 10 합계 : " + sum);	

		
		
		
		// 1 ~ 100 중에서 홀수의 합계
		sum = 0; // sum = 0; -> 변수를 다시 쓰고 싶다면 이렇게 표현한다
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		System.out.println("1 ~ 100 중에서 홀수의 합계 : " + sum);
			
		
		sum = 0;
		for(int i = 1; i <= 100; i += 2) //증감식으로 2씩 더함.
		{
			sum = sum + i;
		}
		System.out.println("1 ~ 100 중에서 홀수의 합계 : " + sum);



		// 1 ~ 100 중에서 3의 배수이거나 5의 배수인 수의 합계
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 || i % 5 == 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("합계 : " + sum);

		// 1부터 정수들의 합계를 구하는데, 합계가 4000이 넘는 순간의 숫자는?
		sum = 0;
		for(int i = 1; ; i++)  
		{
			sum = sum + i;
			if(sum > 4000)
			{
				System.out.println("1부터 정수들의 합계를 구하는데, 합계가 4000이 넘는 순간의 숫자 : " + i);
				break;
			}						
		}
		
		sum = 0;
		int i = 1; // main 끝날 때까지 머무르게 된다.
		for(; sum < 4000 ; i++)  
		{
			sum = sum + i;
		}
		System.out.println("1~ " + (i-1) + "까지의 합계 : "  + sum);
		
				
		// 22부터 122까지 유니코드 표 출력, 한 줄에 5개씩만. 예:  22: ?, 23: ?, 24 : ?
		
		
		
		int cnt = 0; //5번 돌았을 때 1번 도는 것을 표현하기 위함
		for(int ch =22; ch <= 122; ch++)  //ch는 문자만 저장
		{
			System.out.print(ch + " : " + (char)ch + "\t");     //int형 ch를 char로 표현,  \t는 탭으로 몇칸 띄는 것
			cnt++;
			if(cnt % 5 == 0)
			{
				System.out.println();
			}	
		}
		
		/*
		int cnt = 0; 
		for(int ch = 0; ch <= 100; ch++)  
		{
			System.out.print(ch + " : " + (char)ch + "\t");     
			cnt++;
			if(cnt % 5 == 0)
			{
				System.out.println();   
			}	
		}
		*/
	}
}
	


