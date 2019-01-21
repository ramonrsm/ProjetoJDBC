package model.dao;

import db.util.Database;

public class DaoFactory {
	
	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC(Database.getConnection());
	}
}