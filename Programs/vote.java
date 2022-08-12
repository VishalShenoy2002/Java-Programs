import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        System.out.println("This Program Tells You whether You are eligible to Vote.");
        Scanner scanner =new Scanner(System.in);

        
        System.out.println("Enter Your Age :");
        int age=scanner.nextInt();
        
        if (age>=18) {
            System.out.println("You Are allowed to vote.");
        }
        else{
            System.out.println("You are not allowed to vote.");
        }
        scanner.close();
        
    }
    
}