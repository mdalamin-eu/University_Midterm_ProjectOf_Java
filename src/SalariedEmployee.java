public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String first, String last, String email, String phone, double salary,
                            int month, int day, int year){

        super(first, last, email, phone, month, day, year);

        setWeeklySalary(salary);
    }
    // SET
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    // GET
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    // calculate earningse
    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}