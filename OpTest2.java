/*
[ 점수 입력 ]
과목1 : 90
과목2 : 80
과목3 : 70

평균 : 80.0
결과 : true

조건: 3과목 평균이 60.0 이상이고 40점 미만의 과락이 하나도 없으면 true (=합격)
*/


import java.util.Scanner; // 키보드 입력 받는 Scanner 객체 쓰겠다.

class OpTest2 
{
	public static void main(String[] args) 
	{   Scanner in;
	    int a, b, c; //숫자 3개 저장
		double avg;// 소수점 아래 저장
		boolean result; // true, false 중 저장

		in= new Scanner(System.in); 


		System.out.println("[ 점수 입력 ]");
		System.out.print("과목1 : " ); 
		a = in.nextInt(); // nextInt는 일단 프로그램이 멈춘다.숫자를 입력 받고 a에 넣음
		System.out.print("과목2 : " );
		b = in.nextInt();
		System.out.print("과목3 : " );
		c = in.nextInt();

        avg = (a + b + c) / 3.0; 
		//avg = (double)(a + b + c) / 3;
		result = (avg >= 60.0) && a >= 40 && (b>= 40) && (c >= 40);
		// 평균은 60.0 이상이고 한 과목이라도 40점 미만이면 과락, true 또는 false로 나옴 

		System.out.println("평균 : " + avg); 
		System.out.println(result ? "합격" : "불합격"); //boolean 값을 활용
	}
}