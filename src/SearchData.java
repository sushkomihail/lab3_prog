import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SearchData implements AdvertisementPart {
    private final int COMPARES_TARGET = 4;
    private String brand;
    private int year;
    private int price;
    private String location;

    public SearchData(String brand, int year, int price, String location) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.location = location;
    }

    public SearchData(String brand) {
        this.brand = brand;
    }

    public SearchData() {

    }

    public void create() {
        System.out.print("----- Фильтр -----\n\n");
        brand = inputStringFilterField("Марка");
        year = inputIntFilterField("Год");
        price = inputIntFilterField("Максимальная цена");
        location = inputStringFilterField("Местоположение");
    }

    public List<Advertisement> sortAdvertisementList(List<Advertisement> list) {
        List<Advertisement> newList = new ArrayList<>();

        int counter = 0;

        for (Advertisement advertisement : list) {
            counter += compareData(advertisement.getCar().getBrand().equals(brand) || brand.equals(""));
            counter += compareData(advertisement.getCar().getYear() == year || year == -1);
            counter += compareData(advertisement.getPrice() <= price || price == -1);
            counter += compareData(advertisement.getLocation().equals(location) || location.equals(""));

            if (counter == COMPARES_TARGET) {
                newList.add(advertisement);
            }

            counter = 0;
        }

        return newList;
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

    private int compareData(boolean expression) {
        return expression ? 1 : 0;
    }

    private int inputIntFilterField(String request) {
        String question = "Поле '" + request + "'(1 - ввести, 0 - пропустить): ";

        if (Extensions.inputBoolField(question)) {
            return Extensions.inputIntField(request + ": ");
        } else {
            return -1;
        }
    }

    private String inputStringFilterField(String request) {
        String question = "Поле '" + request + "'(1 - ввести, 0 - пропустить): ";

        if (Extensions.inputBoolField(question)) {
            System.out.print(request + ": ");
            return Extensions.scanner().nextLine();
        }

        return "";
    }
}
