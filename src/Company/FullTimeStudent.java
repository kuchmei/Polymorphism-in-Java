package Company;


public class FullTimeStudent extends Student {
    int numberOfAbsenteeism;
    int numberOfTermPapers;

    public FullTimeStudent(int age, String name, Gradebook gradebook, Pen pen, boolean stateStudent, int numberOfAbsenteeism, int numberOfTermPapers) {
        super(age, name, gradebook, pen, stateStudent);
        this.numberOfAbsenteeism = numberOfAbsenteeism;
        this.numberOfTermPapers = numberOfTermPapers;
    }

    void  checkNumberOfAbsenteeism(FullTimeStudent student){
        if (numberOfAbsenteeism>50){
            System.out.println("You have many absenteeism " + student.toString());
        }
    }


    @Override
    public String toString() {
        return "FullTimeStudent{" +
                "stateStudent=" + stateStudent +
                ", gradebook=" + gradebook +
                ", pen=" + pen +
                ", scholarship=" + scholarship +
                '}';
    }
}