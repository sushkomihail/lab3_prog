public class Report implements AdvertisementPart, Cloneable {
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

    @Override
    public String toString(){
        String wanted = isListedAsWanted ? "Находится в розыске" : "Не находится в розыске";
        String documents = areDocumentsInOrder ? "Документы в порядке" : "Документы не в порядке";
        String registration = isRegistered ? "Зарегистрирована" : "Не зарегистрирована";

        return "<<< Отчет по автомобилю >>>\n" +
                "Количество аварий: " + crashesCount + "\n" +
                wanted + "\n" +
                documents + "\n" +
                registration;
    }

    @Override
    public Report clone() {
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
