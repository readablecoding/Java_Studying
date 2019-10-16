class Studying_191016_2 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		for(int i = 0; i < 10; i++) // x좌표 값 설정(0 ~ 9 사이)
		{
			for(int j = 0; j < 10; j++) // y좌표 값 설정(0 ~ 9 사이)
			{
				System.out.print("(" + i + " , " + j + ")"); // 행렬로 나타냄
				cnt++;
				if(cnt % 10 == 0) 
				{
					System.out.println(); // x좌표가 1단위 증가할 때마다 새로운 줄로 나타냄
				}
				
			}	
		}
		System.out.println();
		
	}
}
