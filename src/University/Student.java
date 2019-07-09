package University;

import java.util.List;

 abstract class Student extends Person {

    Gradebook gradebook;
    Pen pen;
    List<Gradebook> gradebooks;
    List<Pen> pens;

     public Student(short age, String name, Gradebook gradebook, Pen pen) {
         super(age, name);
         this.gradebook = gradebook;
         this.pen = pen;
     }

     void CalculationOfScholarship(int average, int scholarship){

    }

     void printInformationAboutTheStudent(){
        System.out.println("We are all students");
    }

    static void printStaticMethod(){
        System.out.println("This is a student");
    }
}
