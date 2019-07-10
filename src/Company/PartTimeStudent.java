package Company;

import java.util.List;

public class PartTimeStudent extends Student {
    int numberOfVisits;

    public PartTimeStudent(int age, String name, Gradebook gradebook, Pen pen, boolean stateStudent, int numberOfVisits) {
        super(age, name, gradebook, pen, stateStudent);
        this.numberOfVisits = numberOfVisits;
    }

    void checkNumberOfVisits(PartTimeStudent student){
        if (numberOfVisits > 40){
            System.out.println("It is a good student" + student.toString());
        }
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "gradebook=" + gradebook +
                ", pen=" + pen +
                ", scholarship=" + scholarship +
                ", stateStudent=" + stateStudent +
                '}';
    }
}