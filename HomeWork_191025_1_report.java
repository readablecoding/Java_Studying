/*
continue의 의미를 정확히 알고 있는가?
*/

class HomeWork_191025_1_report 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i <= 10)
		{
			System.out.println(i++);
			if(i % 3 == 0)
			{
				continue;
			}
		}	
	}	// main
}	// class

/*
결과
0
1
2
3
4
5
6
7
8
9
10
*/

/*
<순서>
1)int i = 0;
숫자 0을 int형 변수 i에 넣는다.
  ?  
2)while(i <= 10)
{

}
변수 i의 값이 주어진 값 0부터 10보다 클 때 까지 while문을 반복한다
  ?  
3)System.out.println(i++);
i의 값을 출력을 하고 그 다음에 i의 값을 1 증가시킨다. 
  ?  
4)if(i % 3 == 0)
{
 continue;
}
변수 i에 담긴 값을 3으로 나눠서 나머지가 0이 되면 continue를 만나면 다음 문장을 실행하지 않고  반복문의 조건인 i <= 10인지 확인하러 간다. 현재는 i가 1이므로 조건에 해당한다.
i가 3, 6, 9일 때 continue를 만나 반복문의 조건으로 이동한다.
  ?  
5)i가 10이 되면 마지막으로 i값을 i값을 출력하고 i의 값을 1증가시켜 i는 11이 된다.
그 다음 if문의 내용을 통해 11 / 3을 통해 나머지가 2가 돼 continue는 하지 않는다
  ?  
6)while문의 조건인 i가 10보다 작은지 물어본다. 이미 i가 11이 됐으므로 while문을 빠져 나가고 밑에 아무 것도 없으므로 main 메서드의 중괄호를 벗어나고 또 class의 중괄호를 벗어나고 프로그램은 끝을 낸다.
  ?  
7)결과적으로 i는 0부터 10까지 차례대로 출력된다.
  ?  
<개념>
continue: 다음 문장을 실행하지 않고 다시 반복문의 처음으로 돌아간다
*/
