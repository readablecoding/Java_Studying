class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s = new Student(); // s��� ������ ������ Student Ÿ������ ���� ��. 4����Ʈ ���۷��� ����. ��ǰ�� ������� new Student��. ��ǰ ����
		Student s2 = new Student();

		//s.kor = 100;
		//s.eng = 90;
		//s.mat = 80;
		//s.name = "ȫ�浿";

		
		//System.out.println(s.name + " "); // ȫ�浿 -> ���⳪ ��ĭ�� �־�� �Ѵ�. 
		//System.out.println(s.kor);  // 100
		//System.out.println(s2.kor); // 0
		//System.out.println();		// �� �� ���

		s.setKor(100); //��ȣ �ȿ� ���ڸ� ������ parameter�� 100�� ����
		System.out.println(s.getKor());	
		s.setEng(90);
		System.out.println(s.getEng());
		s.setMat(80);
		System.out.println(s.getMat());

		
		// ������ ������� ����ϰ� �Ϸ���? �̸� ����� �� �� �ְ� �غ��ص־� �Ѵ�.  ��ü.������()
		System.out.println(s);
		s.print();	// ȫ�浿 100 90 80
		s2.print();	// null 0 0 0
		
	}
}
