package chapter3a;
import java.util.Scanner;
public class RightAnimal {
    public static void main(String args[]){
        String correctAnswer = "koala";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which animal is the cutest?");
        String answer = scanner.nextLine();

        while(!answer.equals(correctAnswer)){
            System.out.println("No, that's not it. Try again.");
            answer = scanner.nextLine();
        }
        scanner.close();
        if(answer.equals(correctAnswer)){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong!");
        }
    }
}
