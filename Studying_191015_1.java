import java.util.Scanner;
class Studying_191015_1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String a;

		System.out.println("문자를 입력하세요");
		System.out.print("a, b, c 중 고르세요 : ");
		a = in.nextLine();
		switch(a)
		{
			case "a" :
				System.out.println("안녕하세요.");
				break;

			case "b" :
				System.out.println("반갑습니다.");
				break;

			case "c" :
				System.out.println("고맙습니다.");
				break;

			default :
				System.out.println("잘못 입력했습니다. a, b, c중 입력하세요.");
				break;
		}
	}
}

