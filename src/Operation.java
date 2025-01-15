import java.util.Comparator;
import java.util.List;

public class Operation {
    private List<Ereigniss> ereignissList;

    public Operation(List<Ereigniss> ereignissList) {
        this.ereignissList = ereignissList;
    }

    public List<String> filterByName(Character initial){
        return ereignissList.stream()
                .filter(ereigniss -> ereigniss.getName().charAt(0) == initial)
                .map(ereigniss -> ereigniss.getName())
                .toList();
    }

    public List<String> sortByDate(){
        return ereignissList.stream()
                .sorted(Comparator.comparing(Ereigniss::getDatum))
                .map(ereigniss -> new String(ereigniss.getDatum() + " : " + ereigniss.getName() + " - " + ereigniss.getEreigniss()))
                .toList();
    }
}
