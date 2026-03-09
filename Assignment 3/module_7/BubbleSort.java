package module_7;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){  // 1 to n-1 => <n
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {17,12,5,20,21,5,15};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);

    }
}