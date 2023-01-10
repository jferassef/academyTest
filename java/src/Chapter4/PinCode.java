package Chapter4;
import java.util.Scanner;
public class PinCode {
    public static void main(String args[]){
        int tries = 0;
        int maxTries = 3;
        boolean correctPin = false;

        Scanner scanner = new Scanner(System.in);
        String pinCode = "";
        Boolean pinCodeAllowed = false;
        while (!pinCodeAllowed){
            System.out.println("Create your pin code,please enter only numbers: ");
            pinCode = scanner.nextLine();
            pinCodeAllowed = pinCode.matches("[0-9]+");
            if (!pinCodeAllowed){
                System.out.println("Pin code must contain only numbers");
            }
        }


        while(tries < maxTries && !correctPin){
            System.out.println("Enter your pin code: ");
            String entry = scanner.nextLine();
            if(entry.length() != 4){
                System.out.println("Your pin code must be 4 digits long");
            }
            else if(!entry.matches("[0-9]+")){
                System.out.println("Your pin code must be only numbers");
            }
            else if(entry.equals(pinCode)){
                System.out.println("Correct pin code");
                correctPin = true;
            }
            else{
                System.out.println("Incorrect pin code");
                tries++;
            }
        }
        scanner.close();

        if(correctPin){
            System.out.println("Correct pin code. Welcome!");
        }
        else{
            System.out.println("Sorry, you have been locked out.");
        }
    }
}
