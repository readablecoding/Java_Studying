/*
[프로그램 제목]
1. 입력
2. 수정
3. 삭제
4. 출력
0. 종료
번호 선택 > _
*/
import java.util.Scanner;
class MenuTest 
{
	public static void main(String[] args) 
	{	
		// 미리 준비해야 하는 객체 생성이나 변수 선언 등
		Scanner scan = new Scanner(System.in);
		String names[] = new String [10];	// 10명까지 이름을 저장할 수 있는 배열. 객체는 아무것도 가리키지 않음-> null 값이 들어있다.
		int cnt = 0;					// 몇 명까지 저장했나?
		int menuNum;
		
		
		// 프로그램 전체를 무한 반복
		while(true)
		{
			// 메뉴 출력하는 메소드 호출
			printMenu();
			
			// 메뉴번호 입력받음
			menuNum = scan.nextInt();

			// 입력한 번호에 따라 분기
			switch(menuNum)
			{
				case 1:
					System.out.println("[ 입력 ]");
					System.out.print("이름 입력 : ");
					scan.nextLine();				// 버퍼에 있는 것을 읽어오고 비워짐.
					names[cnt] = scan.nextLine();	// 사용한 요소 다음 요소에 저장, 문자열 입력받음, 버퍼가 비워지고 다시 새로 입력 받게 됨.
					cnt++;						// 저장된 개수 증가
					break;	// break가 없으면 밑의 내용까지 다 실행한다. 나갈 때 break 사용하기
				case 2: 
					System.out.println("2번 선택");
					break;
				case 3: 
					System.out.println("3번 선택");
					break;
				case 4: 
					System.out.println("[ 출력 ]");
					// 등록된 모든 이름을 출력한다.
					for(int i = 0; i < cnt; i++)
					{
						System.out.print(names[i] + " ");	// cnt보다 작은 동안 names 배열의 값을 순서대로 보여줌
					}
					System.out.println();
					break;
				// 0을 입력하면 종료
				case 0: 
					System.out.println("프로그램을 종료합니다.");
					return;	// main 메소드를 종료하게 된다.
				default :
					System.out.println("번호를 다시 선택하세요");
					break;	// 마지막에 break를 안 쓰면 while문 처음으로 돌아감
			}	// switch문
			System.out.println();

		}	// while문
	
	}	// main 메서드
	
	//메뉴를 깔끔하게 출력하게 만드는 메소드를 만든다.
	public static void printMenu()	// 값을 주지도 않고 받지도 않는다. 
	{
		// 메뉴 출력
		System.out.println("[프로그램 제목]");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 출력");
		System.out.println("0. 종료");
		System.out.print("번호 선택 > ");
	}	// printMenu 메소드로 메뉴 출력만 하려고 만든 것. 어디서 불러줘야 실행된다.

}	// class MenuTest
