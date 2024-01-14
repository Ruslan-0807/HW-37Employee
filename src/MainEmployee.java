import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new PartTimeEmployee("Анатолий", "Ушанов" ,15.0,20));
        employees.add(new PartTimeEmployee("Василий", "Шмагой" ,30.0,18));
        employees.add(new PartTimeEmployee("Андрей", "Шурин" ,12.0,23));
        employees.add(new PartTimeEmployee("Владимир", "Грибов" ,16.0,21));
        employees.add(new PartTimeEmployee("Мария", "Иванова" ,20.0,17));
        double totalSalary = sumTotalSalary(employees);
        System.out.println(totalSalary);
    }
    private static double sumTotalSalary(ArrayList<Employee> employees) {
        double totalSalary = 0.0;
        for (Employee employee: employees){
    totalSalary += employee.getSalary();
            }
        return totalSalary;
        }
    }

