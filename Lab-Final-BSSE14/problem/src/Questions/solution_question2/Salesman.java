package Questions.question2;

class Salesman extends Employee {
    private final double commission;

    public Salesman(double monthlySalary, double commission) {
        super(monthlySalary);
        this.commission = commission;
    }

    @Override
    public double payAmount() {
        return monthlySalary + commission;
    }
}