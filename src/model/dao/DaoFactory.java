package model.dao;

import db.util.Database;
import model.entities.Seller;

public class DaoFactory {
	
	public static Dao<Seller> createSellerDao() {
		return new SellerDaoJDBC(Database.getConnection());
	}
}