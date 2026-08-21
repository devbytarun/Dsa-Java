public class SwapFirstLast {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int first = 0;
        int last = arr.length - 1;

        if (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
