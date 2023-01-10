package Chapter4;
import java.util.Scanner;
public class printAsterisk {
    public static void main(String args[]){
        System.out.println("How many asterisks do you want to print?");
        Scanner scanner = new Scanner(System.in);
        int asterisks = scanner.nextInt();
        scanner.close();
        int counter = 0;
        int counterAst = 0;
        String result = "";

        while(counter < asterisks){
            counterAst = 0;
            while(counterAst < asterisks){
                result = result + "*";
                counterAst++;
            }
            result = result + " ";
            counter++;
        }
        System.out.println(result);
    }
}
