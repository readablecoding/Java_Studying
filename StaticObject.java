class StaticObject 
{
	//���� ����
	int num;			//��� ����  -> 0���� �ʱ�ȭ
	static int cnt;		//Ŭ���� ���� -> 0���� �ʱ�ȭ
	
	//������ -> ���� ���� �� ������ �۾�, new Ŭ�������̶�� �� �� ���Ǵ� ����
	public StaticObject()  // public ������ void�� �Է��ϸ� �ȵȴ�. �����ڴ� ���� Ÿ���� ǥ���ϸ� �ȵ�. void�� ������ �Ϲ� �޼��尡 ��. �ƹ��� �� �θ�
	{
		num++;	// ���� ������� ������ 0���� 1�� �ٲ�
		cnt++;	// �̹� �����ϹǷ� ��� ���� ������
		System.out.println("��ü �ϳ� ����");
	}

	public void printNum()
	{
		System.out.println("num�� " + num);
	}
	public static void printCnt()
	{
		System.out.println("cnt�� " + cnt);
	}

} //class
