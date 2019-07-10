package Company;

public class StudentSalary implements AccountManager<Currency,Student> {
    Student student;

    @Override
    public int getSalary(Student student){
        if (student.stateStudent == false) {
            System.out.println("This student does not have a scholarship");
        }
        else if (student.gradebook.getAverageScore()>=4) {

            student.scholarship = 1300;
        }
        else student.scholarship = 0;
        System.out.println("Student scholarship " + student.toString() + " = " +  student.scholarship + " " + getCurrency());
        return student.scholarship;
    }

    @Override
    public Currency getCurrency(){
        return Currency.UAH;
    }

}
