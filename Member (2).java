// �̸�, �������, Ű, ������, ������
// ��) ȫ�浿, 900101, 177.7. 88.8, 
import java.util.Calendar; // ��¥, �ð� ���� Ȱ��
public class Member 
{
	// �Ӽ�
	private String name;	// �̸��� ���ڿ���
	private String birth;	// ������ϵ� ���ڿ��� �ؾ� ���߿� �߶� �� �� ���ϴ�.
	private double height;	// Ű�� �Ҽ������� �����Ƿ� double�� ����
	private double weight;	// Ű�� �Ҽ������� �����Ƿ� double�� ����
	private String type;	// �������� A, B, O, AB �̷��� 2���ڵ� �����Ƿ� char�� �ƴ� String���� �Ѵ�.

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
		this(name, birth); // �ٸ� �����ڸ� ȣ���ؼ� name�� birth�� ������
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	// Setters,  Getters -> �� �б�, �� ����������

	public void setName(String n)	// ���� �о ����
	{
		this.name = n;
	}
	public String getName()			// ������ ���� ��������
	{
		return this.name;
	}

	public void setBirth(String b)	// ���� �о ����
	{
		this.birth = b;
	}
	public String getBirth()		// ������ ���� ��������
	{
		return this.birth;
	}

	public void setHeight(double h)		// ���� �о ����
	{
		this.height = h;
	}
	public double getHeight()		// ������ ���� ��������
	{
		return this.height;
	}


	public void setWeight(double w)		// ���� �о ����
	{
		this.weight = w;
	}
	public double getWeight()		// ������ ���� ��������
	{
		return this.weight;
	}


	public void setType(String t)		// ���� �о ����
	{
		this.type= t;
	}
	public String getType()			// ������ ���� ��������
	{
		return this.type.toUpperCase(); // �빮�ڷ� ������
	}

	// �ʿ��� ���

	public int getAge()	
	{
		Calendar c = Calendar.getInstance(); // calendar Ŭ������ ���� ������ ������ c�� ���� ��¥�� �ð� ������ ���� ��ü�� ����
		int year = Integer.parseInt(birth.substring(0, 2)); // Inter.parseInt�� ���ڿ��� ������ �ٲٱ�, ó�� ���ڸ� ���ڸ� ���� �¾ �⵵ ����
		int age = c.get(Calendar.YEAR) - 1900 - year;	// ���� ���� ���ϱ� -> 95����̸� 2019-1900-95�� ���� 24�� ���´�.
		if(age > 100)
		{
			age -= 100;
		}
		return age;
	}

	public double getBmi()
	{
		double bmi = Math.round(this.weight / Math.pow(height / 100.0, 2))* 100 / 100.0; // �Ҽ��� ��°�ڸ� ���� ��Ÿ��. Math.pow()�� �����Լ��� 100�� ���� �Ŀ� 100.0���� ������ �Ҽ��� ù°�ڸ� �ݿø�
		return bmi;
	}

	public String getBmi(String msg)
	{
		double bmi = getBmi(); // getBmi()�� ȣ����
		String s = ""; // ���ڿ� ���� s�� �ʱ�ȭ��Ŵ

		if(msg.equalsIgnoreCase("GRADE")) // GRADE��� ���ڰ� ������ bmi ���� ���� �� ���θ� �����ְ� �����.
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
	