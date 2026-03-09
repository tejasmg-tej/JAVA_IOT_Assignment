package module_6;

public class EvenIndexEvenNumber {
    public static void main(String[] args) {

        int[] arr = {3, 6, 12, 1, 5, 8};

        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < arr.length && oddIndex < arr.length) {

            if (arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            else if (arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }
            else {
                // swap
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }

        System.out.println("Rearranged array:");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}