// Question 5:
// Write a Program to add 2 integers and 2 float numbers. 
// When no arguments are supplied, give a default value to calculate the sum. Use function overloading

public class MethodOverloadingDemo {
    int addition(){
        return 10+10;
    }

    int addition(int x,int y){
        return x+y;
    }

    float addition(float x,float y){
        return x+y;
    }
    
    public static void main(String[] args) {
        MethodOverloadingDemo m= new MethodOverloadingDemo();
        System.out.println("Sum by using Default Values:"+m.addition());
        System.out.println("Sum of Two Integer Values (10 and 20):"+m.addition(10,20));
        System.out.println("Sum of To Float Values (10.2 and 20.3):"+m.addition(10.2f,20.3f));
    }
}