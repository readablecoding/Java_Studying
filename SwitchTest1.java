import java.util.Scanner; 
class SwitchTest1
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int y,n;

		System.out.print("�¾ �ش� ? : "); 
		y = in.nextInt();  
		n = y % 12;
		
		// switch�� ���
		switch(n)
		{
			case 0 :
				System.out.println("�����̶��Դϴ�.");
			break;
			case 1 :
				System.out.println("�߶��Դϴ�.");
			break;
			case 2 :
				System.out.println("�����Դϴ�.");
			break;
			case 3 :
				System.out.println("�������Դϴ�.");
			break;
			case 4 :
				System.out.println("����Դϴ�.");
			break;
			case 5 :
				System.out.println("�Ҷ��Դϴ�.");
			break;
			case 6 :
				System.out.println("ȣ���̶��Դϴ�.");
			break;
			case 7 :
				System.out.println("�䳢���Դϴ�.");
			break;
			case 8 :
				System.out.println("����Դϴ�.");
			break;
			case 9 :
				System.out.println("����Դϴ�.");
			break;
			case 10 :
				System.out.println("�����Դϴ�.");
			break;
			default :
				System.out.println("����Դϴ�.");
			break;
		}

		// if�� ���
		if(n == 0)
		{
			System.out.println("�����̶��Դϴ�.");
		}
		else if(n == 1)
		{
			System.out.println("�߶��Դϴ�.");
		}
		else if(n == 2)
		{
			System.out.println("�����Դϴ�.");
		}
		else if(n == 3)
		{
			System.out.println("�������Դϴ�.");
		}
		else if(n == 4)
		{
			System.out.println("����Դϴ�.");
		}
		else if(n == 5)
		{
			System.out.println("�Ҷ��Դϴ�.");
		}
		else if(n == 6)
		{
			System.out.println("ȣ���̶��Դϴ�.");
		}
		else if(n == 7)
		{
			System.out.println("�䳢���Դϴ�.");
		}
		else if(n == 8)
		{
			System.out.println("����Դϴ�.");
		}
		else if(n == 9)
		{
			System.out.println("����Դϴ�.");
		}
		else if(n == 10)
		{
			System.out.println("�����Դϴ�.");
		}
		else if(n == 11)
		{
			System.out.println("����Դϴ�.");
		}
	}

}