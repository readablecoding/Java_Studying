class ArrayTest5 
{
	public static void main(String[] args) 
	{
		
		int a[]= new int[10];	 // int형 변수 10개를 만들고 0으로 초기화됨
		int n = 0;
		for(int i = 0; i < a.length; i++)
		{
			n += 10;			//	n에 10씩 더함
			a[i] = n;			//	n을 a[i]에 넣어줌 
			
		}
		
		System.out.println(Math.random()); // Math 클래스는 그냥 써도 된다. 0이상 1미만의 값의 double형 숫자를 하나 내놓음. 0.0 <= x < 1.0 
		System.out.println((int)(Math.random() * 10)); // 소수점을 자른 것으로 무작위 숫자로 0 ~ 9 중 하나가 나옴
		System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10까지 나오게 함
		System.out.println(((int)(Math.random() * 10) + 1) * 10); // 10, 20, ~ 100까지 나오게 함
		System.out.println();
		
		/*
		// 0 ~ 100점 사이의 무작위 점수를 배열에 저장
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 101); // 1) 101을 곱함 2)int형 강제형변환 -> 0 ~ 100까지 가능
			System.out.println(a[i]);
		}
		System.out.println();
		*/

		// 무작위 수 테스트
		/*
		for(int i = 0; i < 100; i++)
		{
			System.out.println((int)(Math.random() * 10) + " ");
		}
		System.out.println();

		for(int i = 0; i < 100; i++)
		{
			System.out.println((int)(Math.random() * 101) + " ");
		}
		System.out.println();

		for(int i = 0; i < 100; i++)
		{	
			System.out.println(((int)(Math.random() * 10) + 1) * 10);
		}
		System.out.println();
		*/

		// 주사위를 5번 굴렸을 때, 1 ~ 6사이의 값이 나온다.
		for(int i = 0; i < 5; i++)  // i는 0부터 4까지 5번 돌림
		{
			a[i] = (int)(Math.random() * 6) + 1; // 1)6을 곱함 2)int로 강제형변환 3)1을 더해줌
			System.out.print(a[i] + " ");
		}
		System.out.println();


	} // main
}	// class
