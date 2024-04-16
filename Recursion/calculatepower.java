// 2 to the power 32 can be solved as 2 to the power 16 * 2 to the power 16;
// further 2 to the power 16 = 2 to the power 8 * 2 to the power 8;
// and so on...
//   the problem is if the power(b) is odd  then while dtaking b/2 it will be //floor value therefore at last multiply a value

public class Main {
  public static void main(String[] args) {
    int a = 3;
    int b = 9;
    if (b % 2 == 0) {
      int k = power(a, b);
      System.out.println(k);
    } else {
      int k = power(a, b - 1);
      System.out.println(a * k);
    }

  }

  public static int power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if (b == 1) {
      return a;
    } else {
      return power(a, b / 2) * power(a, b / 2);
    }

  }

}
