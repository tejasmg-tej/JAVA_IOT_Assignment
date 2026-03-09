package module_6;

public class Kadane {
    static int kadane(int[] arr){
        int cmax=arr[0];
        int gmax = arr[0];
        for(int i=1;i< arr.length;i++){
            cmax = Math.max(arr[i],(cmax+arr[i]));
            gmax = Math.max(cmax,gmax);
        }
        return gmax;
    }

    public static void main(String[] args) {
        int[] arr={5,-8,1,2,-1,4};
        System.out.println(kadane(arr));
        int[] array ={-1,-2,-3,-4,-5,-6,0};
        System.out.println(kadane(array));
    }
}
