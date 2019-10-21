// 사용자에게 입력할 숫자의 개수를 듣고 배열 생성 -> 숫자가 10개라면 11개 필요함. 숫자 10개와 합계 구할 1개
// 반복문으로 숫자 입력 받음
// 배열의 마지막 원소에 다른 숫자들의 합계를 계산
// 결과 출력
// 1+2+3+4+5+6+7+8+9+10=55

import java.util.Scanner;
class ArrayTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a[] = null;  // 배열 a 초기화
		int size;		// 입력될 숫자 개수 + 합계 구하는 1개 포함할 변수 size
		System.out.print("입력할 숫자 개수: ");  // 입력 요구
		size = scan.nextInt();				 // 입력 받기
		a = new int[size + 1]; // 배열 a 생성
		
	
		for(int i = 0; i < a.length - 1; i++)  
		{	
			System.out.print("정수 입력 : ");
			a[i] = scan.nextInt();
		}

		for(int i = 0; i < a.length - 1; i++)
		{	
			a[a.length - 1] += a[i]; // 값 더해주는 용도
		}

		for(int i = 0; i < a.length - 1; i++)
		{
			if(i < a.length - 2)
			{
				System.out.print(a[i] + "+");
			}
		
			else
			{	
				System.out.print(a[i] + "=");
			}
		}
		System.out.print(a[a.length - 1]); 
		System.out.println();
	} // main
}	// class
