public class ExtensiveSearchData extends SearchData{
    private int mileage;

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
}
