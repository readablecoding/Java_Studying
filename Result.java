import java.util.Scanner;

class Result
 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double d;
        boolean e;
		//String e;


        System.out.println("[ 점수 입력 ]");
		System.out.print("과목1 : " ); // 첫번째 과목 점수 입력
		a = in.nextInt();       
		System.out.print("과목2 : " ); // 두번째 과목 점수 입력
		b = in.nextInt();
		System.out.print("과목3 : " ); // 세번째 과목 점수 입력
		c = in.nextInt();

		d = (a + b + c) / 3; // 평균 구하기
		e = (d > 60.0) & (a > 40) & (b > 40) & (c > 40); 
		//e = (d > 60.0 & a > 40 & b > 40 & c > 40) ? "True" : "False";
		//평균이 60.0 이상이고 40점 미만의 과락이 하나도 없으면 true(=합격)
		System.out.println("평균 : " + d);
		System.out.println("결과 : " + e);

		
	}
}
