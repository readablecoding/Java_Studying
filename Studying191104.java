public class Studying191104 
{
	//1) �Ӽ�
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	*/
	private int array[] = new int[10];

	//2) ������
	
	public Studying191104()
	{
		name = "�̸�����";
		kor = 0;
		eng = 0;
		mat = 0;
	}
	public Studying191104(String name)
	{
		this.name = name;
	}
	public Studying191104(int kor, int eng, int mat)
	{
		this();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Studying191104(String name, int kor, int eng, int mat)
	{
		this(kor, eng, mat);
		this.name = name;
	}

	//3) �޼ҵ�

	// set~, get~
	public void setKor(int k)
	{
		if(k < 0 || k > 100)
		{
			return;
		}
		this.kor = k;
	}
	public int getKor()
	{
		return kor;
	}
	public void setEng(int e)
	{
		if(e < 0 || e > 100)
		{
			return;
		}
		this.eng = e;
	}
	public int getEng()
	{
		return eng;
	}
	public void setMat(int m)
	{
		if(m < 0 || m > 100)
		{
			return;
		}
		this.mat = m;
	}
	public int getMat()
	{
		return mat;
	}
	
	//�ٸ� ��ɵ�
	public void print() // �̸�, ��������, ��������, �������� �����ִ� �뵵
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
	}
	public int getTotal() // ���� ����������
	{
		int t = this.kor + this.eng + this.mat;
		return t;
	}
	public double getAvg() //��� ����������
	{
		double d = Math.round(getTotal() / 3.0) * 100 / 100.0 ; //�Ҽ��� 1�ڸ����� ��Ÿ���� �뵵
		return d;
	}
	public String getGrade() // ��� ����������
	{
		if(this.getAvg() >= 90.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 80.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 70.0)
		{
			String g = "��";
			return g;
		}
		else if(this.getAvg() >= 60.0)
		{
			String g = "��";
			return g;
		}
		else
		{
			String g = "��";
			return g;
		}
	}
}






