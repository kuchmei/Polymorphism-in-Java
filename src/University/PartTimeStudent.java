package University;

public class PartTimeStudent extends Student {

    public PartTimeStudent(short age, String name, Gradebook gradebook, Pen pen) {
        super(age, name, gradebook, pen);
    }

    @Override
    void printInformationAboutTheStudent() {
        System.out.println("I am a part-time student of studying");
    }
}