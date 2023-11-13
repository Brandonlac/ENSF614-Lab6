import java.util.ArrayList;
/* ENSF 614 - Lab 6 Exercise B and C
 * Brandon Lac, November 2023
 * 
 * 
 */

public class BubbleSorter<E extends Number & Comparable<E>> extends Sorter<E>{
	public void sort(ArrayList<Item<E>> arr) {
		int n = arr.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr.get(j).getItem().compareTo(arr.get(j + 1).getItem()) > 0) {
                    // Swap them if they are in the wrong order
                    Item<E> temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then the list is already sorted
            if (!swapped) {
                break;
	}
}
	}
}
