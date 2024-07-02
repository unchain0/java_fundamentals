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

    // if - else
    if (typeInt == 10) {
      System.out.println("Entrou no if");
    } else if (typeInt == 12) {
      System.out.println("Entrou no else if");
    } else {
      System.out.println("Entrou no else");
    }
  }
}
// Fora do escopo da classe
