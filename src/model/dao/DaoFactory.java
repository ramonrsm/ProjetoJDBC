package model.dao;

import db.util.Database;

public class DaoFactory {
	
	public static Dao createSellerDao() {
		return new SellerDaoJDBC(Database.getConnection());
	}
}
