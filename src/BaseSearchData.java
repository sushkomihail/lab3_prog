import java.util.Objects;

public class BaseSearchData extends SearchData {
    public BaseSearchData(String brand, int year, int price, String location) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.location = location;
        comparesTarget = 4;
    }

    public BaseSearchData(String brand) {
        this.brand = brand;
        comparesTarget = 4;
    }

    public BaseSearchData() {
        comparesTarget = 4;
    }

    public void create() {
        System.out.print("----- Фильтр -----\n\n");
        brand = inputStringFilterField("Марка");
        year = inputIntFilterField("Год");
        price = inputIntFilterField("Максимальная цена");
        location = inputStringFilterField("Местоположение");
    }

    @Override
    protected int getComparesCount(Advertisement advertisement) {
        return compareData(advertisement.getCar().getBrand().equals(brand) || brand.equals("")) +
                compareData(advertisement.getCar().getYear() == year || year == -1) +
                compareData(advertisement.getPrice() <= price || price == -1) +
                compareData(advertisement.getLocation().equals(location) || location.equals(""));
    }

    @Override
    public String toString(){
        String brand = Objects.equals(this.brand, "") ? "Все" : this.brand;
        String year = this.year == -1 ? "Все" : Integer.toString(this.year);
        String price = this.price == -1 ? "Все" : Integer.toString(this.price);
        String location = Objects.equals(this.location, "") ? "Все" : this.location;

        return "----- Параметры поиска -----\n\n" +
                "Марка: " + brand + "\n" +
                "Год: " + year + "\n" +
                "Максимальная цена: " + price + "\n" +
                "Местоположение: " + location;
    }
}
