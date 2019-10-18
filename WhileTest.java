class WhileTest 
{
	public static void main(String[] args) 
	{
		int i; // 변수를 재활용 하기 위해 미리 선언함
		
		// for문 사용
		for(i = 0; i < 5; i++)  // 초기식(변수 선언 등), 조건(true여야 한번은 실행함), 증감식 
		{
			System.out.println("Hello World!"); // hello world 5번 반복(i가 0부터 4까지 반복)
		} //for 변수 i
		System.out.println();

		// while문 사용
		i = 0;
		while(i < 5)
		{
			System.out.println("Hello World!");
			i++;
		}
		System.out.println();

		// do ~ while문 사용
		i = 0; 
		do
		{
			System.out.println("Hello World!");
			i++;
		}
		while (i < 5);
		System.out.println();

		//while문 계속 되게 하는 방법 -> 조건에 true를 넣음 대신 break로 끝을 내는 방법
		i = 0;
		while(true)
		{
			System.out.println("Hello World!");
			if(i >= 4)
			{
				break; // 5번 반복하게 하는 방법으로 break를 넣었다. 현재 반복문을 끝냄
			}
			i++;
		}
		System.out.println();


	} // main 
} // class
