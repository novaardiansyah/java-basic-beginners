public class Arguments {
  public static void main(String[] args) {
    System.out.println("");

    sayName("John", "Doe");
    sayName("Leo", "Tolstoy");

    System.out.println(sum(20, 30));
  }

  static void sayName(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
  }

  // ? return value
  static Integer sum(Integer a, Integer b) {
    return a + b;
  }
}
