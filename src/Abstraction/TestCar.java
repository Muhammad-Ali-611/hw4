package Abstraction;

public class TestCar {
    public static void main(String[] args) {


        Car Corola = new Toyota();
        Car.starCar();
        Car.stop();

        Toyota camry = new Toyota();
        camry.carBody();

        Car series9 = new Toyota();
        series9.SafetyFeature();
    }
}
