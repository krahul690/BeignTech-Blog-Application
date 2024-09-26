package com.BeingTech.Service;

import com.BeingTech.Dao.IUsersDao;
import com.BeingTech.DaoFactory.UserDaoFactory;
import com.BeingTech.Dto.UsersDto;

public class UserserviceImpl implements IUserservice {

    private IUsersDao users;

    // Constructor to initialize IUsersDao
    public UserserviceImpl() {
        this.users = UserDaoFactory.getUsersDao();
    }

    @Override
    public boolean saveUser(UsersDto user) {
        if (user.getrDate() == null) {
            user.setrDate(new java.sql.Date(System.currentTimeMillis()));  // Set the current date if not provided
        }
        return users.saveUser(user);
    }

    @Override
    public UsersDto getUserByEmailAndPassword(String email, String password) {
        return users.getUserByEmailAndPassword(email, password);
    }

    @Override
    public boolean updateUser(UsersDto user) {
        return users.updateUser(user);
    }

    @Override
    public UsersDto getUserByUserId(int userId) {
        return users.getUserByUserId(userId);
    }
}
