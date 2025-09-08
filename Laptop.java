public class Laptop {

    private String brand;
    private String model;
    private String color;
    private String processor;
    private String ram;
    private String storage;
    private String os;

    // no-argument constructor
    public Laptop() {
        this.brand = "No Brand";
        this.model = "No Model";
        this.color = "No Color";
        this.processor = "No Processor";
        this.ram = "No RAM";
        this.storage = "No Storage";
        this.os = "No OS";
    }

    // argument constructor
    public Laptop(String brand, String model, String color,
                  String processor, String ram, String storage, String os) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }

    public String displayInfo() {
        String info = "";
        info += "Brand: " + this.brand;
        info += "\nModel: " + this.model;
        info += "\nColor: " + this.color;
        info += "\nProcessor: " + this.processor;
        info += "\nRAM: " + this.ram;
        info += "\nStorage: " + this.storage;
        info += "\nOperating System: " + this.os;
        System.out.println(info + "\n");
        return info;
    }
}