import java.util.HashMap;
class MapTest
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		//�ϴ� �⺻ �ڷ����� ��ü�� ���� Key�� Value ���·� ���ڸ� �ִ´�.
		map.put(new Integer(1), new String("��"));
		map.put(new Integer(2), new String("��"));
		map.put(new Integer(3), new String("��"));
		System.out.println(map);						// {1=��, 2=��, 3=��}
		System.out.println();

		map.put(new Integer(1), new String("��"));		// {1=��, 2=��, 3=��} -> ���� Ű ���� 2�� �� �� ����.�ִ� ���� ������
		System.out.println(map);
		System.out.println();
		
		System.out.println(map.get(new Integer(1)));	// �� -> Ű ���� �ָ� �ش� ���� �����ش�.
		map.remove(new Integer(1));						// {2=��, 3=��} -> Ű ���� �ָ� �ش� Ű�� ���� ����
		System.out.println(map);
		System.out.println();

		HashMap<String, Object> map2 = new HashMap<>(); // Ű�� ���ڿ��� �ް�, ���� �ƹ��ų� ��ڴ�.
		map2.put("id", "abc");
		map2.put("name", "ȫ�浿");
		map2.put("cart", new ArrayList<Integer>());		
		map2.put("age", new Integer(10));
	
	}//main()
}//class
