import java.util.Scanner; // Scanner�� ���� ���� �Է¹ްڴ�.
class ArrayTest2
{
	public static void main(String[] args) 
	{
		//int a[] = new int[0]; -> ������� ��ü�� �ּҸ� a�� ����
		Scanner scan = new Scanner(System.in);
		int a[] = null; // ���� �迭�� ���� ������ �ִ� ��. a�� �ּҸ� �����ϴµ� null�� ������ �ƹ��͵� ����Ű�� ����.
		a = new int[10]; // �̹� ������ �迭 a�� ���� 10���� ������ �غ� �� ���̴�. 0���� �ʱ�ȭ�Ѵ�.
		
		// 10���� ������ �Է¹޾� a�迭�� �� ���ҿ� ����
		for(int i = 0; i < a.length; i++)		// a.length�� 0~9���� �̹Ƿ� ���̴� 10
		{
			a[i] = scan.nextInt();				// �Է¹��� ���� a�迭�� i��°�� �����Ѵ�.
			
		}

		System.out.println(); // �������� ���� �� �� ��
		System.out.println(); // �������� ���� �� �� ��
		
		// �迭 ��� ����� �հ�
		// 1+2+3+4+5+6+7+8+9+10=55
		int s = 0;		// ���� ������ ���� s ����
		for(int i = 0; i < a.length; i++)
		{	
			s =  s + a[i];	// a[i]�� ���� s�� ������
		} // for�� i
		
		System.out.println();
		System.out.println();

		// �Է¹޾Ҵ� ��� ���� ���
		for(int i = 0; i < a.length; i++)
		{	
			if(i < a.length - 1) // �迭 �������� 1 ���� �� ������ 
			{
				System.out.print(a[i] + (i < a.length - 1 ? "+" : "="));		
			}
			else
			{
				System.out.print(a[i] + "=");
			}
		}
		System.out.println(s);	// ����� �����ֱ� ����

		System.out.println();
		System.out.println();


	} // main
} // class
