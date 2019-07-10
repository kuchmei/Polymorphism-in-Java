package Company;

public class TeacherSalary implements AccountManager <Currency, Teacher> {
    int rate;
    int hours;
    Teacher teacher;

    public TeacherSalary(int rate, int hours, Teacher teacher) {
        this.rate = rate;
        this.hours = hours;
        this.teacher = teacher;
    }

    @Override
    public int getSalary(Teacher teacher) {
        teacher.salary = hours*rate;
        System.out.println("Teacher salary = "  + teacher.salary + " " + getCurrency());
        return teacher.salary;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
