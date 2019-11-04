// �̸�, �������, Ű, ������, ������
// ��) ȫ�浿, 900101, 177.7. 88.8, 
import java.util.Calendar;
public class Member 
{
	// �Ӽ�
	private String name;
	private String birth;
	private double height;
	private double weight;
	private String type;


	

	// ������
	public Member()	// ������ ����� ���� 
	{

	}
	public Member(String name, String birth) // �̸��� ������ �޴� ������
	{
		this.name = name;
		this.birth = birth;
	}
	public Member(String name, String birth, double height, double weight, String type) // ��� ���� �� �޴� ������
	{
		this(name, birth);
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	// Setters,  Getters -> �� �б�, �� ����������

	public void setName(String n)
	{
		this.name = n;
	}
	public String getName()
	{
		return this.name;
	}

	public void setBirth(String b)
	{
		this.birth = b;
	}
	public String getBirth()
	{
		return this.birth;
	}

	public void setHeight(double h)
	{
		this.height = h;
	}
	public double getHeight()
	{
		return this.height;
	}


	public void setWeight(double w)
	{
		this.weight = w;
	}
	public double getWeight()
	{
		return this.weight;
	}


	public void setType(String t)
	{
		this.type= t;
	}
	public String getType()
	{
		return this.type.toUpperCase();
	}

	// �ʿ��� ���

	public int getAge()
	{
		Calendar c = Calendar.getInstance(); // calendar Ŭ������ ���� �⵵ �˱�
		int year = Integer.parseInt(birth.substring(0, 2)); // Inter.parseInt�� ���ڿ��� ������ �ٲٱ�
		int age = c.get(Calendar.YEAR) - 1900 - year;	// ���� ���� ���ϱ� 
		if(age > 100)
		{
			age -= 100;
		}
		return age;
	}

	public double getBmi()
	{
		double bmi = Math.round(this.weight / Math.pow(height / 100.0, 2))* 100 / 100.0; // �Ҽ��� ��°�ڸ� ���� ��Ÿ��. Math.pow()�� �����Լ�.
		return bmi;
	}

	public String getBmi(String msg)
	{
		double bmi = getBmi();
		String s = "";

		if(msg.equalsIgnoreCase("GRADE")) // GRADE��� ���ڰ� ������ � ������ ��Ÿ���°�?
		{

			if(bmi < 18.5)
			{
				s = "��ü��";
			}
			else if(bmi < 23.0)
			{
				s = "����ü��";
			}
			else if(bmi < 25.0)
			{
				s = "��ü��";
			}
			else
			{
				s = "��";
			}
		}
		return s;

	}
} // class
	
