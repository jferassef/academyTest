package chapter3;
import java.util.Scanner;
public class BiggestOfThree {
    // Write a program that asks the user to enter three numbers and prints the largest of the three. Also check a solution if the 3 numbers are equal.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        String str1 = scanner.nextLine();
        Double num1 = Double.parseDouble(str1);
        System.out.println("Enter number2: ");
        String str2 = scanner.nextLine();
        Double num2 = Double.parseDouble(str2);
        System.out.println("Enter number3: ");
        String str3 = scanner.nextLine();
        Double num3 = Double.parseDouble(str3);
        if(num1 >= num2){
            if(num1>=num3){
                System.out.println("biggest number: " + num1);
            }
            else{
                System.out.println("biggest number: " + num3);
            }
        } else{
            if(num2>=num3){
                System.out.println("biggest number: " + num2);
            }
            else{
                System.out.println("biggest number: " + num3);
            }
        }
    }
}

