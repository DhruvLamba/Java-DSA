public class shortestpath {
  public static void Short(
      String s) {
    int x = 0, y = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'N') {
        y = y + 1;
      } else if (s.charAt(i) == 'S') {
        y = y - 1;
      } else if (s.charAt(i) == 'E') {
        x = x + 1;
      } else {
        x = x - 1;
      }
    }
    double x1 = x * x;
    double y1 = y * y;
    double square = Math.sqrt(x1 + y1);
    System.out.println(square);

  }

  public static void main(String[] args) {
    String s = "WNEENESENNN";
    Short(s);

  }

}
