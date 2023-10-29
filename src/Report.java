public class Report {
    private int crashesCount;
    private boolean isListedAsWanted;
    private boolean areDocumentsInOrder;
    private boolean isRegistered;

    public Report(int crashesCount, boolean isListedAsWanted, boolean areDocumentsInOrder, boolean isRegistered) {
        this.crashesCount = crashesCount;
        this.isListedAsWanted = isListedAsWanted;
        this.areDocumentsInOrder = areDocumentsInOrder;
        this.isRegistered = isRegistered;
    }

    public Report(int crashesCount) {
        this.crashesCount = crashesCount;
    }

    public Report() {

    }

    public void create() {
        crashesCount = Extensions.inputIntField("Количество аварий: ");
        isListedAsWanted = Extensions.inputBoolField("Находится в розыске?(1-да, 0-нет): ");
        areDocumentsInOrder = Extensions.inputBoolField("Документы в порядке?(1-да, 0-нет): ");
        isRegistered = Extensions.inputBoolField("Зарегистрирована?(1-да, 0-нет): ");
    }

    public void printData() {
        System.out.println("<<< Отчет по автомобилю >>>");
        System.out.println("Количество аварий: " + crashesCount);
        String wanted = isListedAsWanted ? "Находится в розыске" : "Не находится в розыске";
        System.out.println(wanted);
        String documents = areDocumentsInOrder ? "Документы в порядке" : "Документы не в порядке";
        System.out.println(documents);
        String registration = isRegistered ? "Зарегистрирована" : "Не зарегистрирована";
        System.out.println(registration);
    }
}
