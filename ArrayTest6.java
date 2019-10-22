/*
로또 1 ~ 45번 중 6개를 꺼내는 것
같은 수는 나오면 안된다.(중복 x)
같은 수가 나왔을 때 처리하는 방법이 중요하다
*/
class ArrayTest6 
{
	public static void main(String[] args) 
	{
		
		int ar[] = new int[6];						// int형 변수 6개 만들고 0으로 초기화

		// 무작위수로 채움
		for(int i = 0; i < 6; i++)					// 전체 6개 숫자
		{
			ar[i] = (int)(Math.random() * 45) + 1;	// 1 ~ 45 랜덤 숫자 넣기
			for(int j = 0; j < i; j++)				//  그 이전까지의 모든 숫자
			{
				if(ar[i] == ar[j])					// 같은 값이 발견됨
				{
					i--;							// 현재 숫자를 다시 생성하러 감. i의 값을 없애고 다시 입력위함
					break;							// 해당 for문 변수 j 탈출하기
				}
			} // for문 변수 j
		} //for문 변수 i	

		// 배열의 모든 숫자 출력
		for(int i = 0; i < 6; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
	}	// main
}	// class
