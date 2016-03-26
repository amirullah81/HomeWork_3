package encapsulation;

public class EmployeesDatabase {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.setName("Abc");
		emp.setEmpId(123);
		emp.setSsn("123-456-789");
		emp.setDob("Dec, 02, 90");
		
		System.out.println("Name: "+ emp.getName()+ '\n'+ "ID: "+ emp.getEmpId()+ '\n'+ "SSN: "+ emp.getSsn()+ '\n'+ "Date of Birth: "+ emp.getDob());
		
		emp.setName("Def");
		emp.setEmpId(456);
		emp.setSsn("789-456-123");
		emp.setDob("Jan, 22, 79");
		
		System.out.println("Name: "+ emp.getName()+ '\n'+ "ID: "+ emp.getEmpId()+ '\n'+ "SSN: "+ emp.getSsn()+ '\n'+ "Date of Birth: "+ emp.getDob());

	}

}
