package University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printStaticMethod();
        student1.printInformationAboutTheStudent();
        Student student2 = new FullTimeStudent();
        student2.printInformationAboutTheStudent();
        student2.printStaticMethod();
        Student student3 = new PartTimeStudent();
        student3.printInformationAboutTheStudent();
        Teacher teacher1 = new Teacher();
        teacher1.printSalary(6000);
        teacher1.printSalary(6000, 2000);
        teacher1.printSalary(35,9,20);
        teacher1.printSalary(35,9,19,500);
        Accounting  accounting = new Accounting ();
        accounting.calculateSalary(Salary.UAH, student2);
        Accounting  accounting1= new Accounting();
        accounting1.calculateSalary(Salary.USD,teacher1);
        Accounting accounting2 = new Accounting();
        accounting2.calculateSalary(Salary.UAH,student3);


    }
}