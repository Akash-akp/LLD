package edu.lldpractice.prototypedesignpattern;

public class Employee implements Prototype{
    String name;
    String address;
    int age;
    String gender;

    public Employee(String name, String address, int age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public Employee(Employee emp){
        this.name = emp.name;
        this.address = emp.address;
        this.age = emp.age;
        this.gender = emp.gender;
    }

    @Override
    public Prototype clone() {
        return new Employee(this);
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
