
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reader {
    private String filePath;

    public Reader(String filePath){
        this.filePath = filePath;
    }

    public List<Ereigniss> readFromFile(){
        List<Ereigniss> ereignisse = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = br.readLine()) != null) {
                // Split the line by the delimiters (comma, #, or &)
                String[] values = line.split("\t");

                if (values.length >= 5){
                    Ereigniss ereigniss = new Ereigniss();
                    ereigniss.setID(Integer.parseInt(values[0].trim()));
                    ereigniss.setName(values[1].trim());
                    ereigniss.setHaus(Haus.valueOf(values[2].trim()));
                    ereigniss.setEreigniss(values[3].trim());
                    ereigniss.setDatum(LocalDate.parse(values[4].trim()));

                    ereignisse.add(ereigniss);
                }

                System.out.println(); // New line after each processed line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ereignisse;
    }
}
