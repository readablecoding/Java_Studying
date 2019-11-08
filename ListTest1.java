import java.util.ArrayList;		//ArrayList Ŭ������ ���� ���� �غ��۾�
import java.util.Collections;	//Collections Ŭ������ ���� ���� �غ��۾� 
import java.util.Scanner;		//Scanner Ŭ������ ���� ���� �غ��۾�
class ListTest1 
{
	public static void main(String[] args) 
	{
		// cannot find symbol�̹Ƿ� import java.util.ArrayList;�� �ʿ��ϴ�
		ArrayList<String> list = new ArrayList<String>(); // ArrayList<�ڷ���> ������ = new ArrayList<�ڷ���>(������ ȣ��)
		// ArrayList<String> list = new ArrayList<>(); -> �޺κп� <>������ ������ ����.
		System.out.println(list); // []
		System.out.println();
		
		// ��ü�� �� ����
		list.add("aaa"); // ���ڿ��� �����Ѵ�. String��ü�� ��������� 0���� "aaa"�� �ּҰ� �� �����ϴ� ��
		list.add("bbb"); // String��ü�� ��������� 1���� "bbb"�� �ּҰ� �� �����ϴ� ��
		list.add("ccc");
		list.add("ddd");

		System.out.println(list);				// ����� ��� ��� ��� -> [aaa, bbb, ccc, ddd]
		System.out.println(list.get(0));		// 0�� ��� �о ���� -> aaa
		System.out.println(list.size());		// ����� ���� -> 4
		System.out.println();

		// �� �ٿ� �ϳ��� ����ϴ� ���
		for(int i = 0; i < list.size(); i++)	
		{
			System.out.println(list.get(i));	// 0������ size-1������ ����Ѵ�.
		}//for��
		System.out.println();

		// list�� ��� �߿� "ccc"�� ���°?
		for(int i = 0; i < list.size(); i++)	// �ݺ��� list.size()��ŭ �ϵ��� �Ѵ�. 4��
		{
			if(list.get(i).equals("ccc"))		// ������ ������ ���� ���� equals()�޼ҵ带 ����Ѵ�.
			{
				System.out.println(i + "��°");	// ��ġ ��� -> 2��°
				break;							// break�� ������ for���� Ż���Ѵ�.
			}//if��
		}//for��
		System.out.println();

		// list�� ��� �߿� "ccc"�� ���°?
		System.out.println(list.indexOf("ccc") + "��°");		// 2��°
		System.out.println();

		// ���� �޼ҵ� ���
		System.out.println(list.contains("ccc"));			// true
		list.remove(0);										// 0��° ������ ����
		System.out.println(list);							// [bbb, ccc, ddd]
		list.remove("bbb");									// "bbb"�� ����
		System.out.println(list);							// [ccc, ddd]
		System.out.println(list.size());					// 2
		System.out.println(list.isEmpty());					// false
		System.out.println();
		System.out.println(list.lastIndexOf("ccc"));		// 0
		System.out.println();

		// Wrapper Ŭ������ ���� ���� �Է°� ���
		ArrayList<Integer> list2 = new ArrayList<>();	// ���� 10���� ���� �� �ְ� �ȴ�.
		list2.add(new Integer(3));
		list2.add(new Integer(1));
		list2.add(new Integer(9));
		list2.add(new Integer(2));
		System.out.println(list2);	// [3, 1, 9, 2]
		System.out.println();

		// ���� -> cannot find symbol�� ���´�. import java.util.Collections;�� �ʿ��ϴ�
		Collections.sort(list2); // ArrayList�� �ָ� �������ֶ�� �� -> [1, 2, 3, 9]
		System.out.println(list2);

		//list2.remove(9) 
		list2.remove(new Integer(9));	// ���� 9�� �� ���� 9�� �����.
		System.out.println(list2);		// [1, 2, 3]
		System.out.println();
		
		// ������ ���� Ű����� �Է¹޾� �����
		System.out.println(list2);
		System.out.print("������ �� �Է� : ");		//
		Scanner scan = new Scanner(System.in);	//	
		int n = scan.nextInt();					// 2 -> Ű���� �� �Է¹޾� int�� ���� n�� ����
		if(list2.remove(new Integer(n)))		// new Integer(n) n�� ��ü�� �����.// int�� ���� n�� Integer ��ä�� ����� �� ���� ����ִ� ������ ���� �����. �������� true, ���������� false
		{
			System.out.println("�����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("ã�� ���� �����ϴ�");
		list2.remove(new Integer(n));			
		System.out.println(list2);				// [1, 3]

	}//main()
}// class
