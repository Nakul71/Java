class Car {
    String company, model;
    int year;

    Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    void displayCar() {
        System.out.println("Car company " + company + "with Model " + model + "and year of launch : " + year);
    }
}

public class l4q4{
    public static void main(String[] args) {
        Car myCar = new Car("Maruti", "Swift Dzire", 2024);
        myCar.displayCar();
    }
}
