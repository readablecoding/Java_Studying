abstract class Human			// �߻� Ŭ����, ��ü ������ ����, 
{	
	protected abstract void say(); // �߻� �޼ҵ�, ����Ŭ�������� �ݵ�� �������̵� �ؾ���
	
}// class

class English extends Human
{
	//super()
	public void say()
	{
		System.out.println("����");
	}
	
}// class English

class Korean extends Human
{
	public void say()
	{
		System.out.println("��");
	}
}// class Korean

class Japanese extends Human
{
	public void say()
	{
		System.out.println("����");
	}
}// class Korean
