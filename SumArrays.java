public class SumArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        // Output: 10 (1 + 2 + 3 + 4).
        int sum = 0;

        StringBuilder breakdown = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            breakdown.append(arr[i]);
            if (i < arr.length - 1) {
                breakdown.append("+");
            }

        }

        System.out.println(sum + "(" + breakdown.toString() + ")");
    }
}
