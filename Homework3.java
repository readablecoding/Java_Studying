import java.util.Scanner; 
class Homework3 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int a;

		System.out.print("�⵵ �Է� : "); 
		a = in.nextInt();      
		
		
		if(a % 400 == 0)
		{
			System.out.println(a + "���� �����Դϴ�");
		}
		else if(a % 4 == 0 && a % 100 != 0)
		{
			System.out.println(a + "���� �����Դϴ�");
		}
		else
		{
			System.out.println(a + "���� ����Դϴ�");
		}
		

		/* �� �����ڸ� ������ Ȱ���ϴ� ���

		if(a % 400 == 0 || a % 100 != 0 && a % 4 == 0)
		{
			System.out.println(a + "���� �����Դϴ�");
		}
		else
		{
			System.out.println(a + "���� ����Դϴ�");
		}

		*/

	}		 
}	