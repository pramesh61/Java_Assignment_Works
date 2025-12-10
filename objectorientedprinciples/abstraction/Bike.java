package objectorientedprinciples.abstraction;

public class Bike extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Bike: Accelerating accelerator...");

    }

    @Override
    void brake() {
        System.out.println("Bike: Applying brakes...");

    }
}
