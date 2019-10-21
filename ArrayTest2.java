import java.util.Scanner; // Scanner를 통해 값을 입력받겠다.
class ArrayTest2
{
	public static void main(String[] args) 
	{
		//int a[] = new int[0]; -> 만들어진 객체의 주소를 a에 대입
		Scanner scan = new Scanner(System.in);
		int a[] = null; // 아직 배열은 없고 변수만 있는 것. a는 주소를 저장하는데 null을 넣으면 아무것도 가리키지 않음.
		a = new int[10]; // 이미 선언한 배열 a에 정수 10개를 저장할 준비가 된 것이다. 0으로 초기화한다.
		
		// 10개의 정수를 입력받아 a배열의 각 원소에 저장
		for(int i = 0; i < a.length; i++)		// a.length는 0~9까지 이므로 길이는 10
		{
			a[i] = scan.nextInt();				// 입력받은 것을 a배열의 i번째에 저장한다.
			
		}

		System.out.println(); // 가독성을 위해 한 줄 띔
		System.out.println(); // 가독성을 위해 한 줄 띔
		
		// 배열 모든 요소의 합계
		// 1+2+3+4+5+6+7+8+9+10=55
		int s = 0;		// 값을 더해줄 변수 s 생성
		for(int i = 0; i < a.length; i++)
		{	
			s =  s + a[i];	// a[i]의 값을 s에 누적함
		} // for문 i
		
		System.out.println();
		System.out.println();

		// 입력받았던 모든 수를 출력
		for(int i = 0; i < a.length; i++)
		{	
			if(i < a.length - 1) // 배열 개수보다 1 작을 때 까지만 
			{
				System.out.print(a[i] + (i < a.length - 1 ? "+" : "="));		
			}
			else
			{
				System.out.print(a[i] + "=");
			}
		}
		System.out.println(s);	// 결과를 보여주기 위함

		System.out.println();
		System.out.println();


	} // main
} // class
