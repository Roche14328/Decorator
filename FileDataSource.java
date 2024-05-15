package decorator_packages;

import java.io.*;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data written to file: " + data);
        } catch (IOException e) {
            System.out.println("Error writing data to file: " + e.getMessage());
        }
    }

    @Override
    public String readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println("Data read from file: " + content.toString());
            return content.toString();
        } catch (IOException e) {
            System.out.println("Error reading data from file: " + e.getMessage());
        }
        return null;
    }
}