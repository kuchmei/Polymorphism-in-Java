package University;

public class Accounting implements AccountManager <Currency,Person>  {
    Student student;
    Teacher teacher;
    void calculationOfScholarship(Student student, double average, int scholarship){
        student.gradebook.averageScore = average;
        this.student.scholarship = scholarship;
        if (average>4){
            scholarship=1300;
        }
        else scholarship=0;
    }
    Currency getCurrency(Student student){
        return Currency.UAH;
    }

}