import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void staticField() {
        Advertisement[] advs = {
                new Advertisement(new Car("toyota")),
                new Advertisement(new Car("nissan")),
                new Advertisement(new Car("subaru"))
        };

        System.out.println("----- Одномерный массив -----");
        for (Advertisement adv : advs) {
            System.out.println("Объявление(" + adv.getCar().getBrand() + "); id - " + adv.getId());
        }
    }

    private static void staticVoid() {
        System.out.println("----- Пример работы со статическим методом -----");
        System.out.println("Количество объявлений - " + Advertisement.getCount());
    }

    private static void function(SupportiveClass c) {
        System.out.println("Функция вызвана...");
        c.value = 5;
    }

    private static void twoDimensionalArray(){
        Car[][] cars = {
                { new Car("toyota"), new Car("mazda") },
                { new Car("nissan"), new Car("honda") }
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(cars[i][j].getBrand() + "\t");
            }
            System.out.println();
        }

        System.out.print("\nЭлеметы главной диагонали: ");

        for (int i = 0; i < 2; i++) {
            System.out.print(cars[i][i].getBrand() + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
//        System.out.println("Try-catch:");
//        User user = new User("mihail", "12345", "90394534");
//        user.printData();
//        System.out.println();
//        user.addToFavourites(new Advertisement(new Car("honda")));
//        System.out.println();
//        user.printData();

        staticField();

        System.out.println("\n----- Двумерный массив -----");
        twoDimensionalArray();
    }
}