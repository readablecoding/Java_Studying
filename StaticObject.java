class StaticObject 
{
	//변수 선언
	int num;			//멤버 변수  -> 0으로 초기화
	static int cnt;		//클래스 변수 -> 0으로 초기화
	
	//생성자 -> 변수 선언 후 마지막 작업, new 클래스명이라고 할 때 사용되는 영역
	public StaticObject()  // public 다음에 void를 입력하면 안된다. 생성자는 리턴 타입을 표기하면 안됨. void가 붙으면 일반 메서드가 됨. 아무도 안 부름
	{
		num++;	// 새로 만들어질 때마다 0에서 1로 바뀜
		cnt++;	// 이미 존재하므로 계속 값이 누적됨
		System.out.println("객체 하나 생성");
	}

	public void printNum()
	{
		System.out.println("num은 " + num);
	}
	public static void printCnt()
	{
		System.out.println("cnt는 " + cnt);
	}

} //class
