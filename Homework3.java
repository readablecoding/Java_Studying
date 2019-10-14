import java.util.Scanner; 
class Homework3 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int a;

		System.out.print("년도 입력 : "); 
		a = in.nextInt();      
		
		
		if(a % 400 == 0)
		{
			System.out.println(a + "년은 윤년입니다");
		}
		else if(a % 4 == 0 && a % 100 != 0)
		{
			System.out.println(a + "년은 윤년입니다");
		}
		else
		{
			System.out.println(a + "년은 평년입니다");
		}
		

		/* 논리 연산자를 열거해 활용하는 방법

		if(a % 400 == 0 || a % 100 != 0 && a % 4 == 0)
		{
			System.out.println(a + "년은 윤년입니다");
		}
		else
		{
			System.out.println(a + "년은 평년입니다");
		}

		*/

	}		 
}	