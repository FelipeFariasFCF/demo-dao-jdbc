package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println();
		System.out.println("=== TEST 1: Department insert =====");
		Department dep = new Department(null, "Music");
		depDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());

	}
}