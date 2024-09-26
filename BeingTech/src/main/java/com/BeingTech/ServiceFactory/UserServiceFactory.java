package com.BeingTech.ServiceFactory;

import com.BeingTech.Service.IUserservice;
import com.BeingTech.Service.UserserviceImpl;

public class UserServiceFactory {
 
	//avoid object creation
	private UserServiceFactory(){
	}
	
	private static IUserservice userservice = null;
	
	public static IUserservice getUserService()
	{
		if(userservice == null) {
			userservice = new UserserviceImpl();
		}
		return userservice;
	}
}
