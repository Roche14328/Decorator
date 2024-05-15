package decorator_packages;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        // Additional compression logic
        System.out.println("Compressing data: " + data);
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // Additional decompression logic
        return "Decompressed data: " + wrappee.readData();
    }
}