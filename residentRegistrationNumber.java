/*
주민등록번호 받기
에러 처리: 키보드 입력 받기 14글자 아니면 프로그램 끝내버리기
14글자가 아니면 종료
<1900 ~ 1999년생>
String id = "900101-1234567"; -> 남자
String id = "951225-2345678"; -> 여자
<2000 ~ 2099년생>
String id = "010513-3456789"; -> 남자
String id = "020820-4567890"; -> 여자
<1800 ~ 1899년생>
String id = "890627-9012345"; -> 남자
Stirng id = "931005-0123456"; -> 여자

14글자이면 다음의 정보를 출력
90년 01월 01일생 남자입니다.
95년 12월 25일생 여자입니다.
글자를 잘라 확인 
두번째 줄의 첫 글자로 1, 3, 9은 남자이고 2, 4, 0은 여자다.

*/
import java.util.Scanner;
class residentRegistrationNumber
{
	public static void main(String[] args) 
	{
			
		Scanner scan = new Scanner(System.in); // 키보드로 입력 받겠다.
		String man = "남자";		// 남자를 보여주기 위해 String 객체 만듦
		String woman = "여자";	// 여자를 보여주기 위해 String 객체 만듦
		String manNumber[] = {"1", "3", "9"};	// 남자가 속한 숫자는 1, 3, 9
		String womanNumber[] = {"2", "4", "0"};	// 여자가 속한 숫자는 2, 4, 0
		 
		// 14글자가 아니면 종료
		System.out.println("주민등록번호를 입력하세요. -를 포함하세요.");
		System.out.print("주민등록번호 : ");
		String id = scan.next();	// 주민등록번호 입력 받기
		while(true)
		{
			if(id.length() != 14)	// String id의 입력이 14자가 아니면 프로그램 종료
			{
				System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
				System.exit(0);
			}	// if문
			else
			{
				break;	// 14자를 입력하면 while문을 탈출해 출력을 위한 공간으로 이동함
			}	// else문
		}	//while문
		

		/*실험용
		System.out.println(id.charAt(7));
		System.out.println(id.substring(7,8));
		*/

		
		if(id.substring(7,8).equals(manNumber[0])) // 문자열의 7번째 숫자 1자리가 1인 경우 -> 1900년대 남자
		{
			System.out.println("19"+ id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + man + "입니다.");
		}
		else if(id.substring(7,8).equals(manNumber[1]))	// 문자열의 7번째 숫자 1자리가 3인 경우 -> 2000년대 남자
		{
			System.out.println("20" + id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + man + "입니다.");
		}

		else if(id.substring(7,8).equals(manNumber[2]))	// 문자열의 7번째 숫자 1자리가 9인 경우 -> 1800년대 남자
		{
			System.out.println("18" + id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + man + "입니다.");
		}

		else if(id.substring(7,8).equals(womanNumber[0]))	// 문자열의 7번째 숫자 1자리가 2인 경우 -> 1900년대 여자
		{
			System.out.println("19" + id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + woman + "입니다.");
		}
		else if(id.substring(7,8).equals(womanNumber[1]))	// 문자열의 7번째 숫자 1자리가 4인 경우 -> 2000년대 여자
		{
			System.out.println("20" + id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + woman + "입니다.");
		
		}
		else if(id.substring(7,8).equals(womanNumber[2]))	// 문자열의 7번째 숫자 1자리가 0인 경우 -> 1800년대 여자
		{
			System.out.println("18" + id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + woman + "입니다.");
		}
		else
		{
			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다."); // 1, 3, 9, 2, 4, 0 이외의 숫자 입력시 프로그램종료
			return;	// 프로그램 종료
		}
		
	}	// main()		
}	// class
