package module_6;

public class NegativeBeforePositive {
    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -7, 1, -4};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Array after partition:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}