package University;

public interface AccountManager <T extends Currency, U extends Person > {
    void getSalary(U person);
    T getCurrensy();

}