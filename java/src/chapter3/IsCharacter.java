package chapter3;
import java.util.Scanner;
public class IsCharacter {
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a character: ");
    String str = scanner.nextLine();
    scanner.close();
    if (str.length() == 1) {
        if (Character.isLetter(str.charAt(0))) {
            System.out.println("The character is a letter");
        } else if (Character.isDigit(str.charAt(0))) {
            System.out.println("The character is a digit");
        } else {
            System.out.println("The character is a special character");
        }
    }
}
}
