class Studying191104SecondTest 
{
	public static void main(String[] args) 
	{
		
		Studying191104Second s1 = new Studying191104Second();
		int a[] = {1, 2, 3, 4, 5};

		// �迭�� ���޹޾� ��������� �����ϴ� �޼ҵ�
		s1.setArray(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();			// 1 2 3 4 5

		// �迭�� ���� ������ �����ϴ� �޼ҵ�
		int c = s1.count();
		System.out.println(c + "��");		// 5��
		
		// �迭 ���� ��� ���� �հ踦 �����ϴ� �޼ҵ�
		int s = s1.sum();
		System.out.println("�հ�� " + s); // �հ�� 15

		// int�� ���� �ϳ��� ���޹޾� ��� ���ҿ� ���ϱ� �ϴ� �޼ҵ�
		s1.add(5);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");	// 6 7 8 9 10
		}
		System.out.println();

		//���� 2���� ���޹޾� a�� b���� ���Ͽ� �����ϴ� �޼ҵ�
		int x = s1.square(2, 5);		// �ŵ������� ����� 32
		System.out.println("�ŵ������� ����� " + x);
		// static�� ���� Ŭ���� �̸�.�޼ҵ� �̸����� ȣ���� ����� ������
		int n = Studying191104Second.square(5, 3);	// �ŵ������� ����� 125
		System.out.println("�ŵ������� ����� " + n);


	}
}
