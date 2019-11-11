import java.awt.*;
class TypeTest3 
{
	public static void main(String[] args) 
	{
		Integer a = new Integer(100);	// Integer객체를 만들어 Integer 타입 레퍼런스 변수에 대입
		Double b = new Double(1.2);
		Number c = new Integer(200);
		Object d = new Integer(300);
		//Number e = new Boolean(true);	// incompatible types: Boolean cannot be converted to Number -> Boolean 타입 객체는 Number 클래스를 참조 못함
		Object f = new String("aaa");	// String 객체는 Object 타입이므로 가능하다. 반대로는 불가하다. String f = new Object("aaa");라고 하면 안된다.

		System.out.println(a instanceof Integer);	// true -> 맨 왼쪽에는 객체의 주소를 갖는 레퍼런스 변수, 맨 오른쪽에는 클래스 이름이 온다.  Integer객체가 Integer 타입인지 확인
		System.out.println(a instanceof Number);	// true
		System.out.println(c instanceof Integer);	// true
		System.out.println(c instanceof Number);	// true
		//System.out.println(a instanceof Double);	// Integer cannot be converted to Double
		System.out.println(d instanceof Integer);	// true
		System.out.println(d instanceof String);	// false 
		System.out.println();

		Frame g = new Frame();	// 덩치가 큰 객체이다. UI를 만들면 컴파일이 오래 걸린다.
		Container h = new Dialog(g);
		Button i = new Button();
		Component j = new Frame();

		System.out.println(g instanceof Container);		// true
		System.out.println(h instanceof Dialog);		// true 
		// System.out.println(i instanceof Container);	// Button cannot be converted to Container ->  Button과 Container는 상속관계가 아니다. 그래서 컴파일 에러 발생
		System.out.println(j instanceof Container);		// true
		System.out.println(j instanceof Frame);			// true
		System.out.println(j instanceof Button);		// false -> 참조변수가 상속관계라서 컴파일 에러는 안남. j가 Component 클래스이고 실제로 Frame객체인데 상속관계가 아닌 Button이랑 맞지 않으니 false

	}//main()
}//class
