package board.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import board.vo.Board;

public class BoardManagerImpl implements BoardManager 
{
	//변수 선언
	ArrayList<Board> list;					//메모리에 보관하기 위함
	ObjectInputStream fin; 					//파일에서 객체를 읽어오는 스트림
	ObjectOutputStream fout;				//객체를 파일에 저장하는 스트림
	final String filename = "board.dat";
	
	public BoardManagerImpl()
	{
		try
		{
			//파일을 연다.
			fin = new ObjectInputStream(new FileInputStream(filename));
			//파일에서 ArrayList 객체를 읽는다.
			list = (ArrayList<Board>)fin.readObject();	//readObject()메소드
			//스트림 닫기
			fin.close();
		}	
		catch (Exception e) 
		{	
			//파일이 없거나 읽은 데이터가 없거나 기타 예외발생하면 빈 ArrayList를 생성한다.
			list = new ArrayList<Board>();
		} 
	}
	
	
	@Override
	public boolean add(Board board) 
	{
		if(getBoard(board.getNum()) != null)
		{
			return false;
		}
		list.add(board);
		return true;
		
	}

	
	@Override
	public ArrayList<Board> listAll() 
	{
		return list;
	}

	@Override
	public Board getBoard(int num) 
	{
		Board b = null;
		for(int i = 0; i < list.size(); i++)
		{
			b = list.get(i);
			if(num == b.getNum())
			{
				return b;
			}
		}
		return null;
	}

	
	@Override
	public boolean remove(int num) 
	{
		Board b = null;
		for(int i = 0; i < list.size(); i++)
		{
			b = list.get(i); //주소대입
			if(num == b.getNum())
			{
				list.remove(i);
				return true;
			}	
		}
		return false;
	}

	//파일 저장
	public void saveFile()
	{
		try 
		{
			//출력 스트림 생성
			fout = new ObjectOutputStream(new FileOutputStream(filename));
			//ArrayList 객체를 파일에 저장
			fout.writeObject(list);	//writeObject()메소드
			//스트림 닫기
			fout.close();
		} 
		catch (Exception e)
		{		
			e.printStackTrace();
		}	
	}
}
