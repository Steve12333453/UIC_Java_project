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
		String str1=readLine("Type some text: ");
		System.out.println("Text read is: "+str1);
		int i=readPosInt("Type an integer: ");
		System.out.println("Integer read is: "+i);
		String str2=readLine("Type some text again: ");
		System.out.println("Text read is: "+str2);
	}

}
