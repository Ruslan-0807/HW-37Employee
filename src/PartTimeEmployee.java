public class PartTimeEmployee extends Employee {
    private double perHour;
    private int totalTime;

    public PartTimeEmployee(String firstName, String lastName, double perHour, int totalTime) {
        super(firstName, lastName);
        this.perHour = perHour;
        this.totalTime = totalTime;
    }
    public double getSalary(){
        return this.perHour * this.totalTime;
    }
}
