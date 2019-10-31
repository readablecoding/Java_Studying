// ����� ���� �ڷ���
class Student // Student�� �ڷ����� �ǹ��Ѵ�.
{
	// �Ӽ� = ���� (��� ����, �ʵ�)
	// ���������� (public > protected > (default) > private)
	// private�� �ٿ� �ܺο��� ���� ���� ���ϰ� �ϰ� ���� ������ ����
	private String name;	//  �л��̸� -> �ܺο��� ���� �� �ִ´�. �ܺ� ���� ����
	private int kor;		//  �������� -> �ܺο��� ���� �� �ִ´�. �ܺ� ���� ����
	private int eng;		//  �������� -> �ܺο��� ���� �� �ִ´�. �ܺ� ���� ����
	private int mat;		//  �������� -> �ܺο��� ���� �� �ִ´�. �ܺ� ���� ����
 
	// ��� = �޼���
	// 1) ���� ���� �Է¹ް� ����������
	public void setKor(int k) //k��� ������ ���� 100�� ����. ���������� ���� -> �� ���� �뵵
	{
		if(k < 0 || k > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.kor = k;
	}
	public int getKor()	// parameter�� ����. int������ �������� -> �� �б� �뵵
	{
		return kor;			// ���� �θ� ������ ���� �����ش�. 
	}

	// 2) ���� ���� �Է¹ް� ����������
	public void setEng(int e) //e��� ������ ���� 90�� ����. ���������� ���� -> �� ���� �뵵
	{
		if(e < 0 || e > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.eng = e;
	}
	public int getEng()	// parameter�� ����. int������ �������� -> �� �б� �뵵
	{
		return eng;			// ���� �θ� ������ ���� �����ش�. 
	}
	
	// 3) ���� ���� �Է¹ް� ����������
	public void setMat(int m) //m�̶�� ������ ���� 80�� ����. ���������� ���� -> �� ���� �뵵
	{
		if(m < 0 || m > 100)
		{
			return;	// �߸� �Է½� ����
		}
		this.mat = m;
	}
	public int getMat()	// parameter�� ����. int������ �������� -> �� �б� �뵵
	{
		return mat;			// ���� �θ� ������ ���� �����ش�. 
	}

	// 4)�̸�, ��������, ��������, ���������� �������� �����ֱ� ���� �뵵 -> �̷��� ����� �ȵȴ�.
	public void print() 
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
		return;
	}
	
	// 5) ���� ���Ͽ� �����ϴ� �޼���
	public int getTotal()	// ���� �޼��� -> �ܺ� ���� ����, int�� ����, �ܺ����� ���� ����.
	{
		int t = kor + eng + mat;	// ��ü�� ����, ����, ���� ���� �ջ� , t�� �޼��忡�� ��������� ���������� ���⼭�� ����
		return t;					// ������ t�� ��� ���� ����
	}

	// 6) ��� ���Ͽ� �����ϴ� �޼���
	public double getAvg()	// ��� �޼��� -> �ܺ� ���� ����, double�� ����, �ܺ����� ���� ����.
	{
		double d = this.getTotal() / 3; // ������ ������ ���� ���� double�� ���� d�� ���� . 3.0���� ������ �Ҽ��� �Ʒ����� ����.
		return d;	// d�� ȣ���� ������ ���� ����
	}

	// 7) ��� ���Ͽ� �����ϴ� �޼���: �� ~ �������� ����� ����
	public String getGrade()
	{
		if(this.getAvg() >= 90.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 80.0 && this.getAvg() < 90.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 70.0 && this.getAvg() < 80.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 60.0 && this.getAvg() < 70.0)
		{
			String g = "��";
			return g;
		}
		else
		{
			String g = "��";
			return g;
		}

		/*
		String g = null; //��ü�� ����Ű�� �ʴ� �� , " "�� ��ü�� �ִٴ� ���̴�.
		switch((int) getAvg() / 10)
		{
			case 10: case 9:
				g = "��";
				break;
			case 8:
				g = "��";
				break;
			case 7:
				g = "��";
				break;
			case 6:
				g = "��";
				break;
			default:
				g = "��";
		}
		return g;			
		*/

	}



} //class Student
