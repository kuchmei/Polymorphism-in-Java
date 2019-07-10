package Company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("Black", 0.7f);
        Gradebook gradebook = new Gradebook(4.15f, 4, 320599 );
        Student student2 = new FullTimeStudent(20,"Denys", gradebook, pen, true, 60);
        student2.addGradebook(gradebook);
        Gradebook gradebook1 = new Gradebook(3.4f, 3,200400);
        Pen pen1 = new Pen("Blue", 0.8f);
        Student student3 = new PartTimeStudent(20, "Maxim",gradebook1,pen1,false,50 );
        student3.addGradebook(gradebook1);
        Teacher teacher = new Teacher(45, "Vasyl Petrovich");
        StudentSalary studentSalary = new StudentSalary();
        studentSalary.getSalary(student2);
        studentSalary.getSalary(student3);
    //        student2.printInformationAboutTheStudent();
//        student2.printStaticMethod();
//        Student student3 = new PartTimeStudent();
//        student3.printInformationAboutTheStudent();
//        Teacher teacher1 = new Teacher();
//        teacher1.printSalary(6000);
//        teacher1.printSalary(6000, 2000);
//        teacher1.printSalary(35,9,20);
//        teacher1.printSalary(35,9,19,500);
//        Accounting  accounting = new Accounting ();
//        accounting.calculateSalary(Company.Currency.UAH, student2);
//        Accounting  accounting1= new Accounting();
//        accounting1.calculateSalary(Company.Currency.USD,teacher1);
//        Accounting accounting2 = new Accounting();
//        accounting2.calculateSalary(Company.Currency.UAH,student3);


    }
}