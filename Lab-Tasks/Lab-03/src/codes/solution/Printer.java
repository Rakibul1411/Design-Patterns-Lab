package codes.solution;

public class Printer {

    private final String department;

    public Printer(String department) {
        this.department = department;
        System.out.println("Creating a new printer for department: " + department);
    }


    public void print(String document) {
        System.out.println("Printing document: '" + document + "' from department: " + department);
    }
}
