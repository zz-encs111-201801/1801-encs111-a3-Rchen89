package q04_mergeSort;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }


    public void run(){
        Solution solution = new Solution();
        int[] arr = {231,142,153,1231,64,132};

        solution.mergeSort(arr);

    }
}
