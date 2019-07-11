package Company;

public  class Teacher extends Person {
    private int rate;
    private int hours;
    private int experiense;

    public Teacher(int age, String name, int rate, int hours, int experiense) {
        super(age, name);
        this.rate = rate;
        this.hours = hours;
        this.experiense = experiense;
    }


    void checkExperiense(){
        if (experiense<5) {
            System.out.println("This teacher is newcomer!");
        }
        if(experiense>=5 && experiense<10){
            System.out.println("This teacher is experienced!");
        }
        if (experiense>=10){
            System.out.println("This teacher is verye xperienced!");
        }
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public int getExperiense() {
        return experiense;
    }

    @Override
    public String toString() {
        return "Teacher{"+
        "name=" + getName() +
                ", age =" + getAge() +
                '}';
    }


}