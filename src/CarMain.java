class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
        public void displayinfo() {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + this.year);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("MercedesBenz", "SclassMaybach", 2026);
        Car c2 = new Car("Genesis", "G90", 2025);
        c1.displayinfo();
        c2.displayinfo();
    }
}