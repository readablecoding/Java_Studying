/**
Calc Ŭ���� ����
- ��� ������ int�� �迭�� ������
- ���
  �迭�� ���޹޾� ��������� �����ϴ� �޼ҵ�
  �迭�� ���� ������ �����ϴ� �޼ҵ�
  �迭 ���� ��� ���� �հ踦 �����ϴ� �޼ҵ�
  int�� ���� �ϳ��� ���޹޾� ��� ���ҿ� ���ϱ� �ϴ� �޼ҵ�
  ���� 2���� ���޹޾� a�� b���� ���Ͽ� �����ϴ� �޼ҵ�
*/
public class Calc //�ܺ� ���� ����
{
	// �Ӽ�: ����
	private int array[]  = new int[10]; // ��� ���� int�� array �迭 , �ּҸ� ������ ���۷��� ����, null�� ����ִ�.
	// �� ��¥�� �迭�� �ʿ��ϴٸ� ����� �ȴ�. get, set�� �Ἥ �迭�� ũ�⸦ �ٲ۴�. �ܺ� ������ ���� ���� private��
	
	// ���: �޼ҵ�
	
	//1) �迭�� ���޹޾� ��������� �����ϴ� �޼ҵ�
	public void setArray(int x[])
	{
		array = x;
	}

	// 2) �迭�� ���� ������ �����ϴ� �޼ҵ�
	public int count()
	{	
	
		return  array.length;
	}
	
	// 3) �迭 ���� ��� ���� �հ踦 �����ϴ� �޼ҵ�
	public int sum()
	{
		int s = 0; 
		for(int i = 0; i < array.length; i++)
		{
			s = s + array[i];
		}
		return s;
	}

	// 4) int�� ���� �ϳ��� ���޹޾� ��� ���ҿ� ���ϱ� �ϴ� �޼ҵ�
	public void setNumber(int x)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = array[i] + x;
		}
	}
	
	// 5)���� 2���� ���޹޾� a�� b���� ���Ͽ� �����ϴ� �޼ҵ�
	public int square(int a, int b)
	{
		int result = 1; // �����ֱ� ���� ó�� ���� 1�� ����
		for(int i = 0; i < b; i++)
		{
			result = result * a;
		}
		return result;
	}







}

