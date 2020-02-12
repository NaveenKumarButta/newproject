package com.capgemini.storesmanagementsystem.service;

import java.util.List;

import com.capgemini.storesmanagementsystem.dao.ManufacturerDao;
import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

public class ManufacturerServiceImpl implements  ManufacturerService {
	private ManufacturerDao dao;
	public List<String> loginManufacturer(String userId, String password){
	return dao.loginManufacturer(userId, password);
	}

	public boolean addDealer(UserDetailsInfo dealer) {
		return dao.addDealer(dealer);
	}



	public boolean removeDealer(String userId) {
		return dao.removeDealer(userId);
	}
   
	
	
	
	public List<String> viewAllDealers(String userRole) {
		return dao.viewAllDealers(userRole);
	}

	public boolean addProduct(ProductDetailsInfo product) {
		return dao.addProduct(product);
	}

	public boolean modifyProduct(String product) {
		return dao.modifyProduct(product);
	}

	public boolean removeProduct(Integer productId) {
		return dao.removeProduct(productId);
	}

	public List<String> viewAllProducts() {
		return dao.viewAllProducts();
	}

	public List<String> viewAllOrders() {
		return dao.viewAllOrders();
	}

	public List<String> viewStore() {
		return dao.viewStore();
	}

	public boolean modifyDealer(String userId, UserDetailsInfo user) {
		return dao.modifyDealer(userId,user);
	}

	
}
