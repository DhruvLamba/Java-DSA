public class Maxsum2 {
  public static void max2(int num[]) {
    int maxsum = Integer.MIN_VALUE;
    int largest = 0;
    int prefix[] = new int[num.length];
    prefix[0] = num[0];
    for (int i = 1; i < num.length; i++) {
      prefix[i] = prefix[i - 1] + num[i];
    }
    for (int i = 0; i < num.length; i++) {
      for (int j = i; j < num.length; j++) {

        largest = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (maxsum < largest) {
          maxsum = largest;
        }

      }
    }
    System.out.println(maxsum);

  }

  public static void main(String[] args) {
    int num[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    max2(num);
  }

}
