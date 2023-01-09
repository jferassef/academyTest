package chapter3;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string1: ");
    String str1 = scanner.nextLine();

        System.out.println("Enter string2: ");
    String str2 = scanner.nextLine();
    scanner.close();

        if(str1.equals(str2)){
        System.out.println("Equals Method is true");
    }
        else {
        System.out.println("Equals Method is false");
    }

         if(str1.equalsIgnoreCase(str2)){
        System.out.println("equalsIgnoreCase Method is true");
    }
        else {
        System.out.println("equalsIgnoreCase Method is true");
    }

         if(str1 == str2){
        System.out.println("== is true");
    }
        else {
        System.out.println("== is true");
    }
}
}
