package Company;

public interface AccountManager <T extends Currency, U extends Person > {
    int getSalary(U person);
    T getCurrency();

}