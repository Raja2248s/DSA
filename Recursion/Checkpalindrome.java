
public class Checkpalindrome {
  public static void main(String[] args) {

    String a = "aabaa";
    boolean k = checkpalindrome(a, 0);
    if (k) {
      System.out.println("It is palindrome");
    } else {
      System.out.println("It is not palindrome");
    }
  }

  public static boolean checkpalindrome(String a, int i) {
    // i = starting index j=last index

    // Base case
    if (i > (a.length() - i - 1)) {
      return true;
    }
    // False case
    if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
      return false;
    } else {
      return checkpalindrome(a, i + 1);
    }
  }
}
