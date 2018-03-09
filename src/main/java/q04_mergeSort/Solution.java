package q04_mergeSort;

import java.util.Arrays;

public class Solution {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }
        mergeSortFunction(arr,0,3,arr.length-1);


    }

    public void mergeSortFunction(int[] arr, int p, int q, int r){

        System.out.println("original Array: " + Arrays.toString(arr));

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i = 0; i < n1; i++){
            L[i] = arr[p + i];
        }

        for (int j = 0; j < n2; j++){
            R[j] = arr[q + 1 + j];
        }

        System.out.println("L: " + Arrays.toString(L));
        System.out.println("R: " + Arrays.toString(R));
        System.out.println("n1: " + Integer.toString(n1));
        System.out.println("n2: " + Integer.toString(n2));


        int i = 0, j = 0;
        int k = 0;

        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
                System.out.println("i: " + i);
            }else{
                arr[k] = R[j];
                j++;
                System.out.println("j: " + j);
            }
            k++;
            System.out.println("k: " + k);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
