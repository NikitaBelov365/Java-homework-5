
public class MergeSort {

    public void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 6, 3, 1, 4 };

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
