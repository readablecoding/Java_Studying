import java.util.Scanner;
class APItest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	// 
		String email;	// ���� ����

		/*
		System.out.print("�̸��� �Է� : ");
		email = scan.next();	// �Է� �ޱ�

		

		System.out.println(email);
		System.out.println(email.length());	// ���ڿ� ���� -> .length() ���
		System.out.println(email.indexOf('@') != -1 && email.indexOf('.') != -1); // '@'�� '.'�� ���ԵǾ� �ֳ� -> indexOf�� ���� �� -1�� ������ ���� �� // 1�� �ƴϸ� ���� �ִٴ� ���� �����ֱ� ����
		System.out.println(email.contains("@") && email.contains(".")); // '@'�� '.'�� ���ԵǾ� �ֳ� 			
		System.out.println(email.substring(0, email.indexOf('@'))); // ID�� ���
		String s[] = email.split("@");
		System.out.println(s[0]);	// ID�� ��� -> .split("@")�ؼ� �� ���� �κ��� �迭�� @ ������ ���� ������ ��.
		System.out.println();
		
		*/

		
		System.out.print("���ϸ� �Է� : ");
		String file = scan.nextLine();	// �Է� �ޱ�. ��ĭ�� ���� �� �����Ƿ� .nextLine���� �޴´�.
		
		// "exe", "com" Ȯ���ڸ� ���� ������ �ø� �� �����ϴ�.
		// My.company.hwp	
		
		if(file.toLowerCase().endsWith(".exe") || file.toLowerCase().endsWith(".com"))	// �ϴ� �ҹ��ڷ� �ٲٰ� �� ���� .exe�� .com�� ���������� ���� ��
		{
			System.out.println("\"exe\", \"com\" Ȯ���ڸ� ���� ������ �ø� �� �����ϴ�.");	// " "�� �������� \"�� Ȱ����
		}	


		// Ȯ���ڸ� ���. �Ǵ� Ȯ���ڰ� �����ϴ�.
		// �� �̷¼� v1.doc
		String ext = "";	// �ʱ�ȭ��
		String sa[];		// split���� �߶� ���� �迭�� �ִ� �뵵��

		if(!file.contains("."))	// .�� ���Ե��� ���� ���� !�� �־� �� ������ not�̴�. ����� ������ ��
		{
			System.out.println("Ȯ���ڰ� �����ϴ�.");
		}
		else
		{
			// 1��° ���
			ext = file.substring(file.lastIndexOf('.') + 1);	// .�� �ִ� ������ ��ġ���� 1�� ���ؼ� ��ġ 7���� ������ �о�� ��
			// 2���� ���
			sa = file.split("[.]");	//.�������� �߶� �迭�� �־��
			ext = sa[sa.length -1];	// �迭 ��ġ���� 1�� ���̸� ������ �迭 ��ġ�� �ִ� Ȯ���ڸ� ã�� �� �ִ�.	
			System.out.println("Ȯ���� : " + ext);
			// ���� �� ���
			// file.substring(file.indexOf(".") + 1, file.length()));

		}
		
	}	// main()
}	// class
