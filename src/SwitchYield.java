public class SwitchYield {
  public static void main(String[] args) {
    String Mark = "A";
    String saying = switch (Mark) {
      case "A":
        yield "Excellent";
      case "B":
        yield "Good";
      case "C":
        yield "Pass";
      case "D":
        yield "Fail";
      default:
        yield "Invalid";
    };

    System.out.println("");
    System.out.println(saying);
  }
}
