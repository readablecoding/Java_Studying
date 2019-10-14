import java.util.Scanner;
class Study_191014_5
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.println("근무 시간을 입력하세요");
		System.out.print("근무 시간: ");
		a = in.nextInt();
		if(a < 0)
		{
			System.out.println("잘못된 시간을 입력했습니다. 양의 정수로 입력하세요");
		}
		else if(a <= 50)
		{
			b = a * 100000;
			System.out.println("아르바이트 급여는 " + b + "원 입니다");
		}
		else
		{
			c = a - 50;
			b = (int)(50 * 10000 + (c * 10000 * 1.1));
			System.out.println("아르바이트 급여는 " + b + "원 입니다");
		}
	}
}
