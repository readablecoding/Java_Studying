package vo;

/**
 * 게시글 정보를 담을 VO 클래스 -> VO는 value Object 값 객체
 */
public class Address 
{	
	/**
	 * 글 번호
	 */
	private int num;
	/**
	 * 작성자 이름
	 */
	private String name;
	/**
	 * 글 제목
	 */
	private String teleNum;
	/**
	 * 글 내용
	 */
	private String adrs;
	/**
	 * 기본 생성자
	 */
	public Address() 
	{
		
	}
	/**
	 * 4개의 초기값을 전달받는 생성자
	 * @param num 글 번호
	 * @param id  작성자 id
	 * @param title 글 제목
	 * @param contents 글 내용
	 */
	public Address(int num, String name, String teleNum, String adrs) {
		super();
		this.num = num;
		this.name = name;
		this.teleNum = teleNum;
		this.adrs = adrs;
	}
	
	/**
	 * getters, setters 메서드
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
	 * Object의 toString() 메소드 오버라이딩
	 */
	@Override
	public String toString() 
	{
		return "Address [회원번호=" + num + ", 이름=" + name + ", 전화번호=" + teleNum + ", 주소=" + adrs + "]";
	}
}
