//사용자에게 월, 일을 입력받는다.
// 그 해의 1.1부터 해당 날짜가 며칠째인지
// 예) 2월 3일은 34일째
//윤년 고려: 2월을 29일로 처리한다. 2020년 3월 1일이라면 31 + 29 + 1로 61일이다.
//for문, fianl, 배열, 입력받기, 윤년인지 아닌지 계산

import java.util.Scanner;
class ArrayTest8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		final int year = 2020; // 임시적으로 설정. 사용자가 year 값을 못 고치게 값을 고정시킴
		
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 각 월별 일수를 배열에 저장
		int sum = 0;	//	월별 날짜 합계
		int total = 0;	//	월별 날짜와 일자 수 총 합계

		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt(); //	월 입력 받음
		System.out.print("일을 입력하세요 : ");
		int day = scan.nextInt();	//	일 입력 받음
		
		// 윤년에 해당하는가?
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		 // 4로 나누었을 때 나머지가 0이면서 100으로 나눴을 때 나머지가 0이 아니고, 400으로 나눴을 때도 나머지가 0인 경우
		{
			days[1] = 29;
			System.out.print("윤년입니다");
			
		}
		else
		{	
			days[1] = 28;
			System.out.print("평년입니다");
		}
		System.out.println();

		// 계산처리
		for(int i = 0; i < month - 1; i++)
		{
			sum = sum + days[i];
		}
		total = sum + day;
	
		System.out.print(year + "년 " + month + "월 " + day +"일은 1월 1일부터 " + total + "일째");
		System.out.println();

	}	// main
}	// class
