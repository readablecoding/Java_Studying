import java.util.Scanner;
class Study_191014_3
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("점수를 입력하세요 : ");
		n = in.nextInt();

		if(n >100 || n < 0)
		{
			System.out.println("잘못 입력했습니다.");
		}
		else if(n >= 90)
		{
			System.out.println("수");
		}
		else if(n >= 80)
		{
			System.out.println("우");
		}
		else if(n >= 70)
		{
			System.out.println("미");
		}
		else if(n >= 60)
		{
			System.out.println("양");
		}
		else 
		{
			System.out.println("가");
		}	
	}
}
