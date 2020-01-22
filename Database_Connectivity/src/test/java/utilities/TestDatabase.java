package utilities;

import java.sql.SQLException;

public class TestDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select Emp_Name from vbs.Employees where Emp_Id = 1").get(0));

	}
}
