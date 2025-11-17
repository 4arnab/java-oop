package polymorphism;

public class Car implements Vehicle{
    private int currentSpeed;

    public Car(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public Car() {
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // Implementing FOO methods that we get from the VEHICLE class in our own implementation
    @Override
    public void foo() {

    }


}
