class Studying191104SecondTest 
{
	public static void main(String[] args) 
	{
		
		Studying191104Second s1 = new Studying191104Second();
		int a[] = {1, 2, 3, 4, 5};

		// 배열을 전달받아 멤버변수에 대입하는 메소드
		s1.setArray(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();			// 1 2 3 4 5

		// 배열의 원소 개수를 리턴하는 메소드
		int c = s1.count();
		System.out.println(c + "개");		// 5개
		
		// 배열 내의 모든 값의 합계를 리턴하는 메소드
		int s = s1.sum();
		System.out.println("합계는 " + s); // 합계는 15

		// int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드
		s1.add(5);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");	// 6 7 8 9 10
		}
		System.out.println();

		//정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드
		int x = s1.square(2, 5);		// 거듭제곱의 결과는 32
		System.out.println("거듭제곱의 결과는 " + x);
		// static을 통해 클래스 이름.메소드 이름으로 호출해 결과를 보여줌
		int n = Studying191104Second.square(5, 3);	// 거듭제곱의 결과는 125
		System.out.println("거듭제곱의 결과는 " + n);


	}
}
