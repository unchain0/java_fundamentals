import java.util.ArrayList;
import java.util.List;

public class DataStructure {

  public static void main(String[] args) {
    // Lista
    List<String> names = new ArrayList<>();
    names.add("Dani");
    names.add("Vini");
    names.add("Elias");

    names.forEach(System.out::println);
  }
}
