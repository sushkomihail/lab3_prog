import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void VirtualVoidTest(){
        Car car = new Car("dodge");
        System.out.println(car.toString());
        System.out.println("-------------------------");
        car = new Truck("peterbilt");
        System.out.println(car.toString());
    }

    private static void AbstractClassTest(){
        System.out.println("Абстрактный класс:");
        BaseSearchData bs = new BaseSearchData();
        bs.create();
        System.out.println(bs.toString());

        ExtensiveSearchData es = new ExtensiveSearchData();
        es.create();
        System.out.println(es.toString());
    }

    private static void CloneTest(){
        System.out.println("Мелкое клонирование:");
        User user = new User("mihail");
        System.out.println("user:");
        System.out.println(user.toString());
        User user1 = user.clone();
        System.out.println("user1:");
        System.out.println(user1.toString());

        System.out.println("Глубокое клонирование:");
        Advertisement advertisement = new Advertisement(new Car("ford"));
        System.out.println("advertisement:");
        System.out.println(advertisement.toString());
        Advertisement advertisement1 = advertisement.clone();
        System.out.println("advertisement1:");
        System.out.println(advertisement1.toString());
    }

    public static void main(String[] args) throws Exception {
        //VirtualVoidTest();
        //AbstractClassTest();
        CloneTest();
    }
}