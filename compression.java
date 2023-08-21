public class compression {
  public static String comp(String str) {
    String Str = " ";

    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      Str += str.charAt(i);
      if (count > 1) {
        Str += count.toString();
      }
    }
    return Str;

  }

  public static void main(String[] args) {
    String str = "aaaabbbbccc";
    System.out.println(comp(str));
  }
}