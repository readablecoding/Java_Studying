package board.vo;

import java.io.Serializable;

public class Board implements Serializable //implements Serializable를 통해 객체 직렬화
{
	//변수
	private int num;			//글 번호
	private String name;		//작성자 이름
	private String title;		//글 제목
	private String contents;	//글 내용
	
	//생성자
	public Board() 
	{
		super();
	}

	public Board(int num, String name, String title, String contents) 
	{
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.contents = contents;
	}

	//getters, setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	//toString()
	@Override
	public String toString() 
	{
		return "Board [num=" + num + ", name=" + name + ", title=" + title + ", contents=" + contents + "]";
	}
	
	
	
	
	
	
	
	
}
