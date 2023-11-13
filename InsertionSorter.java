import java.util.ArrayList;
/* ENSF 614 - Lab 6 Exercise B and C
 * Brandon Lac, November 2023
 * 
 * 
 */

public class InsertionSorter<E extends Number & Comparable<E>> extends Sorter<E>{
	public void sort(ArrayList<Item<E>> arr) {
	    int i, j;
	    for (i = 1; i < arr.size(); i++) {
	        Item<E> tmp = arr.get(i);
	        j = i;
	        while ((j > 0) && (arr.get(j - 1).getItem().compareTo(tmp.getItem()) > 0)) {
	            arr.set(j, arr.get(j - 1));
	            j--;
	        }
	        arr.set(j, tmp);
	    }
}
}
