class StaticTest 
{
	public static void main(String[] args) 
	{
		StaticObject.printCnt(); // cnt�� 0 
		// -> -> ù��°�� ����Ǵ� ��. static�̹Ƿ� ��ü �� ������� ���¿��� �����
		System.out.println();
		StaticObject a = new StaticObject(); // ��ü �ϳ� ���� 
		System.out.println();
		// -> StaticObject��� ��ü�� ������. ��ü ������ �����ڰ� ������ ȣ����
		// -> num�� ���� ��������� 1�� ��. cnt�� ��� ���� ���� ������ �����ؼ� 0���� 1�� ��
		a.printNum();	// num�� 1 
		a.printCnt();	// cnt�� 1 
		System.out.println();
		StaticObject b = new StaticObject(); // ��ü �ϳ� ����
		System.out.println();
		// -> num�� ���� ��������� 1�� ��. cnt�� ��� ���� ���� ������ �����ؼ� 1���� 2�� �ٲ�
		b.printNum();	// num�� 1 
		b.printCnt();	// cnt�� 2 
		System.out.println();
		
	} //main
} //class
