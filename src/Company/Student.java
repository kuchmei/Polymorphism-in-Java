package Company;

import java.util.ArrayList;
import java.util.List;

 abstract class Student extends Person {

    Gradebook gradebook;
    Pen pen;
    List<Gradebook> gradebooks = new ArrayList<>();
    List<Pen> pens = new ArrayList<>();
    int scholarship ;
    boolean stateStudent;


     public Student(int age, String name, Gradebook gradebook, Pen pen,  boolean stateStudent) {
         super(age, name);
         this.gradebook = gradebook;
         this.pen = pen;
         this.stateStudent = stateStudent;
     }


     void addPen(Pen pen){
         System.out.println("Add new pen" + pen.toString());
         pens.add(pen);
     }

     void addGradebook(Gradebook gradebook){
         System.out.println("Add new gradebook "+ gradebook.toString());
         gradebooks.add(gradebook);
     }
}
