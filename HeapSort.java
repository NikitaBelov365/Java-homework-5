import java.util.Collections;
import java.util.LinkedList;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = { 4, 1, 24, 9, 42, 3 };
        LinkedList<Integer> my_arr = new LinkedList<>();
        LinkedList<Integer> sorted_arr = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            my_arr.add(arr[i]);
        }
        while (my_arr.size() > 0) {
            int position = 0;
            int maxim = my_arr.get(0);

            for (int i = 0; i < my_arr.size(); i++) {
                if (my_arr.get(i) > maxim) {
                    maxim = my_arr.get(i);
                    position = i;
                }
            }

            Collections.swap(my_arr, position, my_arr.size() - 1);
            my_arr.removeLast();
            sorted_arr.addFirst(maxim);
        }
        System.out.println(sorted_arr.toString());
    }
}
