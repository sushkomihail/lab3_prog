public class Car implements AdvertisementPart, Cloneable {
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

    public int getMileage() { return mileage; }

    public void create() {
        System.out.print("Марка: ");
        brand = Extensions.scanner().nextLine();
        year = Extensions.inputIntField("Год производства: ");
        enginePower = Extensions.inputIntField("Мощность двигателя: ");
        System.out.print("Тип КПП: ");
        transmission = Extensions.scanner().next();
        mileage = Extensions.inputIntField("Пробег: ");
    }

    @Override
    public String toString(){
        return "<<< Данные об автомобиле >>>" + "\n" +
                "Марка: " + brand + "\n" +
                "Год производства: " + year + "\n" +
                "Мощность двигателя: " + enginePower + "\n" +
                "КПП: " + transmission + "\n" +
                "Пробег: " + mileage;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
