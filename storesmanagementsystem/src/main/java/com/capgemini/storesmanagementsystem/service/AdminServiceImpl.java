package com.capgemini.storesmanagementsystem.service;

import java.util.List;

import com.capgemini.storesmanagementsystem.dao.AdminDaoImpl;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

public class AdminServiceImpl implements AdminService{
	 AdminDaoImpl dao =new AdminDaoImpl();

	public boolean addManufacturer(UserDetailsInfo user) {
		return dao.addManufacturer(user);
	}

	public boolean updateManufacturer(String userId, UserDetailsInfo user) {
		return dao.updateManufacturer(userId, user);
	}

	public boolean deleteManufacturer(String userId) {
		return dao.deleteManufacturer(userId);
				
	}

	public List<String> viewAllManufacturer(String userRole) {
		return dao.viewAllManufacturer(userRole);
	}
	
}