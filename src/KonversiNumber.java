public class KonversiNumber {
  public static void main(String[] args) {
    // byte, short, int, long, float, double, char, boolean

    int balance = 1_000_000;
    long balance2 = 1_000_000;
    System.out.println(balance + balance2);

    // manual konversi angka
    int balance3 = 100;
    short balance4 = (short) balance3;
    System.out.println(balance3 + balance4);
  }
}
