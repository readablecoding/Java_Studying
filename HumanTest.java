class HumanTest 
{
	public static void main(String[] args) 
	{
		test(new Korean());	// test()�޼ҵ带 ȣ���� ó���ϰ� ���ƿ��Բ� �Ѵ�.
		test(new English());
		test(new Japanese());
		
	}// main

	public static void test(Human ob) // Human Ÿ������ ������ Human Ÿ�� �Ӹ� �ƴ϶� ���� Ŭ������ ���� ���� �� �ִ�. Object�� say()�� �� �˾ƺ���.
	{
		ob.say();
		if(ob instanceof Korean)
		{
			System.out.println("�ѱ����Դϴ�.");
		}
		else if(ob instanceof English)
		{	
			System.out.println("�����Դϴ�.");
		}	
		else if(ob instanceof Japanese)
		{
			System.out.println("�Ϻ����Դϴ�.");
		}

	}

}// class
