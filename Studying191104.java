public class Studying191104 
{
	//1) 속성
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	*/
	private int array[] = new int[10];

	//2) 생성자
	
	public Studying191104()
	{
		name = "이름없음";
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

	//3) 메소드

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
	
	//다른 기능들
	public void print() // 이름, 국어점수, 영어점수, 수학점수 보여주는 용도
	{
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
	}
	public int getTotal() // 총점 돌려보내기
	{
		int t = this.kor + this.eng + this.mat;
		return t;
	}
	public double getAvg() //평균 돌려보내기
	{
		double d = Math.round(getTotal() / 3.0) * 100 / 100.0 ; //소수점 1자리까지 나타내는 용도
		return d;
	}
	public String getGrade() // 등급 돌려보내기
	{
		if(this.getAvg() >= 90.0)
		{
			String g = "수";
			return g;
		}
		else if(this.getAvg() >= 80.0)
		{
			String g = "우";
			return g;
		}
		else if(this.getAvg() >= 70.0)
		{
			String g = "미";
			return g;
		}
		else if(this.getAvg() >= 60.0)
		{
			String g = "양";
			return g;
		}
		else
		{
			String g = "가";
			return g;
		}
	}
}






