interface Human				// �������̽�, ��ü ������ ����, ����� �߻�޼ҵ�θ� �̷����
{	
	public static final int a = 0;	// �޸𸮿� �ϳ��� ����� Human.a �ϸ� ��� 0�� ������
	protected abstract void say(); // �߻� �޼ҵ�, ����Ŭ�������� �ݵ�� �������̵� �ؾ���
	
}// interface

class English implements Human		// �������̽��� ��ӹ��� �� implements�� ��� �Ѵ�.
{
	//super()
	public void say()
	{
		System.out.println("����");
	}
	
}// class English

class Korean implements Human
{
	public void say()
	{
		System.out.println("��");
	}
}// class Korean

class Japanese implements Human
{
	public void say()
	{
		System.out.println("����");
	}
}// class Japanese