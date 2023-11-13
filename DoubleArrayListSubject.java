import java.util.ArrayList;
public class DoubleArrayListSubject implements subject {
	protected ArrayList<Double> data;
	private ArrayList<observer> obs;
	public DoubleArrayListSubject() {
		data = new ArrayList<Double>();
		obs = new ArrayList<observer>();
	}
	public void addData(Double d) {
		data.add(d);
		notifyAllObservers();
	}
	public void setData(Double d, int i) {
		data.add(i, d);
		notifyAllObservers();
	}
	public void populate(double [] arr) {
		for (Double d : arr) {
			data.add(d);
			notifyAllObservers();
		}
	}
	
	public void addObserver(observer o) {
		obs.add(o);
		
	}
	@Override
	public void remove(observer o) {
		obs.remove(o);
		
	}
	@Override
	public void notifyAllObservers() {
		for (observer ob : obs) {
			ob.update(data);
		}
		
	}
	public void display() {
		int count = 0;
		while (count < data.size()){
			System.out.print(data.get(count)+ " ");
		}
		if (count == 0 ) {
			System.out.println("Empty List ...");
		}
	}
	
}
