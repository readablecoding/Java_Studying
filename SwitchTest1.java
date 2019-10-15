import java.util.Scanner; 
class SwitchTest1
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int y,n;

		System.out.print("ÅÂ¾î³­ ÇØ´Â ? : "); 
		y = in.nextInt();  
		n = y % 12;
		
		// switch¹® »ç¿ë
		switch(n)
		{
			case 0 :
				System.out.println("¿ø¼þÀÌ¶ìÀÔ´Ï´Ù.");
			break;
			case 1 :
				System.out.println("´ß¶ìÀÔ´Ï´Ù.");
			break;
			case 2 :
				System.out.println("°³¶ìÀÔ´Ï´Ù.");
			break;
			case 3 :
				System.out.println("µÅÁö¶ìÀÔ´Ï´Ù.");
			break;
			case 4 :
				System.out.println("Áã¶ìÀÔ´Ï´Ù.");
			break;
			case 5 :
				System.out.println("¼Ò¶ìÀÔ´Ï´Ù.");
			break;
			case 6 :
				System.out.println("È£¶ûÀÌ¶ìÀÔ´Ï´Ù.");
			break;
			case 7 :
				System.out.println("Åä³¢¶ìÀÔ´Ï´Ù.");
			break;
			case 8 :
				System.out.println("¿ë¶ìÀÔ´Ï´Ù.");
			break;
			case 9 :
				System.out.println("¹ì¶ìÀÔ´Ï´Ù.");
			break;
			case 10 :
				System.out.println("¸»¶ìÀÔ´Ï´Ù.");
			break;
			default :
				System.out.println("¾ç¶ìÀÔ´Ï´Ù.");
			break;
		}

		// if¹® »ç¿ë
		if(n == 0)
		{
			System.out.println("¿ø¼þÀÌ¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 1)
		{
			System.out.println("´ß¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 2)
		{
			System.out.println("°³¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 3)
		{
			System.out.println("µÅÁö¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 4)
		{
			System.out.println("Áã¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 5)
		{
			System.out.println("¼Ò¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 6)
		{
			System.out.println("È£¶ûÀÌ¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 7)
		{
			System.out.println("Åä³¢¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 8)
		{
			System.out.println("¿ë¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 9)
		{
			System.out.println("¹ì¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 10)
		{
			System.out.println("¸»¶ìÀÔ´Ï´Ù.");
		}
		else if(n == 11)
		{
			System.out.println("¾ç¶ìÀÔ´Ï´Ù.");
		}
	}

}