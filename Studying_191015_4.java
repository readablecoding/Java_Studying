import java.util.Scanner;
class Studying_191015_4
{
	public static void main(String[] args) 
	{	Scanner in = new Scanner(System.in);
		int a, b, c, d;
		System.out.print("정수 1: ");
		a = in.nextInt();
		System.out.print("정수 2: ");
		b = in.nextInt();
		System.out.print("연산자(1: +, 2: -, 3: *, 4: /): ");
		c = in.nextInt();
		if(c < 1 || c > 4)
		{
			System.out.println("숫자를 잘못 입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		switch(c)
		{
			case 1 :
				d = a + b;
				System.out.println(a + " + " + b + " = " + d);
				break;
			
			case 2 :
				d = a - b;
				System.out.println(a + " - " + b + " = " + d);
				break;
			
			case 3 :
				d = a * b;
				System.out.println(a + " * " + b + " = " + d);
				break;
			
			case 4 :
				if(b == 0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				d = a / b;
				System.out.println(a + " / " + b + " = " + d);
				break;		
		}
	}
}
