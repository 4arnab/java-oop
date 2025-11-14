package come.employee;

import java.util.Arrays;

public class Programmer extends Employee{
    private  String[] progammingLangues;
    public Programmer(String name,
                      int age,
                      String address,
                      String experience,
                      String[] progammingLangues) {
        super(name, age, address, experience);
        this.progammingLangues = progammingLangues;
        // this calls Employee constructor
    }

    public String getProgammingLangues() {
        return Arrays.toString(progammingLangues);
    }

    public void setProgammingLangues(String[] progammingLangues) {
        this.progammingLangues = progammingLangues;
    }

    @Override
    void sayHi(){
        System.out.printf("Hello my name is %s I am a programmer\n", this.name);
    }
    @Override
    public String toString() {
        return "Programmer{" +
                "progammingLangues=" + Arrays.toString(progammingLangues) +
                '}';
    }

    public String writeSomeCode(){

        sayHi();
        return ("Writing some code ");
    }
}
