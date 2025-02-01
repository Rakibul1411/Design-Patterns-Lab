package Questions.question2;

public abstract class Employee {
    protected double monthlySalary;

    protected Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public abstract double payAmount();

    public static Employee createEngineer(double monthlySalary) {
        return new Engineer(monthlySalary);
    }

    public static Employee createSalesman(double monthlySalary, double commission) {
        return new Salesman(monthlySalary, commission);
    }

    public static Employee createManager(double monthlySalary, double bonus) {
        return new Manager(monthlySalary, bonus);
    }
}
