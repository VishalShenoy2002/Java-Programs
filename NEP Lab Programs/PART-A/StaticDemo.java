// Question 7:
// Write a program with class variable that is available for all instances of a class. 
// Use static variable declaration. Obsereve the changes that occur in the objects member variables value.
class Student {
    static String collegeName = "PES College"; 
    int rollno;
    String name;

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    void display(){
        System.out.println(collegeName+" "+rollno+" "+name);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("Object Sharing the Static Variable - College Name");
        
        Student s1 = new Student(1001,"Srikanth");
        Student s2 = new Student(1002,"Indumathi");
        
        s1.display();
        s2.display();
        
        System.out.println("\nStatic Value Changed by one of the Objects");
        s1.collegeName="Jain College";

        s1.display();
        s2.display();



    }
}
