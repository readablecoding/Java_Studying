class Studying191104Second 
{
	// 1) �Ӽ�
	private int array[] = new int[10];
	
	// 2) ������

	// 3) ���

	// �迭�� ���޹޾� ��������� �����ϴ� �޼ҵ�
	public void setArray(int x[])
	{
		this.array = x;
	}
	// �迭�� ���� ������ �����ϴ� �޼ҵ�
	public int count()
	{
		return this.array.length;
	}
	// �迭 ���� ��� ���� �հ踦 �����ϴ� �޼ҵ�
	public int sum()
	{
		int s = 0;
		for(int i = 0; i < this.array.length; i++)
		{
			s += this.array[i];
		}
		return s;
	}
	// int�� ���� �ϳ��� ���޹޾� ��� ���ҿ� ���ϱ� �ϴ� �޼ҵ�
	public void add(int n)
	{
		for(int i = 0; i < this.array.length; i++)
		{
			this.array[i] += n;
		}
	}
	// ���� 2���� ���޹޾� a�� b���� ���Ͽ� �����ϴ� �޼ҵ�
	public static int square(int a, int b)
	{
		int x = 1;
		for(int i = 0; i < b; i++)
		{
			x *= a;	// x = x * a -> a�� +b���̹Ƿ� �������� ���� a�̰� ���ϴ� Ƚ���� b�� �ȴ�.
		}
		return x;
	}

} // class
