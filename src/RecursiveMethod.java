public class RecursiveMethod {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println(factorial(5));

    System.out.println(factorialRecursion(5));
  }

  // ? using normal method
  static int factorial(int value) {
    int result = 1;

    for (int i = 1; i <= value; i++) {
      result *= i;
    }

    return result;
  }

  // ? using recursion
  static int factorialRecursion(int value) {
    if (value == 1) {
      return 1;
    }

    return value * factorialRecursion(value - 1);
  }
}
