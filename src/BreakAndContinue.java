public class BreakAndContinue {
  public static void main(String[] args) {
    // ? break
    int i = 0;
    while (true) {
      System.out.println(i);
      i++;

      if (i >= 5) {
        break;
      }
    }

    // ? continue
    for (int j = 0; j <= 20; j++) {
      if (j % 2 == 0) {
        continue;
      }
      System.out.println(j + " is odd");
    }
  }
}