import java.util.Scanner;

public class check_dl {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Driving License Eligiblity.\n");

        System.out.println("Enter Your Age:");
        int age=scanner.nextInt();

        if(age>=18 && age<=80){
            System.out.println("You are Eligible to get your Driving License.");
        }
        else{
            System.out.println("You are Not Eligible to get your Driving License.");
        }

        scanner.close();
        
    }
    
}
