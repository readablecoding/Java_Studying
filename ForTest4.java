
class ForTest4 
{
	public static void main(String[] args) 
	{
		int a, b;

		for(a = 1; a <= 9; a++)
		{
			for(b = 1; b <= 9; b++)
			{
				System.out.println(a + "*" + b + "=" + (a * b)); // ������ ���
			} // for�� ���� b
			System.out.println();  // ���� �ٷ� �ѱ��
		} // for�� ���� a
	} // main()
} //ForTest4 
