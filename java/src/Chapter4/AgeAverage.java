package Chapter4;
import java.util.Scanner;
public class AgeAverage {
    public static void main(String args[]){
        //Initialize what we know
        int numberOfPersons = 2;
        int numberOfCars = 10;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i< numberOfCars; i++){

            double total = 0;
            for(int j=0; j<numberOfPersons; j++){
                System.out.println("Enter the age for person #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfPersons;
            System.out.println("The age average per person in car #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
    }

