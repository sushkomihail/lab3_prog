public class Car {
    protected String brand;
    protected int year;
    protected int enginePower;
    protected String transmission;
    protected int mileage;

    public Car(String brand, int year, int enginePower, String transmission, int mileage) {
        this.brand = brand;
        this.year = year;
        this.enginePower = enginePower;
        this.transmission = transmission;
        this.mileage = mileage;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void create() {
        System.out.print("Марка: ");
        brand = Extensions.scanner().nextLine();
        year = Extensions.inputIntField("Год производства: ");
        enginePower = Extensions.inputIntField("Мощность двигателя: ");
        System.out.print("Тип КПП: ");
        transmission = Extensions.scanner().next();
        mileage = Extensions.inputIntField("Пробег: ");
    }

    public void printData() {
        System.out.println("<<< Данные об автомобиле >>>");
        System.out.println("Марка: " + brand);
        System.out.println("Год производства: " + year);
        System.out.println("Мощность двигателя: " + enginePower);
        System.out.println("КПП: " + transmission);
        System.out.println("Пробег: " + mileage);
    }
}
