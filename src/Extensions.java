import java.util.List;
import java.util.Scanner;

public class Extensions {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static boolean isNumber(String string) {
        for (char symbol : string.toCharArray()) {
            if (symbol < '0' || symbol > '9') {
                return false;
            }
        }

        return true;
    }

    public static int inputIntField(String request) {
        String value;

        do {
            System.out.print(request);
            value = scanner().next();
        } while (!isNumber(value));

        return Integer.parseInt(value);
    }

    public static boolean inputBoolField(String question) {
        int command;

        do {
            command = inputIntField(question);
        } while (command != 0 && command != 1);

        return command == 1;
    }

    public static boolean enterToSystem(List<User> users, User user) {
        User enteredUser = new User();

        System.out.println("----- Вход в сервис -----");

        enteredUser.inputLogin();
        enteredUser.inputPassword();

        for (User createdUser : users) {
            if (createdUser.getLogin().equals(enteredUser.getLogin()) &&
                    createdUser.getPassword().equals(enteredUser.getPassword())) {
                user = createdUser;
                return true;
            }
        }

        return false;
    }

    public static void printAdvertisements(List<Advertisement> advertisements) throws Exception {
        if (advertisements.size() == 0) {
            System.out.println("Объявлений нет!");
        }

        for (Advertisement advertisement : advertisements) {
            System.out.println(advertisement.toString());
        }
    }
}
