package chapter3;
import java.util.Scanner;
public class isNumberOrCharacter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String str = scanner.nextLine();
        scanner.close();
        switch (str.length()) {
            case 1:
                if (Character.isLetter(str.charAt(0))) {
                    System.out.println("The character is a letter");
                } else if (Character.isDigit(str.charAt(0))) {
                    System.out.println("The character is a digit");
                } else {
                    System.out.println("The character is a special character");
                }
                break;
            default:
                System.out.println("The character is a string");
                break;
        }
    }
}

