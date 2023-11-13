
import java.util.ArrayList;
/* ENSF 614 - Lab 6 Exercise B and C
 * Brandon Lac, November 2023
 * 
 * 
 */
public class MyVector<E extends Number & Comparable<E>> {
	private ArrayList<Item<E>> storageM;
	private Sorter<E> sorter;
	public MyVector(int i) {
		storageM = new ArrayList<Item<E>>(i);
	}
	public MyVector(ArrayList<Item <E>> arr) {
		storageM = new ArrayList<Item<E>>(arr.size()-1);
		for (Item<E> item : arr) {
			storageM.add(item);
		}
	}
	public void add(Item<E> value) {
		storageM.add(value);
	}
	public void setSortStrategy(Sorter<E> s) {
		sorter = s;
	}
	public void performSort() {
		sorter.sort(storageM);
	}
	
	public void display() {
		for(int i = 0; i < storageM.size(); i++) {
			System.out.print(storageM.get(i).getItem()+ " ");
		}
	}
}
