package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

public class DbOperations {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbConfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> products = productService.findAllProducts();
		for(Product currentProduct : products)
		{
			System.out.println(currentProduct);
		}
//		Product p = productService.findProductId(1005);
//		System.out.println(p);
//		
////		Product product = new Product(1020, "Keyboard", "Dell", 500);
////		productService.addProduct(product);
////		
////		Product p2 = new Product(1005,"Mouse","HP",200);
////		productService.updateProduct(p2);
//		
//		Product p3 = new Product(1005,"Mouse","HP",200);
//		productService.removeProduct(p3);
	}

}
