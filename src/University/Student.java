package University;

import java.util.List;

public class Student extends Person {

    private List<Gradebook>gradebooks;
    private List<Pen>pens;

    void printInformationAboutTheStudent(){
        System.out.println("We are all students");
    }

    static void printStaticMethod(){
        System.out.println("This is a student");
    }
}
