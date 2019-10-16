class Studying_191016_3 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			if(i == 5)
			{
				continue;		   // 결과는 0 1 2 3 4 6 7 8 9 -> 5를 제외한 나머지 실행
				//break;		   // 결과는 0 1 2 3 4 -> 5가 된 순간 반복문을 벗어남
				//return;		   // 결과는 0 1 2 3 4 -> 5가 된 순간 메소드(여기서는 main)를 종료함
				//System.exit(0);  // 결과는 0 1 2 3 4 -> 5가 된 순간 프로그램 종료
			}
			System.out.print(i + " ");
		}
	}
}
