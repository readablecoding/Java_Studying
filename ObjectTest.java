class ObjectTest extends Object	 // Object�κ��� ����� �޴´�. 
{
	public static void main(String[] args) 
	{
		ObjectTest t = new ObjectTest();	// ��ü ����
		System.out.println(t.toString());	// ObjectTest@15db9742 -> String���� ��ȯ����
		System.out.println(t.equals(t));	// true -> ���� ���ϴ� �뵵
		//System.out.println(t.abc());		// ������ ���� �߻���. ������ ���� ���̴ϱ�
	}//main()
}//class
