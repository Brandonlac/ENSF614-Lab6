/* ENSF 614 - Lab 6 Exercise C and D
 * M. Moussavi, November 2023
 * 
 * 
 */

class Item <E extends Number & Comparable<E> >{
	private E item;
	public Item(E value) {
		item = value;
	}
	
	public void setItem(E value){
		item = value;
	}
	
	public E getItem(){
		return item;
	}
}
