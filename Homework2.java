import java.util.Scanner; 
class Homework2 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int a, b, c;

		System.out.print("근무 시간 : "); 
		a = in.nextInt();      
		
		if(a <= 50)
		{
			b = a * 10000;
			System.out.println("급여는 " + b + "원 입니다");
		}
		else
		{
			c = a - 50;
			b = (int)(50 * 10000 + (c * 10000 * 1.1)); 
			System.out.println("급여는 " + b + "원 입니다");
		}	
	}
}