import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
	private static Scanner input = new Scanner(System.in);

	// the method used to tell the user to type some text
	private static String readLine(String str) {
		System.out.print(str);
		str = input.nextLine();
		return str;
	}

	// the method used to tell the user to type some integer string
	private static int readPosInt(String str) {
		int a = 0;
		while (true) {
			System.out.print(str);
			String t = input.nextLine();
			try {
				a = Integer.parseInt(t);
			} catch (InputMismatchException e) {
				System.out.println("You must type an integer!");
			} catch (NumberFormatException e) {
				System.out.println("You must type an integer!");
			}
			if (a < 0) {
				System.out.println("Positive integers only!");
			} else if (a == 0) {
				continue;
			} else {
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinanceOffice fo = new FinanceOffice("UIC FO");
		while (true) {
			int n = readPosInt("Type an action(total:1 add:2 get:3 give:4 take:5 quit:6):");
			switch (n) {
			// Action 1: printing the total amount of debt.
			case 1:
				System.out.println("Total amount of debt: " + fo.totalDebt());
				break;
			// Action 2: adding a new payer to the finance office
			case 2:
				int i = readPosInt("Enter the payer type(student:1 employee:2 faculty member:3)");
				switch (i) {
				case 1:
					String stuName = readLine("Enter the name of the payer: ");
					int stuMoney = readPosInt("Enter the initial amount of money: ");
					Student s = new Student(stuName, stuMoney);
					fo.addPayer(s);
					System.out.println(
							"Student " + "\"" + s.getName() + "\"" + " with " + s.getDebt() + " yuan of debt added");
					break;
				case 2:
					String emName = readLine("Enter the name of the employee: ");
					int emMoney = readPosInt("Enter the initial amount of money: ");
					try {
						Employee e = new Employee(emName, emMoney);
						fo.addPayer(e);
						System.out.println("Employee " + "\'" + e.getName() + "\"" + " with " + (-e.getDebt())
								+ " yuans of salary added");
					} catch (NegativeSalaryException e) {
						// TODO Auto-generated catch block
						System.out.println("BUG! This must never happen!");
						System.exit(1);
					}
					break;
				case 3:
					String facultyName = readLine("Enter the name of the payer: ");
					int facultySalary = readPosInt("Enter the initial amount of money: ");
					try {
						FacultyMember fm = new FacultyMember(facultyName, facultySalary);
						fo.addPayer(fm);
						System.out.println("facultyMember " + "\"" + fm.getName() + "\"" + " with "
								+ (-fm.getDebt()) + " yuans of salary added");
					} catch (NegativeSalaryException e1) {
						System.out.println("BUG! This must never happen!");
						System.exit(1);
					}
					break;
				default:
					System.out.println("Unknown type of payer!");
					break;
				}
				break;
			// Action 3: listing the amount of debt for a given payer.
			case 3:
				String payerName = readLine("Enter the name of the payer:");
				try {
					System.out.println(payerName + " has " + fo.getDebt(payerName) + " yuan of debt");
				} catch (UnknownPayerException e) {
					System.out.println(e.getMessage());
					continue;
				}
				break;
			// Action 4: paying money to a given payer
			case 4:
				String payerName1 = readLine("Enter the name of the payer: ");
				int payMoney1 = readPosInt("Enter the amount of money: ");
				try {
					fo.pay(payerName1, payMoney1);
				} catch (NegativeSalaryException e1) {
					System.out.println(e1.getMessage());
				} catch (UnknownPayerException e2) {
					System.out.println(e2.getMessage());
				}
				break;
			// Action 5: taking money from a given payer
			case 5:
				String payerName2 = readLine("Enter the name of the payer: ");
				int payMoney2 = readPosInt("Enter the amount of money: ");
				try {
					fo.pay(payerName2, -payMoney2);
				} catch (NegativeSalaryException e1) {
					System.out.println(e1.getMessage());
				} catch (UnknownPayerException e2) {
					System.out.println(e2.getMessage());
				}
				break;
			case 6:
				System.out.println("Goobye!");
				System.exit(0);
				break;
			default:
				System.out.println("Unknown action!");
				break;
			}
		}
	}

}
