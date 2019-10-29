import java.util.Scanner;
class APItest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	// 
		String email;	// 변수 선언

		/*
		System.out.print("이메일 입력 : ");
		email = scan.next();	// 입력 받기

		

		System.out.println(email);
		System.out.println(email.length());	// 문자열 길이 -> .length() 사용
		System.out.println(email.indexOf('@') != -1 && email.indexOf('.') != -1); // '@'와 '.'가 포함되어 있나 -> indexOf로 없을 때 -1이 나오면 없는 것 // 1이 아니면 값이 있다는 것을 보여주기 위함
		System.out.println(email.contains("@") && email.contains(".")); // '@'와 '.'가 포함되어 있나 			
		System.out.println(email.substring(0, email.indexOf('@'))); // ID만 출력
		String s[] = email.split("@");
		System.out.println(s[0]);	// ID만 출력 -> .split("@")해서 그 이전 부분을 배열로 @ 이전의 값만 나오게 함.
		System.out.println();
		
		*/

		
		System.out.print("파일명 입력 : ");
		String file = scan.nextLine();	// 입력 받기. 빈칸이 있을 수 있으므로 .nextLine으로 받는다.
		
		// "exe", "com" 확장자를 가진 파일은 올릴 수 없습니다.
		// My.company.hwp	
		
		if(file.toLowerCase().endsWith(".exe") || file.toLowerCase().endsWith(".com"))	// 일단 소문자로 바꾸고 난 후의 .exe와 .com로 끝나는지를 보는 것
		{
			System.out.println("\"exe\", \"com\" 확장자를 가진 파일은 올릴 수 없습니다.");	// " "를 넣으려면 \"를 활용함
		}	


		// 확장자만 출력. 또는 확장자가 없습니다.
		// 내 이력서 v1.doc
		String ext = "";	// 초기화함
		String sa[];		// split으로 잘라낸 것을 배열에 넣는 용도로

		if(!file.contains("."))	// .이 포함되지 않을 때는 !를 넣어 논리 연산자 not이다. 결과를 뒤집는 것
		{
			System.out.println("확장자가 없습니다.");
		}
		else
		{
			// 1번째 방법
			ext = file.substring(file.lastIndexOf('.') + 1);	// .이 있는 마지막 위치에서 1을 더해서 위치 7부터 끝까지 읽어내는 것
			// 2번쨰 방법
			sa = file.split("[.]");	//.기준으로 잘라 배열에 넣어둠
			ext = sa[sa.length -1];	// 배열 위치보다 1을 줄이면 마지막 배열 위치에 있는 확장자를 찾을 수 있다.	
			System.out.println("확장자 : " + ext);
			// 내가 쓴 방법
			// file.substring(file.indexOf(".") + 1, file.length()));

		}
		
	}	// main()
}	// class
