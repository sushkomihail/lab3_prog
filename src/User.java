import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable, Serializable {
    private String login;
    private String password;
    private String phoneNumber;
    List<Advertisement> favourites = new ArrayList<>();

    public User(String login, String password, String phoneNumber) {
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String login) {
        this.login = login;
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Advertisement> getFavourites() {
        return favourites;
    }

    public void inputLogin() {
        System.out.print("Введите логин: ");
        login = Extensions.scanner().next();
    }

    public void inputPassword() {
        System.out.print("Введите пароль: ");
        password = Extensions.scanner().next();
    }

    public void inputPhoneNumber() {
        do {
            System.out.print("Введите номер телефона: ");
            phoneNumber = Extensions.scanner().next();
        } while (!Extensions.isNumber(phoneNumber));
    }

    public void create(List<User> userList) {
        System.out.print("----- Регистрация -----\n\n");

        inputLogin();
        inputPassword();
        inputPhoneNumber();

        userList.add(this);
    }

    public void addToFavourites(Advertisement advertisement) {
        favourites.add(advertisement);
        System.out.println("Объявление (id = " + advertisement.getId() + ") добавлено в избранное!");
    }

    @Override
    public String toString() {
        return "----- Данные пользователя -----\n" +
                "Логин: " + login + "\n" +
                "Номер телефона: " + phoneNumber + "\n" +
                "Избранные объявления:";
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
