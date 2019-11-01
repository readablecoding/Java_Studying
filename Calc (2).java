/**
Calc 클래스 정의
- 멤버 변수로 int형 배열을 가진다
- 기능
  배열을 전달받아 멤버변수에 대입하는 메소드
  배열의 원소 개수를 리턴하는 메소드
  배열 내의 모든 값의 합계를 리턴하는 메소드
  int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드
  정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드
*/
public class Calc //외부 접근 가능
{
	// 속성: 변수
	private int array[]  = new int[10]; // 멤버 변수 int형 array 배열 , 주소를 가지는 레퍼런스 변수, null이 들어있다.
	// 몇 개짜리 배열이 필요하다면 만들면 된다. get, set을 써서 배열의 크기를 바꾼다. 외부 접근을 막기 위해 private로
	
	// 기능: 메소드
	
	//1) 배열을 전달받아 멤버변수에 대입하는 메소드
	public void setArray(int x[])
	{
		array = x;
	}

	// 2) 배열의 원소 개수를 리턴하는 메소드
	public int count()
	{	
	
		return this.array.length;
	}
	
	// 3) 배열 내의 모든 값의 합계를 리턴하는 메소드
	public int sum()
	{
		int s = 0; // 사용 전 0으로 초기화시킨다.
		for(int i = 0; i < array.length; i++)
		{
			s += array[i];
		}
		return s; // 저장된 값 s를 돌려보낸다.
	}

	// 4) int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드
	public void add(int n)  // -> 10이라면 n에 10이 들어간다.
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] += n;
		}
	}
	
	// 5)정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드
	public static int square(int a, int b)
	{
		int x = 1; // 곱해주기 위해 처음 값을 1로 설정, 0으로 하면 뭘 곱하든 0이 된다.
		for(int i = 0; i < b; i++) // b만큼 반복
		{
			x *= a;	//
		}
		return x;
	}

} //class

