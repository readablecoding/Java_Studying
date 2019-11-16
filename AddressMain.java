package ui;

import java.util.InputMismatchException;
public class AddressMain 
{
	public static void main(String[] args)  
	{
		try
		{
			AddressUI adui = new AddressUI();
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
	}//main()
}//class AddressMain
