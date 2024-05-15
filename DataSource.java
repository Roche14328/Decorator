package decorator_packages;

public interface DataSource {
    void writeData(String data);
    String readData();
}