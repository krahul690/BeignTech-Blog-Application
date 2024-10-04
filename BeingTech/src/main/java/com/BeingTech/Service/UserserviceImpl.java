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
        // Retrieve the user object from the database
        UsersDto user = users.getUserByEmailAndPassword(email, password);

        // Check if the user exists and if the name is not null
        if (user != null && user.getName() != null && !user.getName().isEmpty()) {
            // Capitalize the first letter of the user's name
            String name = user.getName();
            String capitalizedFirstLetter = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            
            // Set the updated name back to the user object
            user.setName(capitalizedFirstLetter);
        }

        // Return the user object (with the name capitalized)
        return user;
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
