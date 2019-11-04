class Studying191104Second 
{
	// 1) 속성
	private int array[] = new int[10];
	
	// 2) 생성자

	// 3) 기능

	// 배열을 전달받아 멤버변수에 대입하는 메소드
	public void setArray(int x[])
	{
		this.array = x;
	}
	// 배열의 원소 개수를 리턴하는 메소드
	public int count()
	{
		return this.array.length;
	}
	// 배열 내의 모든 값의 합계를 리턴하는 메소드
	public int sum()
	{
		int s = 0;
		for(int i = 0; i < this.array.length; i++)
		{
			s += this.array[i];
		}
		return s;
	}
	// int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드
	public void add(int n)
	{
		for(int i = 0; i < this.array.length; i++)
		{
			this.array[i] += n;
		}
	}
	// 정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드
	public static int square(int a, int b)
	{
		int x = 1;
		for(int i = 0; i < b; i++)
		{
			x *= a;	// x = x * a -> a의 +b승이므로 곱해지는 것은 a이고 곱하는 횟수는 b가 된다.
		}
		return x;
	}

} // class
