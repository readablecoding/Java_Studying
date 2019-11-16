package service;

import java.util.ArrayList;

import vo.Address;

public class AddressManagerImpl implements AddressManager
{
	ArrayList<Address> addresslist;
	
	public AddressManagerImpl() 
	{
		addresslist = new ArrayList<Address>();
	}

	@Override
	public boolean add(Address address) 
	
	{
		if(getAddress(address.getNum()) != null)
		{
			return false;
		}
		addresslist.add(address);
		return true;	
	}

	@Override
	public ArrayList<Address> listAll() 
	{
		
		return addresslist;
	}

	@Override
	public Address getAddress(int num) 
	{
		Address a = null;
		for(int i = 0; i < addresslist.size(); i++)
		{
			a = addresslist.get(i);
			if(num == a.getNum())
			{
				return a;
			}
			
		}
		return null;
	}

	@Override
	public Address getAddress(String name) 
	{
		Address a = null;
		for(int i = 0; i < addresslist.size(); i++)
		{
			a = addresslist.get(i);
			if(name.equals(a.getName()))
			{
				return a;
			}
			
		}
		return null;
	}
}//class AddressManagerImpl
