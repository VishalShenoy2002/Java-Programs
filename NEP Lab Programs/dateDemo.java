// Question 2:
// Write a program to display the month of a year. Months of a Year should be held in an array

// Program
import java.util.Calendar;

public class dateDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        String [] months={"January","February","March","April","May","June","July","August","September",
        "October","November", "December"};

        System.out.println("Current Month: "+ months[calendar.get(Calendar.MONTH)]);
    }
}
