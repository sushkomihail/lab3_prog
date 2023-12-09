import java.util.*;

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

    private static void SortTest(List<Car> list) {
        System.out.println("Сортировка по пробегу");
        list.sort(Comparator.comparing(Car::getMileage));

        for (Car car : list) {
            System.out.println(car);
        }
    }

    private static void FindTest(List<Car> list) {
        System.out.println("Поиск 'dodge'");

        for (Car car : list) {
            System.out.println(car);
        }


        Car car = list.stream().filter(c -> Objects.equals(c.getBrand(), "dodge")).findAny().orElse(null);
        if (car == null) {
            System.out.println("Не найдено!");
            return;
        }

        System.out.println("****** Найдено! индекс: " + list.indexOf(car));
    }

    public static void main(String[] args) throws Exception {
        //VirtualVoidTest();
        //AbstractClassTest();
        //CloneTest();

        Car[] arr = {
                new Car("toyota", 1, 1, "m", 1),
                new Truck("peterbilt", 1, 1, "a", 3, 1),
                new Car("dodge", 1, 1, "a", 2)
        };
        List<Car> list = Arrays.asList(arr);
        SortTest(list);
        System.out.println("---------------------");
        FindTest(list);
    }
}