package module_7;
import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr,int s,int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i <= e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        //place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr,pivotIndex,s);
        //let's manage the left and right side of the pivot
        int i=s, j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){  // if left side is smaller - move to next
                i++;
            }
            while(arr[j]>pivot){  //if the right side greater - move to next
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s,int e){
        //
        if(s>=e){
            return;
        }
        int p= partitionIndex(arr,s,e);
        quickSort(arr,s,p-1);
        //right part
        quickSort(arr,p+1,e);

    }

    public static void main(String[] args) {
        int[] arr = {5,3,7,2,1,4};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
