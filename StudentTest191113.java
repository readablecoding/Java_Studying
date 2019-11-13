package global.sesoc.java1.oop191113;
import java.util.ArrayList;
public class StudentTest 
{
	public static void main(String[] args)
	{
		Student a = new Student();
		Student b = new Student(new String("��"), 90, 90, 90);
		Student c = new Student(new String("��"), 90, 90, 90);
	
		System.out.println(b); 			 // �� 90 90 90 90.0
		System.out.println(b.getAvg());  // ��� ������ doubl������ ����
		System.out.println(b == c); 	 // false -> �ּ� ��, ���� ��ü���� Ȯ��
		System.out.println(b.equals(c)); // true -> println���� equals�� �ȵ�, equals�� �������̵� �ؾ� ��
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("��", 10, 10, 10));
		list.add(new Student("��", 10, 10, 10));
		System.out.println(list);		// [�� 10 10 10 10.0, �� 10 10 10 10.0]
		list.contains(new Student("��", 10, 10, 10));
			
	}//main()
}//class StudentTest
