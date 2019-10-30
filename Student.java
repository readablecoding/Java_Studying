// ����� ���� �ڷ���
class Student // Student�� �ڷ����� �ǹ��Ѵ�.
{
	// �Ӽ� = ���� (��� ����, �ʵ�)
	// ���������� (public > protected > (default) > private)
	// private�� �ٿ� �ܺο��� ���� ���� ���ϰ� �ϰ� ���� ������ ����
	private String name;	//  �л��̸� -> �ܺο��� ���� �� �ִ´�.
	private int kor;		//  �������� -> �ܺο��� ���� �� �ִ´�.
	private int eng;		//  �������� -> �ܺο��� ���� �� �ִ´�.
	private int mat;		//  �������� -> �ܺο��� ���� �� �ִ´�.

	// ��� = �޼���
	// 1) ���� ����
	public void setKor(int k) //k��� ������ ���� 100�� ����. ���������� ���� -> �� ����
	{
		if(k < 0 || k > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.kor = k;
	}
	public int getKor()	// parameter�� ����. int������ �������� -> �� �б�
	{
		return kor;			// ���� �θ� ������ ���� �����ش�. 
	}

	// 2) ���� ����
	public void setEng(int e) //k��� ������ ���� 100�� ����. ���������� ���� -> �� ����
	{
		if(e < 0 || e > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.eng = e;
	}
	public int getEng()	// parameter�� ����. int������ �������� -> �� �б�
	{
		return eng;			// ���� �θ� ������ ���� �����ش�. 
	}
	
	// 3) ���� ����
	public void setMat(int m) //k��� ������ ���� 100�� ����. ���������� ���� -> �� ����
	{
		if(m < 0 || m > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.mat = m;
	}
	public int getMat()	// parameter�� ����. int������ �������� -> �� �б�
	{
		return mat;			// ���� �θ� ������ ���� �����ش�. 
	}

	public void print()
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
	}

} //class Student
