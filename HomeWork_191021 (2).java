/*
정수 10개를 입력하세요.
10
25
-4
-22
100
30
30
40
-8
-1

합계 : 200
평균 : 20.0
최대값 : 100
최소값 : -22
평균과 10 이상 차이나는 값 : 10 -22  -> 다 늘여놓는 것
*/

import java.util.Scanner;		// 키보드로 값을 입력받기 위해 Scanner를 쓰기 위해 불러옴
class HomeWork_191021
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];		// int형 배열 a에 10개의 공간을 만들고 0으로 초기화
		System.out.println("정수 10개를 입력하세요.");  // 입력 요청
		// 값 입력 받기
		for(int i = 0; i < a.length; i++)
		{
			a[i] = scan.nextInt();					// 입력 받는 것을 배열 a에 집어 넣음
		}
		System.out.println();
		

		// 계산하기
		int sum = 0;	// 값 누적을 위해 sum을 0으로 초기화
		double mean;;	// 평균을 위한 변수 mean 선언
		int max;		// 최대값을 위한 변수 max 선언
		int min;		// 최소값을 위한 변수 min 선언
		
		// 합계
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];					// sum에 각 배열 위치별 값을 누적
		}
		System.out.println("합계 : " + sum);

		// 평균
		mean = sum / a.length;					// 구해진 합계(sum)에 배열 길이만큼으로 나눠줌
		System.out.println("평균 : " + mean);

		// 최대값, 최소값
		max = a[0];								// 비교를 위해 우선 배열의 첫번째 값을 max에 넣음
		min = a[0];								// 비교를 위해 우선 배열의 첫번째 값을 min에 넣음
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];						// max 값 변화를 위해 a[i]의 값을 max에 대입
			}
			if(min > a[i])
			{
				min = a[i];						// min 값 변화를 위해 a[i]의 값을 min에 대입
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		// 평균과 10 이상 차이나는 값
		int cnt = 0;
		System.out.print("평균과 10 이상 차이나는 값 : ");
		for(int i = 0; i < a.length; i++)
		{
			if(Math.abs(mean - a[i]) >= 10)		// 평균과 a[i] 값의 절대값이 10 이상인 경우
			{
				System.out.print(a[i] + " ");	// 평균이 10 이상 차이나는 값을 출력하고 한 칸 띔
				cnt++;							// 평균과 차이가 10이상이므로 개수를 1 증가시킴
			}
		}
		System.out.println();
		System.out.println("평균과 10 이상 차이나는 값은 총 " + cnt + "개 입니다.");
		System.out.println();
	
	} // main
}	// class 
