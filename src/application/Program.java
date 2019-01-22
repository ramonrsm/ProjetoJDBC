package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDaoJDBC;
import model.dao.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//SellerDaoTest();
		DepartmentDaoTest();
	}
	
	public static void SellerDaoTest() {
		
		SellerDaoJDBC sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		Department department = new Department(2, null);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(department);		
		list.forEach(System.out::println);	
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller insert ===");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New id = "+newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Updat completed.");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		sellerDao.deleById(10);
		System.out.println("Delete completed");
	}
	
	public static void DepartmentDaoTest() {
		
		DepartmentDaoJDBC departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(7);		
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: deparment insert ===");
		/*department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = "+department.getId());*/
		
		System.out.println("\n=== TEST 4: deparment update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Updat completed.");
		
		System.out.println("\n=== TEST 5: seller delete ===");
		departmentDao.deleById(6);
		System.out.println("Delete completed");
	}
}
