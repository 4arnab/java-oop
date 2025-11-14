package come.employee;

import java.util.Objects;

public class Employee {
    protected String name; // only the owner of this prop and it's sup classes can access
    private int age;
    private String address;
    private  String experience;

    public Employee(String name, int age, String address, String experience) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.experience = experience;
    }

    public Employee(){

    }

    public String getName() {

        return "Hello my name is: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    void sayHi(){
        System.out.println("Hi my name is: " + this.name);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o; // converting the object to the current type of the class
        return age == employee.age
                && Objects.equals(name, employee.name)
                && Objects.equals(address, employee.address)
                && Objects.equals(experience, employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, experience);
    }
}
