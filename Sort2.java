class Sort2	// 버블정렬 
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
		for(int i = ar.length - 1; i > 0 ; i--) // i는 여기서 횟수를 의미함. 첫 정렬은 배열개수 -1까지 반복. 직접적 관여는 안함
		{
			 for(int j = 0; j < i; j++) // j는 0부터 i-1까지 바로 옆의 것과 비교한다.
			{
				if(ar[j] > ar[j+1])
				{
					temp = ar[j];		// 큰 값을 임시로 저장
					ar[j] = ar[j+1];	// 작은 값을 옆으로 옮길
					ar[j+1] = temp;		// 임시로 저장한 큰 값을 옆으로 옮김
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