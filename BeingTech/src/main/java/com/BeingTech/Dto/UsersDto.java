package com.BeingTech.Dto;

import java.io.Serializable;
import java.sql.Date;

public class UsersDto implements Serializable {

	private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String email;
    private String pazzword;
    private String gender;
    private Date rDate;
    private String profile;

    @Override
	public String toString() {
		return "UsersDto [id=" + id + ", name=" + name + ", email=" + email + ", pazzword=" + pazzword + ", gender="
				+ gender + ", rDate=" + rDate + ", profile=" + profile + "]";
	}

	public UsersDto(int id, String name, String email, String pazzword, String gender, Date rDate, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pazzword = pazzword;
		this.gender = gender;
		this.rDate = rDate;
		this.profile = profile;
	}

	// Default Constructor
    public UsersDto() {
    }

    // Parameterized Constructor
    public UsersDto(int id, String name, String email, String pazzword, String gender, Date rDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pazzword = pazzword;
        this.gender = gender;
        this.rDate = rDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPazzword() {
        return pazzword;
    }

    public void setPazzword(String pazzword) {
        this.pazzword = pazzword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }


	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
}
