import java.util.Scanner;
class Study_191014_4 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("정수 입력 1: ");
		n1 = in.nextInt();
		System.out.print("정수 입력 2: ");
		n2 = in.nextInt();
		System.out.print("정수 입력 3: ");
		n3 = in.nextInt();

		if(n1 > n2)
		{
			if(n1 > n3)
			{
				System.out.println("가장 큰 수는 " + n1 + " 입니다");

			}
			else

			{
				System.out.println("가장 큰 수는 " + n3 + " 입니다");
			}
		}
		else
		{
			if(n2 > n3)
			{
				System.out.println("가장 큰 수는 " + n2 + " 입니다");
			}
			else
			{
				System.out.println("가장 큰 수는 " + n3 + " 입니다");
			}
		}
	}
}
