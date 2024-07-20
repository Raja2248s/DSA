
public class Main {
  public static void main(String[] args) {
    // Input String
    String s1 = "Gaurav";

    // converting string to array
    char[] s = s1.toCharArray();

    // function call
    reverse(0, s);

    // output string array to string
    String s2 = new String(s);
    System.out.println(s2);
  }

  static void reverse(int i, char[] s) {
    // i= first index , j=last index

    // Base case
    if (i > s.length - i - 1) {
      return;
    }
    // swap the values in index i and j
    swap(i, s);

    // increse the front value and decresase the tail value
    i++;

    // recursive call
    reverse(i, s);
  }

  static void swap(int i, char[] s) {
    // swapping using temporrary variable
    char temp = s[i];
    s[i] = s[s.length - i - 1];
    s[s.length - i - 1] = temp;
  }

}