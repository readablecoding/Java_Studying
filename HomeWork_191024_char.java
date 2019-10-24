/*
아무런 문자 9개를 넣는다
배열은 문자형 출력하되 사이사이 구분선을 넣어서 하기
*/

class HomeWork_191024_char
{
	public static void main(String[] args) 
	{		
		String ch[][] = new String [3][3];
		char tmp = 65;
		
		// 1) 입력
		int cnt = 0;	// 
		for(int i = 0; i < ch.length; i++)	// ch.length는 3이다.
		{
			for(int j = 0; j < ch[i].length; j++)	// ch[i].length는 3이다.
			{
				ch[i][j] = (int)(tmp + cnt) + ""; // 행이 바껴도 값을 계속 증가
				cnt++;
			}
			System.out.println();
		}

		/*
		int a = 1;			//  숫자를 int형 변수 a에 넣음
		char b = 'a';		// 문자를 char형 변수 b에 넣음
		String c = a + "";	// int를 String으로 변환
		b = (char)(b + 1);	// int를 char로 변환
		*/
		
		// 2) 출력
		System.out.println("┌───────────┐");				
		for(int i = 0; i < ch.length; i++)
		{		
			for(int j = 0; j < ch[i].length; j++)	// ch[i].length는 3이다.
			{		
				System.out.print("│ " +ch[i][j]);
				
			}
			System.out.println("│");
			if(i < (ch[i].length - 1))
			{
				System.out.println(" ───────────");
			}
		}
		System.out.println("└───────────┘");
					
	}	// main
}	//	class
