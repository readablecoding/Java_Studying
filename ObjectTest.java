class ObjectTest extends Object	 // Object로부터 상속을 받는다. 
{
	public static void main(String[] args) 
	{
		ObjectTest t = new ObjectTest();	// 객체 생성
		System.out.println(t.toString());	// ObjectTest@15db9742 -> String으로 변환해줌
		System.out.println(t.equals(t));	// true -> 내용 비교하는 용도
		//System.out.println(t.abc());		// 컴파일 에러 발생함. 있지도 않은 것이니까
	}//main()
}//class
