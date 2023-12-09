public class Truck extends Car {
    private int loadCapacity;

    public Truck(String brand, int year, int enginePower, String transmission, int mileage, int loadCapacity) {
        super(brand, year, enginePower, transmission, mileage);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand){
        super(brand);
    }

    public Truck(){

    }

    @Override
    public void create(){
        super.create();
        loadCapacity = Extensions.inputIntField("Грузоподъемность: ");
    }

    @Override
    public String toString(){
        return "<<< Данные о грузовике >>>\n" +
                "Марка: " + brand + "\n" +
                "Мощность двигателя: " + enginePower + "\n" +
                "Пробег: " + mileage + "\n" +
                "Грузоподъемность: " + loadCapacity;
    }
}
