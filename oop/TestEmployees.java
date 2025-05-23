abstract class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public abstract double calculatePay();
}

class SalariedEmployee extends Employee {
    private double annualSalary;
    public SalariedEmployee(String name, double salary) {
        super(name);
        this.annualSalary = salary;
    }
    @Override
    public double calculatePay() {
        return annualSalary / 12; 
    }
}

class HourlyEmployee extends Employee {
    private double hoursWorked, rate;
    public HourlyEmployee(String name, double hours, double rate) {
        super(name);
        this.hoursWorked = hours;
        this.rate = rate;
    }
    @Override
    public double calculatePay() {
        return hoursWorked * rate;
    }
}

public class TestEmployees {
    public static void main(String[] args) {
        Employee[] emps = {
            new SalariedEmployee("Engji", 60000),
            new HourlyEmployee("Drena", 160, 30)
        };
        for (Employee e : emps) {
            System.out.printf("%s: %.2f%n", e.name, e.calculatePay());
        }
    }
}
