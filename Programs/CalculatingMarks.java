import java.util.Scanner;

public class CalculatingMarks {
    public static void main(String[] args) {
        System.out.println("Please Enter the 5 Subject Marks");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Subject 1 Marks:");
        int sub1=scanner.nextInt();

        System.out.println("Enter Subject 2 Marks:");
        int sub2=scanner.nextInt();

        System.out.println("Enter Subject 3 Marks:");
        int sub3=scanner.nextInt();

        System.out.println("Enter Subject 4 Marks:");
        int sub4=scanner.nextInt();

        System.out.println("Enter Subject 5 Marks:");
        int sub5=scanner.nextInt();

        int total=sub1+sub2+sub3+sub4+sub5;
        float average=total/5;

        System.out.println("\nAverage of the Student is "+average);

        scanner.close();

        
    }
    
}
