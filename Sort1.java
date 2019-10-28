class Sort1 // 교환정렬
{
	public static void main(String[] args) 
	{
		// 변수를 선언
		int ar[] = {10, 5, 1, 60, 35, 40, 90, 15, 10, 80};
		int temp;
		
		// 현재 상태 출력
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		// 값 교환
		
		// 오름차순
		for(int i = 0; i < ar.length - 1; i++)
		{
			 for(int j = i + 1; j < ar.length; j++) 
			{
				if(ar[i] > ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}	//for문 변수 j
		} //for문 변수 i


		// 변경된 상태 출력
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	
	}	// main()
}	// class
