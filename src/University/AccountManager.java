package University;

public interface AccountManager <Salary extends University.Salary, Person> {
    void calculateSalary(Salary salary, Person person);
}