import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void StaticField() {
        Advertisement[] advs = {
                new Advertisement(new Car("toyota")),
                new Advertisement(new Car("nissan")),
                new Advertisement(new Car("subaru"))
        };

        System.out.println("----- Пример работы со статическим полем -----");
        for (Advertisement adv : advs) {
            System.out.println("Объявление(" + adv.getCar().getBrand() + "); id - " + adv.getId());
        }
    }

    private static void StaticVoid() {
        System.out.println("----- Пример работы со статическим методом -----");
        System.out.println("Количество объявлений - " + Advertisement.getCount());
    }

    public static void main(String[] args) {
        StaticField();
        StaticVoid();
    }
}