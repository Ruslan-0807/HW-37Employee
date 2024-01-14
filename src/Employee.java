public abstract class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String info(){
        return "Имя сотрудника :" + firstName + " Фамилия сотрудника : " + lastName;
    }

    protected abstract double getSalary();
}
