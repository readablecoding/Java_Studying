class A
{
	public int num = 1;
	public A()	// ������ �����
	{
		System.out.println("AŬ������ ������");
	}

	public void print() 
	{
		System.out.println("AŬ������ �޼ҵ�");
	}
}// class A

class B extends A
{
	public int num = 2;	// ��ӹ޴� ���� �ƴ϶� ���� ���ڴ�.
	public B()
	{
		super(); // �⺻���� ����� ������ Ŭ���� A�� �⺻�����ڸ� ȣ���Ѵ�. ������ �����ص� �ȴ�.
		System.out.println("BŬ������ ������");
	}
	public void bMethod()
	{
		System.out.println("BŬ������ bMethod �޼ҵ�");
	}
	public void print() 
	{
		super.print(); // AŬ������ print()�� ����ϰڴ�.
		System.out.println("BŬ������ print �޼ҵ�");
	}
}// class B

class C extends A
{
	public int num = 3;
	public C()
	{
		System.out.println("CŬ������ ������");
	}
	public void cMethod()
	{
		System.out.println("CŬ������ bMethod �޼ҵ�");
	}
	public void print() 
	{
		System.out.println("CŬ������ print �޼ҵ�");
	}
}// class C