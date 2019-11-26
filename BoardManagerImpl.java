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
	//���� ����
	ArrayList<Board> list;					//�޸𸮿� �����ϱ� ����
	ObjectInputStream fin; 					//���Ͽ��� ��ü�� �о���� ��Ʈ��
	ObjectOutputStream fout;				//��ü�� ���Ͽ� �����ϴ� ��Ʈ��
	final String filename = "board.dat";
	
	public BoardManagerImpl()
	{
		try
		{
			//������ ����.
			fin = new ObjectInputStream(new FileInputStream(filename));
			//���Ͽ��� ArrayList ��ü�� �д´�.
			list = (ArrayList<Board>)fin.readObject();	//readObject()�޼ҵ�
			//��Ʈ�� �ݱ�
			fin.close();
		}	
		catch (Exception e) 
		{	
			//������ ���ų� ���� �����Ͱ� ���ų� ��Ÿ ���ܹ߻��ϸ� �� ArrayList�� �����Ѵ�.
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
			b = list.get(i); //�ּҴ���
			if(num == b.getNum())
			{
				list.remove(i);
				return true;
			}	
		}
		return false;
	}

	//���� ����
	public void saveFile()
	{
		try 
		{
			//��� ��Ʈ�� ����
			fout = new ObjectOutputStream(new FileOutputStream(filename));
			//ArrayList ��ü�� ���Ͽ� ����
			fout.writeObject(list);	//writeObject()�޼ҵ�
			//��Ʈ�� �ݱ�
			fout.close();
		} 
		catch (Exception e)
		{		
			e.printStackTrace();
		}	
	}
}
