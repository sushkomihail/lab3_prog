import java.io.*;

public class SaveSystem<T> {
    private final String dataFile;

    public SaveSystem(String dataFile) {
        this.dataFile = dataFile;
    }

    public void Save(T data) throws IOException {
        FileOutputStream file = new FileOutputStream(dataFile);
        ObjectOutputStream oos = new ObjectOutputStream(file);
        oos.writeObject(data);
        oos.close();
        file.close();
    }

    public T Load() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(dataFile);
        ObjectInputStream ois = new ObjectInputStream(file);
        T object = (T) ois.readObject();
        ois.close();
        file.close();
        return object;
    }
}
