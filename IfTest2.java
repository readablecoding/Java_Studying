import java.util.Scanner; 
class IfTest2 
{
	public static void main(String[] args) 
	{   // 문제 1번
		
		Scanner in = new Scanner(System.in);  
	    
	    int a, b, c;

		
		System.out.print("정수 1 : " ); 
		a = in.nextInt();      
		System.out.print("정수 2 : " );
		b = in.nextInt();
		System.out.print("정수 3 : " );
		c = in.nextInt();

		if(a >= b)
		{
			if(a > c) //a가 b보다 크고 c보다 큰 경우
			{
				System.out.println(a);
			}
			else  // a가 b보다는 크지만 c보다 작은 경우
			{
				System.out.println(c);
			}
		}
		else 
		{
			if(b > c)  // b가 a보다 크고 c보다 큰 경우
			{
				System.out.println(b);
			}
			else       //b가 a보다 크지만 c보다 작은 경우
			{
				System.out.println(c);
			}
		}

		int max = Integer.MIN_VALUE;  // 제일 큰 수를 MIN_VALUE으로 설정함
		if(max < a)
		{
			max = a;  // a가 max보다 크니 a를 max에 대입
		}
		if(max < b)
		{
			max = b; // b가 max보다 크면 b를 max에 대입
		}
		if(max < c)
		{
			max = c;
		}
		System.out.println(max);
		

		// 문제 2번
		
		Scanner in = new Scanner(System.in);  
	    int time;	// 시간
		int money;	// 급여
		final int pay = 10000;	// 시급

		System.out.print("근무시간 : ");
		time = in.nextInt();

		if(time <= 50)
		{
			money = time * pay;
		}
		else
		{
			money = (int)(50 * pay + (time - 50) * pay * 1.1);

		}
		System.out.println("급여 : " + money);
		

		// 문제 3번
		Scanner in = new Scanner(System.in);
		int y;

		System.out.print("년도 : " ); 
		y = in.nextInt();      
		
		if(y % 4 == 0 &&  y % 100 != 0 || y % 400 == 0)
		{
			System.out.println(y + "년은 윤년입니다");
		}
		else
		{
			System.out.println(y + "년은 평년입니다");
		}



	}
}