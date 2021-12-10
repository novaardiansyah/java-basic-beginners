public class DataType {
  public static void main(String[] args) {
    // ! type data number
    // int, long, short, byte, float, double
    int age = 20;
    var age1 = 20;

    // ! type data string
    // String
    String name = "John Doe";
    var name1 = "John Doe";

    System.out.println("Fullname: " + name + " Age: " + age);
    System.out.println("Fullname: " + name1 + " Age: " + age1);

    // primitive vs non-primitive
    // primitive: int, long, short, byte, float, double
    // non-primitive: Integer, Long, Short, Byte, Float, Double

    int number = 10;
    short number3 = (short) number;
    System.out.println(number3);
  }
}
