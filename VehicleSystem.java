import java.util.Scanner;

class Vehicle {
    String brand;
    int wheels;

    public void showInfo() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    int doors;

    public void showCarInfo() {
        showInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public void showBikeInfo() {
        showInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car input
        System.out.print("Enter Car Brand: ");
        String brandCar = sc.nextLine();
        System.out.print("Enter number of wheels: ");
        int wheelsCar = sc.nextInt();
        System.out.print("Enter number of doors: ");
        int doors = sc.nextInt();
        sc.nextLine();

        Car c = new Car();
        c.brand = brandCar;
        c.wheels = wheelsCar;
        c.doors = doors;
        c.showCarInfo();

        // Bike input
        System.out.print("\nEnter Bike Brand: ");
        String brandBike = sc.nextLine();
        System.out.print("Enter number of wheels: ");
        int wheelsBike = sc.nextInt();
        System.out.print("Does bike have gear? (true/false): ");
        boolean gear = sc.nextBoolean();

        Bike b = new Bike();
        b.brand = brandBike;
        b.wheels = wheelsBike;
        b.hasGear = gear;
        b.showBikeInfo();

        sc.close();
    }
}
