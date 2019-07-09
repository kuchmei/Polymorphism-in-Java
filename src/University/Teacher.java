package University;

public  class Teacher extends Person {

    public Teacher(short age, String name) {
        super(age, name);
    }
    void printSalary(int rate, int  premium){
        System.out.println("The salary of this teacher : " + (rate+premium));
    }
    void printSalary(int rate){
        System.out.println("The salary of this teacher : " + rate);
    }
    static void printSalary(int rate, int hours, int day){
        System.out.println("The salary of this teacher : " + (rate*hours)*day);
    }
    static  void printSalary(int rate, int hours, int day, int premium){
        System.out.println("The salary of this teacher : "+ (((rate*hours)*day)+premium));
    }
}