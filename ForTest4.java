
class ForTest4 
{
	public static void main(String[] args) 
	{
		int a, b;

		for(a = 1; a <= 9; a++)
		{
			for(b = 1; b <= 9; b++)
			{
				System.out.println(a + "*" + b + "=" + (a * b)); // 구구단 출력
			} // for문 변수 b
			System.out.println();  // 다음 줄로 넘기기
		} // for문 변수 a
	} // main()
} //ForTest4 
