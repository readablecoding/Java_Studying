import java.util.Scanner; 
class KeyIn2 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    
	    int a, b, c;

		System.out.print("���� �Է� : " ); 
		a = in.nextInt();      
		System.out.print("���� �Է� : " );
		b = in.nextInt();

		c = a + b;

		System.out.println(c); 
	}
}