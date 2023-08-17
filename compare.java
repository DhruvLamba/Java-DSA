public class compare {
  public static boolean comparestring(String s, String s1) {
    if (s.equals(s1)) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {
    String s = "Dhruv";
    String s1 = "dhruv";
    System.out.println(comparestring(s, s1));

  }

}
