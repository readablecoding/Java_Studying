import java.awt.*;
class TypeTest3 
{
	public static void main(String[] args) 
	{
		Integer a = new Integer(100);	// Integer��ü�� ����� Integer Ÿ�� ���۷��� ������ ����
		Double b = new Double(1.2);
		Number c = new Integer(200);
		Object d = new Integer(300);
		//Number e = new Boolean(true);	// incompatible types: Boolean cannot be converted to Number -> Boolean Ÿ�� ��ü�� Number Ŭ������ ���� ����
		Object f = new String("aaa");	// String ��ü�� Object Ÿ���̹Ƿ� �����ϴ�. �ݴ�δ� �Ұ��ϴ�. String f = new Object("aaa");��� �ϸ� �ȵȴ�.

		System.out.println(a instanceof Integer);	// true -> �� ���ʿ��� ��ü�� �ּҸ� ���� ���۷��� ����, �� �����ʿ��� Ŭ���� �̸��� �´�.  Integer��ü�� Integer Ÿ������ Ȯ��
		System.out.println(a instanceof Number);	// true
		System.out.println(c instanceof Integer);	// true
		System.out.println(c instanceof Number);	// true
		//System.out.println(a instanceof Double);	// Integer cannot be converted to Double
		System.out.println(d instanceof Integer);	// true
		System.out.println(d instanceof String);	// false 
		System.out.println();

		Frame g = new Frame();	// ��ġ�� ū ��ü�̴�. UI�� ����� �������� ���� �ɸ���.
		Container h = new Dialog(g);
		Button i = new Button();
		Component j = new Frame();

		System.out.println(g instanceof Container);		// true
		System.out.println(h instanceof Dialog);		// true 
		// System.out.println(i instanceof Container);	// Button cannot be converted to Container ->  Button�� Container�� ��Ӱ��谡 �ƴϴ�. �׷��� ������ ���� �߻�
		System.out.println(j instanceof Container);		// true
		System.out.println(j instanceof Frame);			// true
		System.out.println(j instanceof Button);		// false -> ���������� ��Ӱ���� ������ ������ �ȳ�. j�� Component Ŭ�����̰� ������ Frame��ü�ε� ��Ӱ��谡 �ƴ� Button�̶� ���� ������ false

	}//main()
}//class
