import java.util.Scanner; 
class HomeWork_191015_2
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    
	    int n1, n2, op;
		double value;
		

		System.out.print("���� 1 : " ); 
		n1 = in.nextInt();      
		System.out.print("���� 2 : " );
		n2 = in.nextInt();
		System.out.println("������ (1: +, 2: -, 3: *, 4: /) " );
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		op = in.nextInt();

		if(op < 1 || op > 4)
		{
			System.out.println("1���� 4�� �ϳ��� �����ϼ���");
			return;
		}
		
		switch (op)
		{
			case 1 :
				value = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + value);
				break;
			case 2 :
				value = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + value);
				break;
			case 3 :
				value = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + value);
				break;
			case 4 :
				if(n2 == 0)
				{
					System.out.println("0���� ���� �� �����ϴ�");
					return;
				}
				else
				{
				value = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + (int)value);
				//printf Ȱ��
				//System.out.printf("%d / %d = %.0f\n", n1, n2, value);  
				//Math.round Ȱ��
				//System.out.println(n1 + " / " + n2 + " = " + Math.round(value)); 		
				break;
				}
		}

	}
}
