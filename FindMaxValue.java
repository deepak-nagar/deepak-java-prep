public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 1, 34, 5 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];

            }

        }
        System.out.println(max + " is big number");
    }
}
