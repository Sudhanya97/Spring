package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 4th Oct 10.10AM
 * @modification_date 11th Oct 10.10AM
 * @version 4.0
 * @copyright Zensar Technologuies, All rights reserved
 * @description This is product DAO package and this is done in the persistence layer. 
 * 				It implements the DAO interface
 * 				
 */


import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	@Override
	public List<Product> getAll() {
		return (List<Product>) hibernateTemplate.find("FROM Product ");
	}

	@Override
	public Product getById(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) {
		hibernateTemplate.save(product);
	}

	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	
}
