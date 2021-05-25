public class HourlyEmployeeTest{
    public static void main(String[] args){

        // create four element Employee array
        Employee[] employees = new Employee[4];

        // initialise array with Employees
        employees[0] = new SalariedEmployee(
                "Bishal", "Thapa", "111-11-1111", 800.0f);
        employees[1] = new HourlyEmployee(
                "Jakko", "khan", "222-22-2222", 16.75f, 40.0f);
        employees[2] = new PieceWorker(
                "Masom", "Miah", "555-55-5555", 20.25f, 52.0f);
        employees[3] = new HourlyEmployee(
                "Alamin", "Md", "333-33-3333", 16.75f, 50.0f);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("\nEmployee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}