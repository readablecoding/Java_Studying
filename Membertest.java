public class Membertest
{
	public static void main(String[] args) 
	{
		/*
		Member a = new Member(); // ��� ��������� null�Ǵ� 0.0���� �ʱ�ȭ
		Member b = new Member("ȫ�浿", "010101"); // �̸��� ������ϸ� �ʱ�ȭ
		Member c = new Member("��ö��", "991111", 161.0, 56, "AB"); // ��� ���� �ʱ�ȭ

		c.setHeight(155.5); // Ű ����
		System.out.println(c.getName());	 // �̸� �б� -> ��ö��
		System.out.println(c.getAge());		// ���� �б� -> 20
		System.out.println(c.getBmi());		// BMI ����, 19.5ó�� �Ǽ������� ���� -> 23.159396615006052
		System.out.println(c.getBmi("GRADE")); // ��ü��, �� �� ���ڿ��� ���� -> ����
		*/

		Member array[]; // array�� �ּҸ� ��� ���۷��� ���� ����
		array = new Member[5]; // �迭�� ���������. ��� Ÿ�� �迭 5���� ����� ��. null�� �ʱ�ȭ��
		array[0] = new Member("��", "110101");  //new�� ��ü�� ����� �� 
		array[1] = new Member("��", "990909");
		array[2] = new Member("��", "880808");

		System.out.println(array[1].getName()); // �� -> array[1]�� ��� ��ü�� �ּ��̹Ƿ� .�� ��� name�� ����. private�̶� �ܺ� ���� �Ұ�. getName()���� ���� ���� �̸��� ���������� String�� �ȴ�.
		System.out.println(array[1].getName().length()); // 1 -> int�� ���̸� �����ش�.
		System.out.println(array[2].getBirth().charAt(0)); // 8 -> char�� �� ���ڸ� �о�´�. 
		System.out.println();

		//ù��° ȸ���� ����⵵�� int������ �о ��� -> 2011�⵵��� 11�� ������ ��
		System.out.println(Integer.parseInt(array[0].getBirth().substring(0, 2))); // 11
	
	} // main
} // class
