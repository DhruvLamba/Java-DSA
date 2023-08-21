
public class toupper {
  public static String upper(String str) {
    StringBuilder sb = new StringBuilder("");
    sb = sb.append(Character.toUpperCase(str.charAt(0)));
    for (int i = 1; i < str.length(); i++) {
      if (i < str.length() - 1 && str.charAt(i) == ' ') {
        sb.append(str.charAt(i));
        i++;
        sb = sb.append(Character.toUpperCase(str.charAt(i)));
      } else if (str.charAt(i) == ',' && str.charAt(i + 1) != ' ') {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }

    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "iam,dhruv lamba";
    System.out.println(upper(str));
  }
}
