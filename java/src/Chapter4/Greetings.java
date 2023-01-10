package Chapter4;
import java.util.Scanner;
public class Greetings {
    public static void main(String args[]){

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Are you a zombie:");
        boolean isZombie = scanner.nextBoolean();
        scanner.close();
        greetUser(name);
        printAge(age);
        printZombie(isZombie);

    }

    public static void greetUser(String name){

        System.out.println("Hi there, " + name);
    }

    // print age of the person
    public static void printAge(int age){
        System.out.println("Your age is: " + age);
    }

    // print if is or not a zombie
    public static void printZombie(boolean isZombie){
        System.out.println("You are a zombie: " + isZombie);
    }

}


