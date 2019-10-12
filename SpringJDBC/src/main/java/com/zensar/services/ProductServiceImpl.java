package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product findProductId(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(double priceMin, double priceMax) {
		// TODO Auto-generated method stub
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsIntPriceRange = new ArrayList<Product>();
		for(Product currentProduct : listOfAllProducts)
		{
			if(currentProduct.getPrice() <= priceMax && currentProduct.getPrice() >= priceMin)
			{
				listOfProductsIntPriceRange.add(currentProduct);
			}
		}
		return listOfProductsIntPriceRange;
	}

	@Override
	public List<Product> findProductsByName(String productName) {
		// TODO Auto-generated method stub
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsWithName = new ArrayList<Product>();
		for(Product currentProduct : listOfAllProducts)
		{
			if(currentProduct.getName().contains(productName))
			{
				listOfProductsWithName.add(currentProduct);
			}
		}
		return listOfProductsWithName;
	}

	@Override
	public List<Product> findProductsByBrand(String productBrand) {
		// TODO Auto-generated method stub
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsWithBrand = new ArrayList<Product>();
		for(Product currentProduct : listOfAllProducts)
		{
			if(currentProduct.getBrand().equals(productBrand))
			{
				listOfProductsWithBrand.add(currentProduct);
			}
		}
		return listOfProductsWithBrand;
	}

	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		List<Product> listOfAllProducts = productDao.getAll();
		return listOfAllProducts.size();
	}

}
