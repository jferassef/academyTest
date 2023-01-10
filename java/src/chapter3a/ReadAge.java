package chapter3a;
import java.util.Scanner;
public class ReadAge {
    public static void main(String args[]){

        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        if(age < 18){
            System.out.println("You are too young!!");
        }
        else if(18 <= age && age <= 35){
            System.out.println("Young man!!");
        }
        else if(36 <= age && age <= 60){
            System.out.println("You are a middle age person");
        }
        else{
            System.out.println("You are an elden");
        }
    }
}
