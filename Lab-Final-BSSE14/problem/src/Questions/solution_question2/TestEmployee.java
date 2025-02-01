package Questions.question2;

public class TestEmployee {
    public static void main(String[] args) {

        Employee manager = Employee.createManager(20000, 2500);
        System.out.println("Manager's paying amount: " + manager.payAmount());


        Employee salesman = Employee.createSalesman(10000, 2500);
        System.out.println("Salesman's paying amount: " + salesman.payAmount());


        Employee engineer = Employee.createEngineer(15000);
        System.out.println("Engineer's paying amount: " + engineer.payAmount());

    }
}
