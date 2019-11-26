package board.vo;

import java.io.Serializable;

public class Board implements Serializable //implements Serializable�� ���� ��ü ����ȭ
{
	//����
	private int num;			//�� ��ȣ
	private String name;		//�ۼ��� �̸�
	private String title;		//�� ����
	private String contents;	//�� ����
	
	//������
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
