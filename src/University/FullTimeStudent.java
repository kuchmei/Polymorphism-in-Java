package University;

public class FullTimeStudent extends Student {

    @Override
    void printInformationAboutTheStudent() {
        System.out.println("I am a full-time student of studying");
    }

    static void printStaticMethod(){
        System.out.println("This is a full-time student");
    }
}