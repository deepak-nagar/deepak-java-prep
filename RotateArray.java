public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        // {4, 1, 2, 3}
        int[] rotated = new int[arr.length];
        int last = arr[arr.length - 1];
        rotated[0] = last;
        for (int i = 0; i < arr.length - 1; i++) {

            rotated[i + 1] = arr[i];

        }
        for (int i = 0; i < rotated.length; i++) {

            System.out.print(rotated[i] + " ");

        }
    }
}
