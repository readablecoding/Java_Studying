class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s = new Student(); // s��� ������ ������ Student Ÿ������ ���� ��. 4����Ʈ ���۷��� ����. ��ǰ�� ������� new Student��. �׷��� ��ǰ ����
		Student s2 = new Student();
		Student s3 = new Student("ȫ�浿");				// ȫ�浿
		Student s4 = new Student(100, 90, 80);			// 100, 90, 80
		Student s5 = new Student("ȫ�浿", 10, 20, 30);	// ȫ�浿, 10, 20, 30
		System.out.println();
		//s.kor = 100;
		//s.eng = 90;
		//s.mat = 80;
		//s.name = "ȫ�浿";

		//System.out.println(s.name + " "); // ȫ�浿 -> ���⳪ ��ĭ�� �־�� �Ѵ�. 
		//System.out.println(s.kor);  // 100
		//System.out.println(s2.kor); // 0
		//System.out.println();		// �� �� ���

		// ������ ������� ����ϰ� �Ϸ���? �̸� ����� �� �� �ְ� �غ��ص־� �Ѵ�.  ��ü.������()
		//System.out.println(s);
		//s.print();	// ȫ�浿 100 90 80
		//s2.print();	// null 0 0 0

		s.setKor(100);	// �������� -> ��ȣ �ȿ� ���ڸ� ������ parameter�� 100�� ����
		System.out.println(s.getKor());	

		s.setEng(100);	// ��������
		System.out.println(s.getEng());

		s.setMat(100);	// ��������
		System.out.println(s.getMat());
		System.out.println();

		int t = s.getTotal();	// 300 -> ���� �޼ҵ带 ��� 
		double d = s.getAvg();  // 100.0 -> ������� �޼ҵ带 ���
		String g = s.getGrade(); // "��" -> ��� �޼ҵ带 ���
	} //main
} //class
