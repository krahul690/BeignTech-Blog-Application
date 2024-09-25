package com.BeingTech.Dao;

import com.BeingTech.Dto.UsersDto;

public interface IUsersDao {
 
	public boolean saveUser(UsersDto user);
	public UsersDto getUserByEmailAndPassword(String email, String password);
	public boolean updateUser(UsersDto user);
	public UsersDto getUserByUserId(int userId);
		
}
