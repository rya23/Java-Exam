import java.util.Arrays;

public class Sixteen {

    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        for (i = 0; i < k; i++) {
            array[low + i] = temp[i];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = { 5, 2, 9, -1, 5, 53, 1, 5, 6 };
        int low = 0, high = array.length - 1;
        int mid = (low + high) / 2;
        Thread leftThread = new Thread(new Runnable() {
            @Override
            public void run() {
                mergeSort(array, low, mid);
            }
        });

        Thread rightThread = new Thread(new Runnable() {

            @Override
            public void run() {
                mergeSort(array, mid + 1, high);

            }
        });
        leftThread.start();
        rightThread.start();

        leftThread.join();
        rightThread.join();

        merge(array, low, mid, high);
        System.out.println(Arrays.toString(array));
    }

}
