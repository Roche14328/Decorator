package decorator_packages;

public class Main {
    public static void main(String[] args) {
        String filePath = "E:\\SDUST\\3rd year\\2nd Semester\\Soft Design &Arch\\Exp\\Decorator Practice\\Data.txt";
        DataSource dataSource = new FileDataSource(filePath);
        dataSource = new CompressionDecorator(dataSource);
        dataSource = new EncryptionDecorator(dataSource);

        String data = "This is some data to write";
        dataSource.writeData(data);
        String readData = dataSource.readData();

        System.out.println("Read data: " + readData);
    }
}