public class Truck extends Car {
    private int loadCapacity;

    public Truck(String brand, int year, int enginePower, String transmission, int mileage, int loadCapacity) {
        super(brand, year, enginePower, transmission, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void create(){
        super.create();
        loadCapacity = Extensions.inputIntField("Грузоподъемность: ");
    }

    @Override
    public void printData(){
        System.out.println("Марка: " + brand);
        System.out.println("Грузоподъемность: " + loadCapacity);
    }
}
