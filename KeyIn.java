import java.util.Scanner; // Scanner�� �ִ� �ܺ� ���̺귯�� ��ġ���� �������ڴ�.

class KeyIn 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    //Scanner ��ü�� ����, System.in�� Ű���� �Է� ����, in�� main �޼ҵ� �����̸�
	    int a, b, c; // ���� 3�� ����

		System.out.print("���� �Է� : " ); // ����ڿ��� �޽����� ������
		a = in.nextInt();       // nextInt�� int�� ������ �Է¹ްԲ� ����
		System.out.print("���� �Է� : " );
		b = in.nextInt();

		c = a + b;
		System.out.println(c); // ��� ���
	}
}
