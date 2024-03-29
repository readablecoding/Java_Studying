// Calc 클래스의 객체를 만들어 사용하는 부분
public class CalcTest 
{
	public static void main(String[] args) 
	{
		Calc c = new Calc();
		int a[] = {1, 2, 3, 4, 5};
		
		// 1) 배열을 전달받아 멤버변수에 대입하는 메소드 
		c.setArray(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2) 배열의 원소 개수를 리턴하는 메소드
		int cnt = c.count();
		System.out.println("개수 : " + cnt);

		// 3) 배열 내의 모든 값의 합계를 리턴하는 메소드
		int s = c.sum();
		System.out.println("합계 : " + s);
		
		// 4) int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드
		c.setNumber(1);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 5)정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드
		c.square(2,3);
		System.out.println(c.square(2,3));
	}
}
