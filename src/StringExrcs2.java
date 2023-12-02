
import java.util.Scanner;
public class StringExrcs2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = scanner.nextLine();

        System.out.println("Enter the age");
        while (!scanner.hasNext("[0-9]+")) {
            System.out.println("Invalid input. Please enter a string without numbers.");
            scanner.next();

        }
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the School name");
        String school = scanner.nextLine();

        String sentance = " My name is 1. I am 2 years old. Currently study in 3 . ";
        sentance = sentance.replace("1", name);
        sentance = sentance.replace("2", String.valueOf(age));
        sentance = sentance.replace("3",school);
        System.out.println(sentance);

    }

}
