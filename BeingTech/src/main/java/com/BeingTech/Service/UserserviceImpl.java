package com.BeingTech.Service;

import com.BeingTech.Dao.IUsersDao;
import com.BeingTech.DaoFactory.UserDaoFactory;
import com.BeingTech.Dto.UsersDto;

public class UserserviceImpl implements IUserservice {

	private IUsersDao users;
	@Override
	public boolean saveUser(UsersDto user) {
		users = UserDaoFactory.getUsersDao();
		return users.saveUser(user);
	}

	@Override
	public UsersDto getUserByEmailAndPassword(String email, String password) {
		users = UserDaoFactory.getUsersDao();
		return users.getUserByEmailAndPassword(email, password);
	}

	@Override
	public boolean updateUser(UsersDto user) {
		users = UserDaoFactory.getUsersDao();
		return users.updateUser(user);
	}

	@Override
	public UsersDto getUserByUserId(int userId) {
		users = UserDaoFactory.getUsersDao();
		return users.getUserByUserId(userId);
		
	}

}
