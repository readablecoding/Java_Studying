import java.util.Scanner;
class Studying_191015_2 
{ 
	public static void main(String[] args) 
	{
		System.out.println("분류 코드는 1: 철학, 2: 종교, 3: 사회과학, 4: 기타"); 
		System.out.print("분류코드를 입력하세요: ");
		Scanner inputValue = new Scanner(System.in);
		int code = inputValue.nextInt();
		switch(code)
		{
			case 1 :
				System.out.println("철학입니다.");
				break;
			
			case 2 :
				System.out.println("종교입니다.");
				break;
			case 3 :
				System.out.println("철학입니다.");
				break;
			default :
				System.out.println("사회과학입니다.");
				break;
		}
	}
}
