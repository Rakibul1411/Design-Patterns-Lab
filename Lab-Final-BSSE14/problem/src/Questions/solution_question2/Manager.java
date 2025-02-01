package Questions.question2;

class Manager extends Employee {
    private final double bonus;

    public Manager(double monthlySalary, double bonus) {
        super(monthlySalary);
        this.bonus = bonus;
    }

    @Override
    public double payAmount() {
        return monthlySalary + bonus;
    }
}