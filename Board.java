package board.vo;

/**
 * �Խñ� ������ ���� VO Ŭ���� -> VO�� value Object �� ��ü
 */
public class Board 
{
	/**
	 * �� ��ȣ
	 */
	private int num; // �������
	/**
	 * �ۼ��� ���̵�
	 */
	private String id;
	/**
	 * �� ����
	 */
	private String title;
	/**
	 * �� ����
	 */
	private String contents;
	
	/**
	 * �⺻ ������
	 */
	public Board() //������
	{
	}

	/** 
	 * 4���� �ʱⰪ�� ���޹޴� ������
	 * @param num �۹�ȣ
	 * @param id �ۼ��� ���̵�
	 * @param title �� ����
	 * @param contents �� ����
	 */
	public Board(int num, String id, String title, String contents) //������
	{
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	/**
	 * Setter, Getter �޼ҵ��
	 */
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getContents() 
	{
		return contents;
	}

	public void setContents(String contents) 
	{
		this.contents = contents;
	}

	/**
	 * Object�� toString() �޼ҵ� �������̵�
	 */
	@Override
	public String toString() 
	{
		return "�۹�ȣ:" + num + ", �ۼ���:" + id + ", ����:" + title + ", ����" + contents;
	}
}
