import java.util.Scanner;

class Main{
    public static void main(String[] args){
        // Declaring Variables

        System.out.println("This Program will print the sum of the two numbers.\nPlease enter the Numbers as follows");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1=scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int num2=scanner.nextInt();

        System.out.println("\nAddition of the two numbers is :");
        System.out.println(num1+num2);

        System.out.println("\nSubtraction of the two numbers is :");
        System.out.println(num1-num2);

        System.out.println("\nMultiplication of the two numbers is :");
        System.out.println(num1*num2);

        System.out.println("\nDivision of the two numbers is :");
        System.out.println(num1/num2);

        scanner.close();
    }
}