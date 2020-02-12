package com.capgemini.storesmanagementsystem.dao;

import java.util.List;

import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

public interface ManufacturerDao {
	
	public List<String> loginManufacturer(String userId, String password);
	
	public boolean addDealer(UserDetailsInfo dealer);
	public boolean modifyDealer(String userId,UserDetailsInfo user);
	public boolean removeDealer(String userId);
	public List<String> viewAllDealers(String role);
	
	public boolean addProduct(ProductDetailsInfo product);
	public boolean modifyProduct(String product);
	public boolean removeProduct(Integer productId);
	
	public List<String> viewAllProducts();
	public List<String> viewAllOrders();
	public List<String> viewStore(); 
}