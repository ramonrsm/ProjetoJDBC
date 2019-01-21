package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Dao sellerDao = DaoFactory.createSellerDao();
		Seller seller = (Seller) sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
