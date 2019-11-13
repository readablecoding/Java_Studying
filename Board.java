package global.sesoc.java1.oop191113;
//게시판의 글 정보 1개를 담을 VO class
public class Board 
{
	private int num; 			//글 번호 (1,2...)
	private String id;			//작성자 ID(abc)
	private String title; 		//제목
	private String contents;		//글 내용
	
	//기본 생성자 -> 오른쪽 클릭-source-constructors from superclass
	public Board() 
	{
		
	}

	//4개의 초기값을 전달받는 생성자 -> 오른쪽 클릭-source-constructors using fields
	public Board(int num, String id, String title, String content) 
	{
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	//get,set 메소드들
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

	public String getContent() 
	{
		return contents;
	}

	public void setContent(String contents) 
	{
		this.contents = contents;
	}

	//toString
	@Override
	public String toString() 
	{
		return "Board [num=" + num + ", id=" + id + ", title=" + title + ", contents=" + contents + "]";
	}
	
	//equals
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Board))
		{
			return false;
		}
		Board b = (Board) obj;
		if(this.num == b.num && this.id.equals(b.id) && this.title.equals(b.title) & this.contents.equals(b.contents))
		{
			return true;
		}
		else
		{
			return false;
		}
	}// equals()
	
}//class Board()
