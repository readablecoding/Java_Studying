/**	 
	<1900 ~ 1999년생>
String id = "900101-1234567"; -> 남자
String id = "951225-2345678"; -> 여자
	<2000 ~ 2099년생>
String id = "010513-3456789"; -> 남자
String id = "020820-4567890"; -> 여자
	<1800 ~ 1899년생>
String id = "890627-9012345"; -> 남자
Stirng id = "931005-0123456"; -> 여자

	<char 값 비교>
System.out.println((char)48);	// 숫자 0 -> 시작지점
System.out.println((char)49);	// 숫자 1
System.out.println((char)50);	// 숫자 2
System.out.println((char)50);	// 숫자 3
System.out.println((char)50);	// 숫자 4
System.out.println((char)50);	// 숫자 5
System.out.println((char)50);	// 숫자 6
System.out.println((char)50);	// 숫자 7
System.out.println((char)56);	// 숫자 8
System.out.println((char)57);	// 숫자 9 -> 종료지점

	<1,2번째 숫자에 따른 성별>
System.out.println("19" + id.substring(0, 2));	// 1, 2 -> 1900년대생
System.out.println("20" + id.substring(0, 2));	// 3, 4 -> 2000년대생
System.out.println("18" + id.substring(0, 2));	// 9, 0 -> 1800년대생
			
	<900123-1234567 입력시>
System.out.println(array[0].charAt(0));
System.out.println(Integer.parseInt(array[0].substring(0, 1)));	// 9
System.out.println(Integer.parseInt(array[0].substring(1, 2)));	// 0
System.out.println(Integer.parseInt(array[0].substring(2, 3)));	// 0
System.out.println(Integer.parseInt(array[0].substring(3, 4)));	// 1
System.out.println(Integer.parseInt(array[0].substring(4, 5)));	// 2
System.out.println(Integer.parseInt(array[0].substring(5, 6)));	// 3
System.out.println();

System.out.println(Integer.parseInt(array[1].substring(0, 1)));	// 1
System.out.println(Integer.parseInt(array[1].substring(1, 2)));	// 2
System.out.println(Integer.parseInt(array[1].substring(2, 3)));	// 3
System.out.println(Integer.parseInt(array[1].substring(3, 4)));	// 4
System.out.println(Integer.parseInt(array[1].substring(4, 5)));	// 5
System.out.println(Integer.parseInt(array[1].substring(5, 6)));	// 6
System.out.println(Integer.parseInt(array[1].substring(6, 7)));	// 7		
*/
import java.util.Scanner;	// 키보드 입력 용도
import java.util.Calendar;	// 날짜, 시간 입력 용도
class Stringtest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		String id = null;			//	입력받을 주민등록번호
		String birthYear = null;	//	태어난 년도 -> 주민등록번호 앞자리 중 첫 숫자 2개를 활용
		int presentYear;			//	올해 년도 값 -> Calender 사용
		String sex = null;			//	성별 -> 주민등록번호 뒷자리 중 첫 숫자 활용
	
		while(true)	// 입력을 하고 입력 조건에 맞는지 확인하고 아니면 재입력 요구
		{
			System.out.print("주민등록번호 입력 (900101-1234567 형식) : ");
			id = scan.next();	// 입력받아 String 객체 id에 저장

			//1) 14글자가 아니면 다시 입력받음
			// .length()를 통해 14가 아니면 continue를 통해 다시 입력

			if(id.length() != 14)
			{
				System.out.println("글자수가 틀립니다.");
				continue;	// while문의 true로 이동
			}

			//2) 7번째 문자 (index 6)는 '-' -> 0번부터 숫자 시작
			// .charAt(숫자번호)를 통해 6번만 -인지 보고 아니면 continue를 통해 다시 입력
			
			if(id.charAt(6) != '-')
			{
				System.out.println("-를 입력하지 않았습니다.");
				continue;	// while문의 true로 이동
			}
		

			//3) 그 외의 문자는 모두 숫자여야 함 -> 끝까지 문자가 나와서도 안됨
			// .split으로 - 전후로 자르고 1번 배열의 0~5번 까지, 2번 배열의 0~6번까지 char와 같으면 continue
			
			boolean checkItem = false; // true가 되면 if문에서 continue를 통해 while문 처음으로 이동
			String array[] = id.split("-"); // -를 기준으로 앞 뒤를 배열 2개 자름
			String a1 = array[0];	// 생년월일이 들어갈 배열
			String a2 = array[1];	// 성별 등 기타 정보가 들어갈 배열
			

			for(int i = 0; i < 6; i++) // 생년월일에 6번 동안 0 ~ 9가 아닌 숫자가 들어갔는지 확인
			{
				if(a1.charAt(i) < (char)48 || a1.charAt(i) > (char)57)
				{
					System.out.println("7번째에 -을 빼고 다른 곳은 숫자(0~9)를 입력하세요.");
					checkItem = true;	// 잘못 입력했음을 체크
					break;	// for문 탈출
				}
			}
			if(checkItem == true)
			{
				continue;	// 잘못된 문자를 입력했으므로 while문 처음으로 돌아감
			}
			
			
			for(int i = 0; i < 7; i++) // 성별 등 기타 정보에  0 ~ 9가 아닌 숫자가 들어갔는지 확인
			{
				if(a2.charAt(i) < (char)48 || a2.charAt(i) > (char)57)
				{	
					System.out.println("7번째에 -을 빼고 숫자를 입력하세요.");
					checkItem = true;	// 잘못 입력했음을 체크
					break;	// for문 탈출
				}
			}
			if(checkItem == true)
			{
				continue;	// 잘못된 문자를 입력했으므로 while문 처음으로 돌아감
			}

			// 4) 9, 0, 1, 2, 3, 4 중 하나 입력하게 만들기
			
			if(id.charAt(7) == '5'|| id.charAt(7) == '6' || id.charAt(7) == '7' || id.charAt(7) == '8')
			{
				System.out.println("8번째에 9, 0, 1, 2, 3, 4 중 하나를 입력하세요.");
				continue;	
			}
			

			// 5) 월은 1 ~ 12 -> 숫자로 변환해 해당 숫자에 해당하는지 알아보기
			// Integer.parseInt 사용
			
			if(Integer.parseInt(id.substring(2, 4)) <= 0 || Integer.parseInt(id.substring(2, 4)) >= 13)
			{
				System.out.println("월은 1부터 12까지 입력하세요.");
				continue;
			}
	
			
			// 6) 일은 1 ~ 31 -> 숫자로 변환해 해당 숫자에 해당하는지 알아보기. 
			// Integer.parseInt 사용
			
			if(Integer.parseInt(id.substring(4, 6)) <= 0 || Integer.parseInt(id.substring(4,6)) >= 32)
			{
				System.out.println("일은 1부터 31까지 입력하세요.");
				continue;
			}

			break; // 앞의 조건에 하나도 걸리지 않는다면 break를 만나 while문을 빠져나간다.

		} // while문 -> 입력 조건을 만족시키면 7번 태어난 연도 설정으로 이동
		
		// 7) 태어난 연도 설정
		//  8번째 문자가 1,2이면 1900년대이고 3, 4이면 2000년대이며 9, 0이면 1800년대 사람

		if(id.substring(7, 8).equals("1") || id.substring(7, 8).equals("2"))
		{
			birthYear = "19" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		if(id.substring(7, 8).equals("3") || id.substring(7, 8).equals("4"))
		{
			birthYear = "20" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		if(id.substring(7, 8).equals("9") || id.substring(7, 8).equals("0"))
		{
			birthYear = "18" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		
		// 8) 8번째 문자가 1,3,9 이면 남자이고 2, 4, 0이면 여자이다

		if(id.substring(7, 8).equals("1") || id.substring(7, 8).equals("3") || id.substring(7, 8).equals("9"))
		{
			sex = "남자";
		}
		if(id.substring(7, 8).equals("2") || id.substring(7, 8).equals("4") || id.substring(7, 8).equals("0"))
		{
			sex = "여자";
		}
		
		Calendar c = Calendar.getInstance();	// 달력 값을 받아와 c에 저장
		presentYear = c.get(Calendar.YEAR);		// 올해 년도를 대입
		int age = presentYear - Integer.parseInt(birthYear) + 1;	// 올해 년도와 태어난 년도의 차이에 1을 더해 올해 나이 게산 		
		int month = Integer.parseInt(id.substring(2, 4));	// 월 
		int day = Integer.parseInt(id.substring(4, 6));		// 일 
		System.out.println(birthYear + "년생 " + month + "월 " + day + "일생 " + age + "살 " + sex + "입니다");		
	
	} // main()
} // class



