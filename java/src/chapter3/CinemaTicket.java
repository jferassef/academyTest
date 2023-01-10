package chapter3;
import java.util.Scanner;
public class CinemaTicket {
    public static void main(String args[])  {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
         scanner.close();
        Double price = 7.0;
        if(age < 5){
            Double childrenPrice = price * 0.6;
            System.out.format("your ticket price is: %.2f", childrenPrice);
        }
        else if(age > 60){
            Double eldenPrice = price * 0.55;
            System.out.format("your ticket price is: %.2f", eldenPrice);
        }
        else{
            System.out.println("your ticket price is: " + price);
        }
    }
}
