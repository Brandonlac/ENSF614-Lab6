import java.util.ArrayList;
/* ENSF 614 - Lab 6 Exercise B and C
 * Brandon Lac, November 2023
 * 
 * 
 */

public class SelectionSorter<E extends Number & Comparable<E>> extends Sorter<E> {
	public void sort(ArrayList<Item<E>> arr) {
		int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j).getItem().compareTo(arr.get(minIndex).getItem()) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            Item<E> temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
	}
}
}
