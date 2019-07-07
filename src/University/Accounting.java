package University;

public class Accounting implements AccountManager <Salary, Person>  {
    @Override
    public void calculateSalary(Salary salary, Person person){
        System.out.println("Salary is: " + salary);
        System.out.println("Person is: " + person);
    }
}