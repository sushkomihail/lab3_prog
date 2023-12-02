import java.util.Objects;

public class ExtensiveSearchData extends SearchData{
    private int mileage;

    public ExtensiveSearchData(){
        comparesTarget = 5;
    }

    @Override
    public void create() {
        System.out.print("----- Фильтр -----\n\n");
        brand = inputStringFilterField("Марка");
        year = inputIntFilterField("Год");
        price = inputIntFilterField("Максимальная цена");
        location = inputStringFilterField("Местоположение");
        mileage = inputIntFilterField("Пробег");
    }

    @Override
    protected int getComparesCount(Advertisement advertisement) {
        return compareData(advertisement.getCar().getBrand().equals(brand) || brand.equals("")) +
                compareData(advertisement.getCar().getYear() == year || year == -1) +
                compareData(advertisement.getPrice() <= price || price == -1) +
                compareData(advertisement.getLocation().equals(location) || location.equals("")) +
                compareData(advertisement.getCar().getMileage() == mileage || mileage == -1);
    }

    @Override
    public String toString(){
        String brand = Objects.equals(this.brand, "") ? "Все" : this.brand;
        String year = this.year == -1 ? "Все" : Integer.toString(this.year);
        String price = this.price == -1 ? "Все" : Integer.toString(this.price);
        String location = Objects.equals(this.location, "") ? "Все" : this.location;
        String mileage = this.mileage == -1 ? "Все" : Integer.toString(this.mileage);

        return "----- Параметры поиска -----\n\n" +
                "Марка: " + brand + "\n" +
                "Год: " + year + "\n" +
                "Максимальная цена: " + price + "\n" +
                "Местоположение: " + location + "\n" +
                "Максимальный пробег: " + mileage;
    }
}
