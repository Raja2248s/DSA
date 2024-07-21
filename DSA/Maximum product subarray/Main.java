public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, -10, 7, -8, -2 };

        int max = arr[0];

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
                mul *= arr[j];
                max = Math.max(max, mul);
            }

        }
        System.out.print(max);

    }
}
