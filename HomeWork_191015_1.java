import java.util.Scanner; 
class HomeWork_191015_1 
{
	public static void main(String[] args) 
	{   
		Scanner in = new Scanner(System.in);  
	    int money, exchange;
		double result;
		double usd = 1 / 1184.10;	//  1�޷� / ��
		double jpy = 100 / 1092.70; //	100�� / ��
		double eur = 1 / 1306.06;	//  1���� / ��

		System.out.print("�� ���� �ݾ� �Է� : " ); 
		money = in.nextInt(); 
		if(money <= 0)
		{	System.out.println("�ݾ��� 1 �̻� �Է��ϼ���");
			return;
		}

		System.out.print("ȯ���� ȭ�� (1: �޷�, 2: ��ȭ, 3: ����) : " );
		exchange = in.nextInt();
		if(exchange < 1 || exchange > 3)
		{
			System.out.println("1���� 3������ ���ڸ� �Է��ϼ���");
			return;
		}

		switch(exchange)
		{
			case 1 : 
				result = money * usd;
				//System.out.println(money + "����" + result + " �޷��Դϴ�.");
				System.out.printf("%d���� %.2f�޷��Դϴ�.\n", money, result);
				break;
			case 2 :
				result = money * jpy;
				//System.out.println(money + "����" + result + " ���Դϴ�.");
				System.out.printf("%d���� %.2f���Դϴ�.\n", money, result);
				break;
			default :
				result = money * eur;
				//System.out.println(money + "����" + result + " �����Դϴ�.");
				System.out.printf("%d���� %.2f�����Դϴ�.\n", money, result);
				break;
	
		}
	}
}