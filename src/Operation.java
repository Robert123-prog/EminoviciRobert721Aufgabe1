import java.util.*;
import java.util.stream.Collectors;

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

    public List<String[]> sortByNumIOfErignisse(){
        Map<String, Integer> ereignisseNummer = new HashMap<>();

        for (Ereigniss ereigniss: ereignissList){
            ereignisseNummer.put(String.valueOf(ereigniss.getHaus()), ereignisseNummer.getOrDefault(ereigniss.getHaus(), 0) + 1);
        }

        return ereignisseNummer.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(entry -> new String[]{entry.getKey(), String.valueOf(entry.getValue())})
                .collect(Collectors.toList());
    }
}
