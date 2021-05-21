public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    public BasePlusCommissionEmployee(String first, String last, String email, String phone,
                                      double sales, double rate, double salary, int month, int day, int year){

        super(first, last, email, phone, sales, rate, month, day, year);
        setBaseSalary(salary);
    }


    public void setBaseSalary(double salary){
        if(salary >= 0.0f)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f");
    }
    // get
    public double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}