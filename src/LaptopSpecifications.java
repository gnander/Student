public class LaptopSpecifications {
    public static void main(String[] args) {
        Laptop l = new Laptop("dell","g3","Gaming",512,5);
        System.out.println(l);
    }
}
class Laptop{
    String Company;
    String model;
    String Purposefulness;
    int Storage;
    int Ram;

    public Laptop(String company, String model, String purposefulness, int storage, int ram) {
        this.Company = company;
        this.model = model;
        this.Purposefulness = purposefulness;
        this.Storage = storage;
        this.Ram = ram;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "Company=" + Company +
                ", model=" + model +
                ", Purposefulness=" + Purposefulness +
                ", Storage=" + Storage +
                ", Ram=" + Ram +
                '}';
    }
}