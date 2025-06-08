//Main Class
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Person p1 =new Person("Balaji", "Y");
       Student s1 = new Student("Balaji","Y",8.5);
       Employee e1 = new Employee("Sob","dor",32000);
        s1.name();
        System.out.println(s1.gpa);
        s1.showGPA();
        e1.showSalary();


        
    }



}

// Person Class(Parent)
public class Person{
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void name(){
        System.out.println("Your name is "+first+" "+last);
    }


    }

// Student(Child)
public class Student extends Person{

  double gpa;

  Student(String f, String l, double gpa){
     super(f,l);
     this.gpa = gpa;

  }
  void showGPA(){
      System.out.println(this.first+"'s GPA is: "+gpa);
  }


}

//Employee Class(Child)
public class Employee extends Person{
   double salary;

   Employee(String f, String l, double s){
       super(f,l);
       this.salary = s;
   }

   void showSalary(){
       System.out.println(this.first+"'s salary is $"+salary);
   }


}




