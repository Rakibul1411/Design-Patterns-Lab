package SpeculativeGenerality.codeSmell;

public class CollapseHierarchy {
    // Speculative generality: The base class is unnecessary
    public abstract class Employee {
        public abstract double calculateSalary();
    }

    public class FullTimeEmployee extends Employee {
        @Override
        public double calculateSalary() {
            return 5000.0;
        }
    }
}
