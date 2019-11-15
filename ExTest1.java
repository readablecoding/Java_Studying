package global.sesoc.java1.exception;

//���� ó��
public class ExTest1 
{
	public static void main(String[] args) 
	{
		//�ʱⰪ, ���� ���� -> �� �ؾ� �ϴ� ��
		String a = "10";
		String b = "0";
		int i, j, k;
		
		//���� ó��
		try
		{
			i = Integer.parseInt(a); // ���ڿ��� ���ڷ� ��ȯ 
			j = Integer.parseInt(b);
			k = i / j;		
			System.out.println(k);
		}
		catch(NumberFormatException e) // ���� �߻� ���
		{
			System.out.println("���ڰ� �ƴմϴ�");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0���� ���� �� �����ϴ�.");
			//return;  		// finally�� �̵��� ���� �ϰ� ���α׷� ����
			System.exit(0); //finally�� ��ġ�� �ʰ� ���α׷� ����
		}
		catch(Exception e) 	// ���� Ÿ���̹Ƿ� ���� �ڷ� �ű� -> �ٽ� �Է��϶�� �� �� �� �� �ϳ��� �ᵵ ��
		{
			System.out.println("�� ���� ����");
		}
		finally // �� �������ؾ� �� ���� ���� �� finally�� �ִ´�.
		{
			System.out.println("finally ��");
		}
		
		//�������� ���;� �ϴ� �κ�
		System.out.println("���α׷��� �����մϴ�.");
	}
}
