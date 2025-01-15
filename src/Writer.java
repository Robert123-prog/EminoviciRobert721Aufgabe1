import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    private String filePath;

    public Writer(String filePath){
        this.filePath = filePath;
    }

    public void writeToFile(List<String[]> data){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row: data){
                String line = String.join("\t", row);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
