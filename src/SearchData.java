import java.util.ArrayList;
import java.util.List;

public abstract class SearchData {
    protected String brand;
    protected int year;
    protected int price;
    protected String location;
    protected int comparesTarget;

    public abstract void create();

    protected abstract int getComparesCount(Advertisement advertisement);

    public List<Advertisement> sortAdvertisementList(List<Advertisement> list) {
        List<Advertisement> newList = new ArrayList<>();

        for (Advertisement advertisement : list) {
            int counter = getComparesCount(advertisement);

            if (counter == comparesTarget) {
                newList.add(advertisement);
            }
        }

        return newList;
    }

    protected int compareData(boolean expression) {
        return expression ? 1 : 0;
    }

    protected int inputIntFilterField(String request) {
        String question = "Поле '" + request + "'(1 - ввести, 0 - пропустить): ";

        if (Extensions.inputBoolField(question)) {
            return Extensions.inputIntField(request + ": ");
        } else {
            return -1;
        }
    }

    protected String inputStringFilterField(String request) {
        String question = "Поле '" + request + "'(1 - ввести, 0 - пропустить): ";

        if (Extensions.inputBoolField(question)) {
            System.out.print(request + ": ");
            return Extensions.scanner().nextLine();
        }

        return "";
    }
}
