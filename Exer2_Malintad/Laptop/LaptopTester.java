public class LaptopTester {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Apple", "MacBook Pro", "Space Gray",
                               "M2 Pro", "16GB", "1TB SSD", "macOS");

        Laptop l2 = new Laptop("Dell", "XPS 15", "Silver",
                               "Intel i7", "32GB", "1TB SSD", "Windows 11");

        Laptop l3 = new Laptop();

        l1.displayInfo();
        l2.displayInfo();
        l3.displayInfo();
    }
}