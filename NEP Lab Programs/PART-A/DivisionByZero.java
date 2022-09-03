// Question 3:
// Write a Program to demonstrate Division By Zero Exception

// Program
public class DivisionByZero {
    public static void main(String[] args) {
        int a=5,b=0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Division By Zero is Not Possible");
        }
    }
}
