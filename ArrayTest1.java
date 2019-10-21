class ArrayTest1 
{
	public static void main(String[] args) 
	{
		int i = 0;						// 변수 1개 선언
		int ar[] = new int[5];			// 변수 5개를 한번에 만든 것. ar은 변수명, 

		System.out.println(i);			// 일반 변수이니 변수의 값을 출력함
		System.out.println(ar);			// ar에는 배열의 주소를 문자로보여줌
		System.out.println(ar.length);	// . 앞이 객체이고 배열 이름 뒤의 length는 배열의 길이
		
		
		System.out.println(ar[0]);		// ar의 배열 중 맨 처음의 요소를 찾아줌  
		System.out.println(ar[1]);		// ar 배열의 1번 요소를 찾아옴
		System.out.println(ar[2]);		
		System.out.println(ar[3]);		
		System.out.println(ar[4]);		
		//System.out.println(ar[5]);	// 오류 발생함. 없는 위치이므로.

		for(i = 0; i < ar.length; i++)			// for문을 활용. i는 0부터 4까지
		{
			System.out.println(ar[i]);	// i가 0부터 4까지 5번 배열의 값 출력함.
		}

		ar = new int[10]; // int형 배열로 10칸을 만들어 ar에 주소를 넣음
		for(i = 0; i < ar.length; i++)			// for문을 활용. i는 0부터 9까지
		{
			System.out.println(ar[i]);	// i가 0부터 9까지 10번 배열의 값 출력함.
		}

	} // main()
} // class ArrayTest1
