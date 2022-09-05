import java.util.Date;

class Employee{
    String name;
    Date appdate;

    public Employee(String nm,Date apdt){
        name=nm;
        appdate=apdt;
    }

    public void display(){
        System.out.println("Employee Name: "+name+"\tappointment date: "+appdate.getDate()+"/"+appdate.getMonth()+"/"+appdate.getYear());
    }
}
public class EmpDate {
    public static void main(String[] args) {
        Employee emp[]= new Employee[10];
        emp[0]=new Employee("Neeraja K",new Date(1999,05,02));
        emp[1]=new Employee("Kuldeep M",new Date(2000,01,12));
        emp[2]=new Employee("Roja D",new Date(2009,04,25));
        emp[3]=new Employee("Rana K",new Date(2005,02,19));
        emp[4]=new Employee("Jyothi",new Date(2010,01,01));
        emp[5]=new Employee("Srikanth",new Date(1999,01,01));
        emp[6]=new Employee("Rajesh",new Date(2020,05,19));
        emp[7]=new Employee("Asha",new Date(2022,04,22));
        emp[8]=new Employee("Ammu",new Date(2000,01,25));
        emp[9]=new Employee("Gourav",new Date(2002,9,9));
        System.out.println("List of Emplyees");
        for (int i = 0; i < emp.length; i++) {
            emp[i].display();

        }

        for (int i = 0; i < emp.length; i++) {
            for(int j=0;i<emp.length-i-1;j++){
                if(emp[i].appdate.after(emp[j].appdate)){
                    Employee t=emp[i];
                    emp[i]=emp[j];
                    emp[j]=t;

                }
            }
        }
        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }
    }
}
