public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("C:\\Proiecte\\Proiecte faculta\\Anul_2\\MAP\\Practic\\EminoviciRobert721Aufgabe1\\src\\evenimente.tsv");
        reader.readFromFile().forEach(ereigniss -> System.out.println(ereigniss.toString()));
    }
}