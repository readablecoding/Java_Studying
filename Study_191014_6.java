import java.util.Scanner;
class Study_191014_6 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("년도를 입력하세요: ");
		a = in.nextInt();

		/* 좀 더 긴 방법 !!

		if(a % 400 == 0)
		{
			System.out.println(a + "년은 윤년입니다");
		}
		else
		{
			if(a % 4 == 0 && a % 100 != 0)
			{
				System.out.println(a + "년은 윤년입니다");
			}
			else
			{
				System.out.println(a + "년은 평년입니다");
			}
		}
		*/

		// 좀 더 짧은 방법 !!  
		if(a % 400 == 0 || a % 4 == 0 && a % 100 != 0)
		{
			System.out.println(a + "년은 윤년입니다");
		}
		else
		{
			System.out.println(a + "년은 평년입니다");
		}


	}
}
