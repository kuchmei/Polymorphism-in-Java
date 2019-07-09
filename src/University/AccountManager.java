package University;

public interface AccountManager <T extends University.Salary, U > {
    void calculateSalary(T salary, U person);
}