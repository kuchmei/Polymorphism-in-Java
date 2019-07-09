package University;

import java.util.List;

 abstract class Student extends Person {

    Gradebook gradebook;
    Pen pen;
    List<Gradebook> gradebooks;
    List<Pen> pens;
    int scholarship ;

     public Student(short age, String name, Gradebook gradebook, Pen pen) {
         super(age, name);
         this.gradebook = gradebook;
         this.pen = pen;
     }

     void CalculationOfScholarship(double average, int scholarship){
         gradebook.averageScore = average;
         this.scholarship = scholarship;
         if (average>4){
             scholarship=1300;
         }
         else scholarship=0;
     }
     Currency getCurrency(){
         return Currency.UAH;
     }
}
