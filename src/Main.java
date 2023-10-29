import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// ------------------------------Регистрация--------------------------------
//        List<User> users = new ArrayList<>();
//        User user = new User();
//        user.create(users);
//        user.printData();
// ------------------------------Вход в сервис------------------------------
//        List<User> users = new ArrayList<>();
//        users.add(new User("mihail", "12345m", "88889995555"));
//        User user = new User();
//        if (Extensions.enterToSystem(users, user)) {
//            System.out.println("Вход выполнен!");
//        } else {
//            System.out.println("Неверный логин или пароль!");
//        }
// ------------------------------Ввод данных автомобиля----------------------
//        Car car = new Car();
//        car.create();
//        car.printData();
// ------------------------------Ввод данных отчета--------------------------
//        Report report = new Report();
//        report.create();
//        report.printData();
// ------------------------------Ввод данных объявления----------------------
        User user = new User("mihail", "12345m", "88889995555");
        List<Advertisement> advertisements = new ArrayList<>();
        Advertisement adv = new Advertisement();
        adv.create(user, advertisements);
        adv.printData();
// ------------------------------Добавление объявления в избранное-----------
//        Advertisement adv = new Advertisement(new Car("mercedes"));
//        User user = new User("mihail", "12345m", "88889995555");
//        user.printData();
//        user.addToFavourites(adv);
//        user.printData();
// ------------------------------Удаление объявления-------------------------
//        User user = new User("mihail", "12345m", "88889995555");
//        List<Advertisement> advs = new ArrayList<>();
//        Advertisement adv1 = new Advertisement(new Car("bmw"));
//        Advertisement adv2 = new Advertisement(new Car("toyota"), new Report(), "", 0, user);
//        advs.add(adv1);
//        advs.add(adv2);
//        Extensions.printAdvertisements(advs);
//        adv2.delete(user, advs);
//        Extensions.printAdvertisements(advs);
// ------------------------------Применение фильтра к списку объявлений------
//        List<Advertisement> advs = new ArrayList<>();
//        Advertisement adv1 = new Advertisement(new Car("bmw"));
//        Advertisement adv2 = new Advertisement(new Car("toyota"), new Report(), "", 199999, new User());
//        advs.add(adv1);
//        advs.add(adv2);
//        SearchData sd = new SearchData("toyota", -1, 200000, "");
//        Extensions.printAdvertisements(advs);
//        sd.printData();
//        List<Advertisement> newAdvs = sd.sortAdvertisementList(advs);
//        Extensions.printAdvertisements(newAdvs);
    }
}