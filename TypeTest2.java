class TypeTest2 
{
	public static void main(String[] args) 
	{
		// 변수 선언 (상품 가격, 구입 개수 저장)
		int price;   //가격
		int n;       //개수
		int result;  //계산 결과

		

		// 계산 (총 금액)
		price = 3000;
		n = 5;
		result = price * n;
		
	
		// 결과 출력 (총 금액)
		System.out.println("합계 금액은 ");
		System.out.println(result);


		System.out.print("합계 금액은 ");
		System.out.println(result);

		System.out.println("합계 금액은 " + result);

		char ch = 'A';
		String s = "A";

		// 1  '1' "1"
		System.out.println(1 + 1);
		System.out.println(1 + '1');
		System.out.println(1 + "1");
		System.out.println(1 + "1" + '1');
		System.out.println(1 + '1' + "1");


		

	}
}
