package com.BeingTech.DaoFactory;

import com.BeingTech.Dao.IUsersDao;
import com.BeingTech.Dao.IUsersDaoImpl;

public class UserDaoFactory {

	private UserDaoFactory()
	{
		
	}
	private static IUsersDao usersdao=null;
	
	public static IUsersDao getUsersDao()
	{
		if(usersdao==null)
		{
			usersdao = new IUsersDaoImpl();
		}
		return usersdao;
	}
}
