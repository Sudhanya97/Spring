package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 4th Oct 10.10AM
 * @modification_date 4th Oct 11.42AM
 * @version 1.0
 * @copyright Zensar Technologuies, All rights reserved
 * @description This is product DAO package and this is done in the business layer. 
 * 				It implements the DAO interface
 * 				
 */
public interface ProductService {

	List<Product> findAllProducts();
	Product findProductId(int productId);
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	List<Product> findProductsByPriceRange(double priceMin, double priceMax);
	List<Product> findProductsByName(String productName);
	List<Product> findProductsByBrand(String productBrand);
	long getProductCount();
	
	
}
