public abstract class Employee{
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date birthDay;

    // constructor
    public Employee(String first, String last, String email, String phone,
                    int month, int day, int year){

        setFirstName(first);
        setLastName(last);
        setEmail(email);
        setPhone(phone);

        birthDay = new Date(month, day, year);
    }
    // set
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public void setPhone(String phone){
        this.phone= phone;
    }
    // GET
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public Date getBirthday(){
        return this.birthDay;
    }
    // Employee object
    @Override
    public String toString(){
        return String.format("%s %s \nemail: %s \nphone: %s",
                getFirstName(), getLastName(), getEmail(), getPhone());
    }

    public abstract double earnings();
}