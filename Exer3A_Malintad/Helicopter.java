public class Helicopter extends AirTransport {
    public Helicopter(String name, int capacity, String color, String brand, String engineNo, String engineType, String plateNo) {
        super(name, capacity, color, brand, engineNo, engineType, plateNo);
    }

    public void displayInfo() {
        System.out.println("\n--- Helicopter ---");
        super.displayInfo();
    }
}