public class TernaryOperator {
  public static void main(String[] args) {
    Integer score = 75;

    // ? use if statement
    if (score > 75) {
      System.out.println("Congratulations you passed");
    } else {
      System.out.println("you didn't pass");
    }

    // ? use ternary operator
    String result = score > 75 ? "Congratulations you passed" : "you didn't pass";
    System.out.println(result);
  }
}
