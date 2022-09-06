// Question 4:
// Write a program to create a user defined exception say Pay Out of Bound

// Program
import java.util.Scanner;

class PayoutOfBoundsException extends Exception {

    PayoutOfBoundsException(String msg){
        System.out.println("Pay Out Of Bounds Exception "+msg);
    }
    
}


public class UserDefinedExceptionDemo {
    public static void main(String argv[]) throws PayoutOfBoundsException{
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Salary:");

        int salary=scan.nextInt();
        scan.close();

        if (salary<10000 || salary>50000) {
            throw new PayoutOfBoundsException("Salary out of range");
            
        } else {
            System.out.println("Employee eligible for 30% hike.");   
        }
    }

    
}
