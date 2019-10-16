class ForTest1 
{
	public static void main(String[] args) 
	{	
		//0 1 2 3 4
		for(int i = 0; i < 5; i++) // for(초기값 ; 조건식; 증감식) { 문장 }
		{
			System.out.print(i + " ");  // 한 칸 띄게 만든다.
		}
		System.out.println();			// 줄만 한 줄 바꾸는 것

		// 1 2 3 4 5
		for(int i = 1; i < 6; i++) // i가 6보다 작아야 계속 진행
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) //i가 1씩 감소하게 함
		{
			System.out.print(i + " ");
		}
		System.out.println();


		// 10 20 30 40 50
		for(int i = 10; i <= 50; i += 10) //i에 10을 더한 값을 i에 넣어 50까지만 나오게 함
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 3 5 7 9
		for(int i = 1; i < 10; i += 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();

			/*
			for(int i = 1; i < 10; i++) 
			{	
				if(i % 2 == 1) //i값을 2로 나눠 나머지가 1인 홀수만 출력되게 함
				{
					System.out.print(i + " ");
				}
			/*
			

		//1 2 3 4 6 7 8 9
		
		for(int i = 1; i < 10; i++) 
		{
			if( i != 5)
			{
			System.out.print(i + " ");
			}
		}
		System.out.println();
			
			/*
			for(int i = 1; i < 10; i++)
			{
				if(i % 5 != 0) //i가 5의 배수이면 출력 안되게 함
				{
				System.out.print(i + " ");
				}
			}	
			System.out.println();
			*/
		
		//1 10 100 1000 10000
		for(int i = 1; i <= 10000; i *= 10) // i를 10으로 곱한 것을 i에 넣어 값이 10000 이하가 나오게 함
		{
			System.out.print(i + " ");
		}
		System.out.println();
		

		// continue, break, return, System.exit(0); 활용법

		for(int i = 0; i <= 10; i++)
		{
			if(i == 5)
			{
				continue;
				//break;
				//return;
				//System.exit(0);;   
				//continue는 5만 건너뛴고 나머지 실행, break는 4까지만 실행하고 for문 벗어남, return은 4까지만 실행하고 메소드 끝냄, System.exit(0);는 4까지 실행하고 프로그램 종료
			}

			System.out.print(i + " ");
		}
		System.out.println(" ");
	}
}
		



