/*
 * HelloWorld = Nome da minha classe
 * public = Modificador de acesso
 * class = Tipo da classe
 */
public class Main {

  // O código deverá ser inserido aqui dentro
  public static void main(String[] args) {
    /*
     * Valores (int, float, double, long)
     * Texto (String)
     * Booleanos (boolean)
     */
    int typeInt = 10;
    double typeDouble = 3.14;
    float typeFloat = 3.14f;
    long typeLong = 94823989102932308L;
    String typeString = "Colocar o meu texto";
    boolean typeBoolean = true;

    // While (Enquanto algo for verdadeiro, faça alguma coisa)
    int count = 0;
    while (count < 3) {
      System.out.println("Contador: " + count);
      count++;
    }
    System.out.println("Saiu do while");

    // For
    for (int i = 0; i < 4; i++) {
      System.out.println("Contador: " + i);
    }
    System.out.println("Saiu do for");
  }
}
// Fora do escopo da classe
