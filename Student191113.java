package global.sesoc.java1.oop191113;
public class Student 
{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public Student() 
	{
			
	}
	public Student(String name, int kor, int eng, int mat) 
	{
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//������ Ŭ�� - source - generate getters and setters 
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getKor() 
	{
	
		return kor;
	}
	public void setKor(int kor) 
	{
		if(kor < 0 || kor > 100)
		{
			return;
		}
		this.kor = kor;
	}
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		if(eng < 0 || eng > 100)
		{
			return;
		}
		this.eng = eng;
	}
	public int getMat() 
	{
		return mat;
	}
	public void setMat(int mat) 
	{
		if(mat < 0 || mat > 100)
		{
			return;
		}
		this.mat = mat;
	}
	public int getTot()
	{
		return kor + eng + mat;
	}
	public double getAvg()
	{
		return this.getTot() / 3.0;
	}
	
//	@Override // ������ �ٷ� �� �� �ְ� �Ѵ�.
//	public String toString()
//	{
//		String s = name + " " + kor + " " + eng + " " + mat + " " + getAvg();
//		return s;
//	}
	
	// ������ Ŭ��-source-generate toString()���� �����.
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	@Override
	// x.equals(y)
	public boolean equals(Object obj)
	{
		// Student Ÿ���� ��ü�� �ƴϸ� false
		if(!(obj instanceof Student))
		{
			return false;
		}
		
		Student st = (Student) obj; // ��ü�� obj�� ����Ű�ٰ� �ּҸ� st�� ����. st�� Student�� ����
		//�̸�,������ ������ ��� ������ true
		if(this.name.equals(st.name) && this.kor == st.kor && this.eng == st.eng && this.eng == st.eng)
		{
			return true; 
		}
		else
		{
			return false;
		}		
	}//boolean equals
	
}//class Student 
