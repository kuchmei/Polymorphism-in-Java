package University;

public class Gradebook {
    double averageScore;
    byte course;
    int numberOfGradebook;

    public Gradebook(double averageScore, byte course, int numberOfGradebook) {
        this.averageScore = averageScore;
        this.course = course;
        this.numberOfGradebook = numberOfGradebook;
    }

    void printInformationforGradebook(double averageScore, byte course, String name){
        System.out.println(this.averageScore+this.course+this.numberOfGradebook);
    }
}