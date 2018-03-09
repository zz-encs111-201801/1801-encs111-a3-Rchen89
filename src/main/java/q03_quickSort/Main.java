package q03_quickSort;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    public void run(){
        Solution solution = new Solution();
        int[] arr = {23,412,123,5,241,63,121,66,85,90};



        solution.quickSort(arr);
    }
}
