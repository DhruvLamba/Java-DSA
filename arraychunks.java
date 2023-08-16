public class arraychunks {
  public static void chunk(int num[], int size) {

    int temp[] = new int[size];
    int k = 0; // for temp array
    for (int i = 0; i < num.length; i++) {
      temp[k] = num[i];
      k++;
      if (k == size) {
        for (int j = 0; j < temp.length; j++) {
          System.out.print(temp[j] + " ");
        }
        System.out.println();
        k = 0;
      }
    }
    if (k != 0) {
      for (int i = k; i < temp.length; i++) {
        temp[i] = 0;
      }
      for (int j = 0; j < temp.length; j++) {
        System.out.print(temp[j] + " ");
      }
    }
  }

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5 };
    int size = 2;
    chunk(num, size);

  }
}
