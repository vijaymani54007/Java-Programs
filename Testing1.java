import java.util.Scanner;
class Testing1
{
	public static void main(String[]args)
		{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = scanner.nextLine();
		
		System.out.println("hello mr " + name);

		System.out.println("what's your exepected salary");

		int salary = scanner.nextInt();

		System.out.println("YOUR execepted salary is "+ salary);
	}
} 