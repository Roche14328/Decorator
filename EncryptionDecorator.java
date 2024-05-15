package decorator_packages;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        // Additional encryption logic
        System.out.println("Encrypting data: " + data);
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // Additional decryption logic
        return "Decrypted data: " + wrappee.readData();
    }
}