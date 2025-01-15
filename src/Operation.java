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
}
