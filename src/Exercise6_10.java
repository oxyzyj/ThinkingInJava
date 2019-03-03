import java.util.Arrays;
import java.util.HashSet;

public class Exercise6_10 {

  public static void main(String[] args) {
    HashSet<Integer> result = new HashSet<>();
    for (int x = 10; x <= 99; x++) {
      for (int y = 10; y <= x; y++) {
        int z = x * y;
        char a[] = Integer.toString(z).toCharArray();
        char b[] = (Integer.toString(x) + Integer.toString(y)).toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
          result.add(z);
      }
    }
    for (int i : result)
      System.out.println(i);
  }
}
