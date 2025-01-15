import java.time.LocalDate;
import java.util.Date;

public class Ereigniss {
    private Integer ID;
    private String name;
    private Haus haus;
    private String ereigniss;
    private LocalDate datum;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Haus getHaus() {
        return haus;
    }

    public void setHaus(Haus haus) {
        this.haus = haus;
    }

    public String getEreigniss() {
        return ereigniss;
    }

    public void setEreigniss(String ereigniss) {
        this.ereigniss = ereigniss;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Ereigniss{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", haus=" + haus +
                ", ereigniss='" + ereigniss + '\'' +
                ", datum=" + datum +
                '}';
    }

}
