import java.util.Scanner;
class ArrayTest11 // 2차원 배열 연습
{
	public static void main(String[] args) 
	{
		int a[] = new int[6];		// 1차원 배열	
		int b[][] = new int[2][3];	// 2차원 배열

		/*
		System.out.println(a.length);	// 배열의 길이는 6
		System.out.println(b.length);	// 배열의 길이는 2 -> 행 개수만큼 보여줌
		System.out.println(b[0].length);	//  0행의 칸 개수는 3 (0, 1, 2)
		System.out.println(b[1].length);	//	1행의 칸 개수는 3 (0, 1, 2)
		System.out.println(a[0]);			//
		System.out.println(b[0][0]);		// 배열 b의 0행 0열
		System.out.println(b[1][2]);		// 배열 b의 1행 2열 -> 배열의 마지막 위치
		*/
		
		/*
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < b.length; i++)	// 행 길이 만큼 반복
		{
			for(int j = 0; j < b[i].length; j++)	// 해당 행의 열 길이 만큼 반복
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		*/
	
		// 학생 5명의 국어, 영어, 수학 점수
		/*
		0번 학생 점수입력
		과목0: 100
		과목1: 90
		과목2: 80
		1번 학생 점수입력
		과목0: 100
		과목1: 90
		과목2: 80
		3번 학생 점수입력
		과목0: 100
		과목1: 90
		과목2: 80
		4번 학생 점수입력
		과목0: 100
		과목1: 90
		과목2: 80
		---------------------
				국어 영어 수학
		학생0		100	90	80
		학생1		100 90	80
		...

		*/

		// 1)  점수 입력
		int score[][] = new int [5][3]; // 총 5 * 3 으로 15개가 만들어진다. 괄호를 2개 붙여야 한다.
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < score.length; i++)
		{	
			System.out.println(i + "번 학생 점수입력");	// 학생별 입력하도록 유도
			for(int j = 0; j < score[i].length; j++)
			{
				System.out.print("과목 " + j + ":" + " ");	// 점수를 입력시킴
				score[i][j] = in.nextInt();					// 점수를 배열 score의 해당 행, 열에 위치시킴
			}
		}
		// 2) 점수 출력
		System.out.println("-------------------------------");
		System.out.println("\t국어\t영어\t수학");	// 윗 부분 목록 보이게 하는 용도로 띄어쓰기(\t)를 함
		for(int i = 0; i < score.length; i++)	// 행 길이 score.length만큼 반복
		{
			System.out.print("학생" + i);	// 학생별로 점수를 보이게 하고 띄어쓰기
			for(int j = 0; j < score[i].length; j++)	// 열 길이 score[i].length만큼 반복
			{
				System.out.print("\t " + score[i][j]);	// 점수 입력 후 탭으로 띄어쓰기
			}
			System.out.println();
		}
		System.out.println();

		// 3) 점수 출력: 국어, 영어, 수학 점수 따로 
		System.out.println("-------------------------------");
		for(int i = 0; i < score[0].length; i++)	// score[0].length는 5이다.
		{
			for(int j = 0; j < score.length; j++)	// score.length는 3이다.
			{
				System.out.print("\t" + score[j][i]);  // 열 * 행 
			}
			System.out.println();
		}



	}	// main	
}	// class	
