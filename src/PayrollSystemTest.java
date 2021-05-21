import java.util.Calendar;

public class PayrollSystemTest{
    public static void main(String[] args){
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        // Employee array
        Employee[] employees = new Employee[5];
        //here i used this month for result (salary+bonus)
        employees[0] = new SalariedEmployee(
                "Masom", "Miah", "masom@centria.fi", "064774773428", 800.0f, 5, 3, 1883);
        employees[1] = new HourlyEmployee(
                "Karim", "Sujon", "karim@centria.fi",  "226756743738", 16.75f, 40.0f, 12, 12, 1975);
        employees[2] = new CommissionEmployee(
                "Jakko", "Khan", "jakko@centria.fi", "36775737835", 10000.0f, .06f, 12, 13, 1965);
        employees[3] = new BasePlusCommissionEmployee(
                "Bishal", "Thapa", "bishal@centria.fi", "46743348787", 5000.0f, .04f, 300.0f, 12, 12, 1956);
        //here i used this month for result (salary+bonus)
        employees[4] = new SalariedEmployee(
                "Md", "Alamin", "md.alamin@centria.fi", "064774773428", 800.0f, 5, 3, 1883);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // determine of element BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee){

                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());


            }


            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthday().getMonth() == currentMonth) ?
                            currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }


        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}