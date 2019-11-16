package vo;

/**
 * �Խñ� ������ ���� VO Ŭ���� -> VO�� value Object �� ��ü
 */
public class Address 
{	
	/**
	 * �� ��ȣ
	 */
	private int num;
	/**
	 * �ۼ��� �̸�
	 */
	private String name;
	/**
	 * �� ����
	 */
	private String teleNum;
	/**
	 * �� ����
	 */
	private String adrs;
	/**
	 * �⺻ ������
	 */
	public Address() 
	{
		
	}
	/**
	 * 4���� �ʱⰪ�� ���޹޴� ������
	 * @param num �� ��ȣ
	 * @param id  �ۼ��� id
	 * @param title �� ����
	 * @param contents �� ����
	 */
	public Address(int num, String name, String teleNum, String adrs) {
		super();
		this.num = num;
		this.name = name;
		this.teleNum = teleNum;
		this.adrs = adrs;
	}
	
	/**
	 * getters, setters �޼���
	 */
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getTeleNum() 
	{
		return teleNum;
	}
	public void setTeleNum(String teleNum) 
	{
		this.teleNum = teleNum;
	}
	public String getAdrs() 
	{
		return adrs;
	}
	public void setAdrs(String adrs) 
	{
		this.adrs = adrs;
	}
	
	/**
	 * Object�� toString() �޼ҵ� �������̵�
	 */
	@Override
	public String toString() 
	{
		return "Address [ȸ����ȣ=" + num + ", �̸�=" + name + ", ��ȭ��ȣ=" + teleNum + ", �ּ�=" + adrs + "]";
	}
}
