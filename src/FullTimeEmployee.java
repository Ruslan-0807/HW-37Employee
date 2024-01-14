public class FullTimeEmployee extends Employee{
    private int salary;

    public FullTimeEmployee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    @Override
    protected double getSalary(){
        return getSalary() -getSalary()*10/100;
    }
}
