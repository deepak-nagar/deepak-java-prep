public class CheckDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };
        boolean checkduplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // i ke aage se compare
                if (arr[i] == arr[j]) { // Agar same value mil gayi
                    checkduplicate = true;
                    break;
                }
            }
            if (checkduplicate)
                break; // Jaldi exit
        }

        System.out.println(checkduplicate);
    }
}