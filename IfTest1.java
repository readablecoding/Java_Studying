import java.util.Scanner; 
class IfTest1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);  
	    int n;

		System.out.print("���� �Է� (0 ~ 100��) : " ); 
		n = in.nextInt(); 
		
		/*
		90�� �̻� ��
		80�� �̻� ��
		70�� �̻� ��
		60�� �̻� ��
		�� �����δ� ��
		*/

		if(n > 100 || n < 0)
		{
			System.out.println("�߸� �Է��޽��ϴ�."); // ���� ó�� ����
		}
		else
		{
			if(n >= 90)
            {  
			System.out.println("��");
		    }
		    else if(n >= 80)
		    {
			System.out.println("��");  
		    }
		    else if(n >= 70)
		    {
			System.out.println("��");  
		    }
		    else if(n >= 60)
		    {
			System.out.println("��");  
		    }
			else
			{
			System.out.println("��"); // 0������ 59������
			}

		}

	}
}
