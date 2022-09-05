package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println();
		System.out.println("=== TEST 1: Department insert =====");
		Department dep = new Department(null, "Music");
		depDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println();
		System.out.println("=== TEST 2: Department findById =====");
		Department depa = depDao.findById(2);
		System.out.println(depa);
		
		System.out.println();
		System.out.println("=== TEST 3: Department update =====");
		depa = depDao.findById(1);
		depa.setName("SocialMedia");
		depDao.update(depa);
		System.out.println("Update Completed");
		
		System.out.println();
		System.out.println("=== TEST 4: Department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("delete completed");
		
		System.out.println();
		System.out.println("=== TEST 5: Department findAll =====");
		List<Department> list= depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
	
		sc.close();
	}
}