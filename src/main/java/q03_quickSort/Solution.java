package q03_quickSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public void quickSort(int[] arr) {

        if (arr == null || arr.length == 0){
            return;
        }
        int len = arr.length;
        sort(0,len - 1, arr);
    }

    private void sort(int lowerIndex, int higherIndex, int[] inputArr){
        if (inputArr == null || inputArr.length == 0){
            return;
        }
        int x = inputArr[higherIndex];
        int i = lowerIndex - 1;

        for (int j = lowerIndex; j < inputArr.length; j++){
            if (inputArr[j] <= x){
                i = i + 1;
                exchangeNumbers(i,j,inputArr);
            }
        }

        System.out.println(Arrays.toString(inputArr));
    }

    private void exchangeNumbers(int i, int j, int[] inputArr){
        int temp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = temp;
    }
}
