public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String first, String last, String email, String phone,
                              double sales, double rate, int month, int day, int year){
        super(first, last, email, phone, month, day, year);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setCommissionRate(double rate){
        if(rate > 0.0f && rate < 1.0f)
            this.commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    public void setGrossSales(double sales){
        if(sales >= 0.0f)
            this.grossSales = sales;
        else
            throw new IllegalArgumentException
                    ("Gross sales muse be >= 0.0f");
    }
    // GET
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    // calculate earnings
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
