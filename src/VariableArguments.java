public class VariableArguments {
  public static void main(String[] args) {
    System.out.println("");

    int[] values = { 80, 90, 100, 75, 60 };
    sayCongrast("Nova Ardiansyah", values);

    sayFriends("Nova", "Ardiansyah", "Rizki");
  }

  // ? Using Array
  static void sayCongrast(String fullName, int[] numbers) {
    int total = 0;

    for (int number : numbers) {
      total += number;
    }

    int average = total / numbers.length;

    if (average >= 75) {
      System.out.println("Congratulation " + fullName + "!");
    } else {
      System.out.println("Sorry " + fullName + "!");
    }

    System.out.println("Your average is " + average);
  }

  // ? Variable Arguments
  static void sayFriends(String... friends) {
    for (String friend : friends) {
      System.out.println("Hello " + friend + "!");
    }
  }
}
