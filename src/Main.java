import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void VirtualVoidTest(){
        Car car = new Car("dodge");
        System.out.println(car.toString());
        System.out.println("-------------------------");
        car = new Truck("peterbilt");
    }

    public static void main(String[] args) throws Exception {
        User user = new User("mihail", "12345m", "89006453785");
        SaveSystem<User> saveSystem = new SaveSystem<>("data.txt");
        //saveSystem.Save(user);
        System.out.println(saveSystem.Load().getLogin());
    }
}