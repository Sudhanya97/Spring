package com.zensar.daos;

import java.util.List;


import com.zensar.entities.Product;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 4th Oct 10.10AM
 * @modification_date 10th Sep 4.04PM
 * @version 1.0
 * @copyright Zensar Technologuies, All rights reserved
 * @description This is product DAO package and this is done in the persistence layer.
 * 				
 */

public interface ProductDao {
	
	List<Product> getAll();
	Product getById(int productId);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
}
