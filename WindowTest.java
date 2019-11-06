import java.awt.Frame; 
class WindowTest extends Frame // 상속 받을 때 <extends 클래스이름> 을 사용. 다른 패키지에 있다면 import를 사용
{
	public static void main(String[] args) 
	{
		WindowTest t = new WindowTest(); // 클래스의 객체 t 생성
		t.setVisible(true);	// setvisible() 메서드는 상속받아 사용한다. 창을 닫을 수 없다. 강제 종료해야 한다.
	}
}
