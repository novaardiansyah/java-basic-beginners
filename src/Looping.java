public class Looping {
  public static void main(String[] args) {
    // ? for
    for (int i = 1; i <= 5; i++) {
      System.out.println("for: " + i);
    }

    // ? while
    int i = 1;
    while (i <= 5) {
      System.out.println("while: " + i);
      i++;
    }

    // ? do while
    int j = 1;
    do {
      System.out.println("do while: " + j);
      j++;
    } while (j <= 5);
  }
}
