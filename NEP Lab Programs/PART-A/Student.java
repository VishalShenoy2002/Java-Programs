// Question 9:
// In college first year class are having the following attributes Name of the class (BCA,BCom,BSc),Name of the Staff,
// No. of students in the class,Array of students in the class

// Define a class called FirstYear with above attributes and define a suitable constructor.
// Also write a method called bestStudent() which process a first-year object
// and returns the student with the highest marks. In the main method define the firstYeatr Object
// and find the best student of the class
import java.util.Scanner;

class FirstYear{
    String classname,classteacher;
    int stdcount;
    int stdmarks[]= new int[50];
    String stdnames[]= new String[50];
    Scanner sc = new Scanner(System.in);
    
    public FirstYear(){
        getInfo();
    }
    public void getInfo(){
        System.out.println("Please Enter Class Name:");
        classname=sc.nextLine();

        System.out.println("Please Enter Class Teacher Name:");
        classname=sc.nextLine();

        System.out.println("Please Enter Total Number of Students in the Class:");
        stdcount=sc.nextInt();

        System.out.println("Please Enter Names of Students in the Class:");
        for (int i = 0; i < stdcount; i++) {
            stdnames[i]=sc.nextLine();    
        }
        
        System.out.println("Please Enter Marks of Students in the Class:");
        for (int i = 0; i < stdcount; i++) {
            stdmarks[i]=sc.nextInt();    
        }


    }
    public void bestStudent(){
        int best=0,k=-1;
        for (int i = 0; i < stdcount; i++) {
            if (stdmarks[i]>best) {
                best=stdmarks[i];
                k=i;
            }
        }
        System.out.println("The Best Student is "+stdnames[k]);
    }
}

public class Student {
    public static void main(String[] args) {
        FirstYear fy=new FirstYear();
        fy.bestStudent();
    }
}
