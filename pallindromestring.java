import java.util.*;

public class pallindromestring {
  public static boolean pallindrome(String s) {
    int n = s.length();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(pallindrome(s));
  }

}
