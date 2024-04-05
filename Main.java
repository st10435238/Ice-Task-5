import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

      
        Student student = new Student(ID, name, surname, username, password);
        student.OutputDetails();
        scanner.close();
	}

}