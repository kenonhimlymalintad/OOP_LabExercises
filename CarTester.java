public class CarTester {

    public static void main(String[] args) {
        Car c1 = new Car("Red", "AAA111", "CH001",
                         "Ford", "Mustang",
                         "Gasoline", "Manual");

        Car c2 = new Car("Blue", "BBB222", "CH002",
                         "Chevrolet", "Camaro",
                         "Gasoline", "Automatic");

        Car c3 = new Car();

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}