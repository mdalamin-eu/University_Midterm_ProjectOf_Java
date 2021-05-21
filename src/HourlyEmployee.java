public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    // constructor
    public HourlyEmployee(String first, String last, String email, String phone,
                          double hourlyWage, double hoursWorked, int month, int day, int year){

        super(first, last, email, phone, month, day, year);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    // SET
    public void setWage(double hourlyWage){
        if(hourlyWage >= 0.0f)
            this.wage = hourlyWage;
        else
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0f");
    }
    public void setHours(double hoursWorked){
        if((hoursWorked >= 0.0f) && (hoursWorked <= 168.0f))
            this.hours = hoursWorked;
        else
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0f and <= 16.0f");
    }
    // GET
    public double getWage(){
        return this.wage;
    }
    public double getHours(){
        return this.hours;
    }

    @Override
    public double earnings(){
        if(getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5f;
    }

    @Override
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}