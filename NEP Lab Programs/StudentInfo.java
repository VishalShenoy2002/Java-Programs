// Question 8:

// Write a Java Program to create a student class with the following attributes: 
// Erollement Id, Marks of sub1,sub2 and sub3 and total marks.

// Total Marks should be calculated only when a student passes in all 3 subjects. The pass mark for
// the 3 subjects is 50 if the candidtate fails in anyone of the subject then total must be declared 0.

// Using this condition write a constructor for this class. Write separate functions for acceptiong and 
// displaying the student details. In the main method create an array of 3 student objects and display details.


import java.util.Scanner;

class Student{
    Scanner sc= new Scanner(System.in);
    String enrollment_id;
    String Name;
    int sub1,sub2,sub3,total;

    Student(){
        readStudentInfo();
    }
    public void readStudentInfo(){
        System.out.println("Enter Enrollment ID:");
        enrollment_id=sc.next();

        System.out.println("Enter Student Name:");
        Name=sc.next();

        System.out.println("Enter Marks of 3 Subjects:");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();

        if (sub1>=50 && sub2>=50 && sub3>=50) {
            total=sub1+sub2+sub3;
        }
        else{
            total=0;
        }
    }
    public void display(){
        System.out.println(enrollment_id+" "+Name+" "+total);
    }

}

public class StudentInfo {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        for (int i = 0; i < s.length; i++) {
            s[i]= new Student();
        }
        System.out.println("\t\t Student Details \t\t");
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}
