import java.util.Scanner;
class Study_191014_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double avg;
		boolean result;


		System.out.println("[ 점수 입력 ]");
		System.out.print("과목1 : ");
		a = in.nextInt();
		System.out.print("과목2 : ");
		b = in.nextInt();
		System.out.print("과목3 : ");
		c = in.nextInt();

		avg = (double)(a + b + c) / 3;
		result = (avg >= 60.0) && (a >= 40) && (b >= 40) && (c >= 40);

		System.out.println("평균 : " + avg);
		System.out.println(result ? "합격" : "불합격");
		// System.out.print("결과: " + result);
	}
}
