package com.BeingTech.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BeingTech.Dto.UsersDto;
import com.BeingTech.Utility.ConnectionProvider;

public class IUsersDaoImpl implements IUsersDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public boolean saveUser(UsersDto user) {
		boolean flage = false;

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
				// ps.setDate(5, new java.sql.Date(user.getrDate().getTime())); // Convert Date
				// to SQL Date

				// Check if rDate is null
				if (user.getrDate() != null) {
					ps.setDate(5, user.getrDate());
				} else {
					// Set the date to the current date if rDate is null, or use null if that's the
					// desired behavior
					ps.setDate(5, new Date(System.currentTimeMillis())); // Sets to current date
				}
				int rowAffected = ps.executeUpdate();
				if (rowAffected > 0)
					flage = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionProvider.cleanUp(conn, ps, null);
			} catch (SQLException e) {
				System.out.println("save user db close issue" + e.getMessage());
				e.printStackTrace();
			}
		}
		return flage;
	}

	@Override
	public UsersDto getUserByEmailAndPassword(String email, String password) {

	    UsersDto user = null; // Object to hold the retrieved user data

	    try {
	        conn = ConnectionProvider.getConnection();
	        if (conn != null) {
	            String selectQuery = "SELECT * FROM user WHERE Email=? AND pazzword=?";
	            ps = conn.prepareStatement(selectQuery);
	            if (ps != null) {
	                // Set parameters
	                ps.setString(1, email);
	                ps.setString(2, password);
	            }
	            rs = ps.executeQuery();

	            if (rs != null && rs.next()) {
	                // If a user is found, populate the UsersDto object
	                user = new UsersDto();
	                user.setId(rs.getInt("id"));  
	                user.setName(rs.getString("Name"));
	                user.setEmail(rs.getString("Email"));
	                user.setPazzword(rs.getString("pazzword"));
	                user.setGender(rs.getString("Gender"));
	                user.setrDate(rs.getDate("rDate"));
	                user.setProfile(rs.getString("profile"));
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("SQLException in login Dao: " + e.getMessage());
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("IOException in login Dao: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        // Cleanup resources
	        try {
	            ConnectionProvider.cleanUp(conn, ps, rs);
	        } catch (SQLException e) {
	            System.out.println("Error closing resources: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	    return user;
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
