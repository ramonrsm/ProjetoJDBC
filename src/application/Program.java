package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Dao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = (Seller) sellerDao.findById(3);		
		System.out.println(seller);
	}
}
