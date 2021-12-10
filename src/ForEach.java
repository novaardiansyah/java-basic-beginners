public class ForEach {
  public static void main(String[] args) {
    String[] names = { "John", "Paul", "George", "Ringo" };

    // ? use for
    System.out.println("\nUsing for");
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // ? use foreach
    System.out.println("\nUsing foreach");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
