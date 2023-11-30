import java.util.List;
import java.util.Objects;

public class Advertisement implements Cloneable {
    private static int id;
    private int currentId;
    private Car car;
    private Report report;
    private String location;
    private int price;
    private User seller;

    public Advertisement(Car car, Report report, String location, int price, User seller) {
        assignId();
        this.car = car;
        this.report = report;
        this.location = location;
        this.price = price;
        this.seller = seller;
    }

    public Advertisement(Car car) {
        assignId();
        this.car = car;
        this.report = new Report();
        this.seller = new User();
    }

    public Advertisement() {
        assignId();
        this.car = new Car();
        this.report = new Report();
        this.seller = new User();
    }

    public int getId() {
        return currentId;
    }

    public Car getCar() {
        return car;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public User getSeller() {
        return seller;
    }

    public static int getCount(){
        return id;
    }

    public void create(User user, List<Advertisement> advertisements) {
        car = new Car();
        report = new Report();

        car.create();
        report.create();

        System.out.print("Местоположение: ");
        location = Extensions.scanner().nextLine();
        price = Extensions.inputIntField("Цена: ");

        seller = user;

        advertisements.add(this);
    }

    public void delete(User user, List<Advertisement> advertisements) {
        if (!Objects.equals(seller.getLogin(), user.getLogin()) || !Objects.equals(seller.getPassword(), user.getPassword())) {
            System.out.println("Данное объявление Вам не принадлежит, Вы не можете его удалить!");
            return;
        }

        for (int i = 0; i < advertisements.size(); i++) {
            if (advertisements.get(i).getId() == currentId) {
                advertisements.remove(i);
                System.out.println("Объявление успешно удалено!");
                return;
            }
        }

        System.out.println("Данного объявления нет в списке!");
    }

    @Override
    public String toString(){
        return "---------- Объявление (" + location + ") ----------\n\n" +
                car.toString() + "\n" +
                report.toString() + "\n" +
                "Цена: " + price + "\n\n" +
                "Телефон продавца: " + seller.getPhoneNumber();
    }

    private void assignId() {
        currentId = id++;
    }

    @Override
    public Advertisement clone() {
        try {
            Advertisement newAdvertisement = (Advertisement) super.clone();
            Car newCar = car.clone();
            Report newReport = report.clone();
            User newSeller = seller.clone();
            newAdvertisement.car = newCar;
            newAdvertisement.report = newReport;
            newAdvertisement.seller = newSeller;
            return newAdvertisement;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
