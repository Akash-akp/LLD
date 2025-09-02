package edu.lldpractice.prototypedesignpattern;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "123 Main St", 30, "Male");
        Employee emp2 = (Employee) emp1.clone();
        emp2.setAge(33);
        emp1.showDetails();
        emp2.showDetails();
    }
}
