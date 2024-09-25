package com.BeingTech.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.BeingTech.Dto.UsersDto;
import com.BeingTech.Utility.ConnectionProvider;

public class IUsersDaoImpl implements IUsersDao {

	@Override
	public boolean saveUser(UsersDto user) {
		boolean flage = false;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ConnectionProvider.getConnection();
			if (conn != null) {
				String insertQuery = "INSERT INTO `user` (`Name`, `Email`, `pazzword`, `Gender`, `rDate`) VALUES (?, ?, ?, ?, ?)";
			    ps = conn.prepareStatement(insertQuery);
			}
			if (ps != null) {
				// Set parameters
				ps.setString(1, user.getName());
				ps.setString(2, user.getEmail());
				ps.setString(3, user.getPazzword());
				ps.setString(4, user.getGender());
				ps.setDate(5, new java.sql.Date(user.getrDate().getTime())); // Convert Date to SQL Date
				int rowAffected = ps.executeUpdate();
				if(rowAffected>0)
					flage = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ConnectionProvider.cleanUp(conn, ps, null);
			} catch (SQLException e) {
				System.out.println("save user db close issue"+e.getMessage());
				e.printStackTrace();
			}
		}
		return flage;
	}

	@Override
	public UsersDto getUserByEmailAndPassword(String email, String password) {

		return null;

	}

	@Override
	public boolean updateUser(UsersDto user) {

		return false;
	}

	@Override
	public UsersDto getUserByUserId(int userId) {

		return null;
	}

}
