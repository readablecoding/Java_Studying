package myPractice;

public class ThrowTest191116 
{

	public static void main(String[] args) 
	{
		try
		{
			summary(); //at myPractice.ThrowTest.main(ThrowTest.java:10)
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//main()
	
	//������� throws Exception�� divide() �޼ҵ忡�� Exception ��ü�� �߻��Ǿ� ����ó���� ȣ��� ������ ���� �� �ִ�.
	public static int divide(int n, int m) throws Exception
	{
		return n / m;
	}
	
	//������� throws Exception�� summary() �޼��忡�� Exception ��ü�� �߻��Ǿ� ����ó���� ȣ��� ������ ���� �� �ִ�.
	public static void summary() throws Exception
	{
		try
		{
			System.out.println("����� : " + divide(10,0)); //divide() �޼��� ȣ��
		}
		catch(Exception e) 
		{
			throw new Exception("��� ����"); //at myPractice.ThrowTest.summary(ThrowTest.java:33)
			//���ο� ���� ��ü Exception�� �����Ͽ� "��� ����"��� �޽����� ž��, summary()�޼ҵ带 ȣ���� main()�޼ҵ�� ����ó�� å���� �ѱ�
		}
	}//summary()

}//class ThrowTest
