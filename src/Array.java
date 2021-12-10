public class Array {
  public static void main(String[] args) {
    int[] testArray = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(testArray[0]);

    int[] testArray2 = { 1, 2, 3, 4, 5 };
    System.out.println(testArray2[2]);

    String[][] members = {
        { "John", "Smith" },
        { "Jane", "Doe" },
        { "Jack", "Lane" }
    };

    System.out.println("Array Length: " + members.length);
    System.out.println("The Second Member: " + members[0][1]);
  }
}
