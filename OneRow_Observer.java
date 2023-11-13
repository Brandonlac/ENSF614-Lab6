import java.util.ArrayList;

public class OneRow_Observer implements observer {
	public ArrayList<Double> data;
	public OneRow_Observer(DoubleArrayListSubject arr) {
		data = new ArrayList<Double>();
		for (Double d : arr.data) {
			data.add(d);
		}
		arr.addObserver(this);
		display();
	}

	@Override
	public void update(ArrayList<Double> arr) {
		for (Double d : arr) {
			data.add(d);
		}
		display();
		
	}
	public void display() {
		int count = 0;
		while(count < data.size()) {
				System.out.print(data.get(count)+ " ");
				count++;
			}
		System.out.println();
		}
	}


