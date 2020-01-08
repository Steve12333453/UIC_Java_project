
public class Test {

	public static void main(String[] args) throws NegativeSalaryException, UnknownPayerException {
		// TODO Auto-generated method stub
		System.out.println("Test for Student");
		Student.testStudent();
		System.out.println("==========================================");
		System.out.println("Test for Employee");
		Employee.testEmployee();
		System.out.println("==========================================");
		System.out.println("Test for FacultyMember");
		FacultyMember.testFacultyMember();
		System.out.println("==========================================");
		System.out.println("Test for FinanceOffice");
		FinanceOffice.testFinanceOffice();
	}

}
