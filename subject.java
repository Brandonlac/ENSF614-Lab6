

interface subject {
	public void addData(Double d);
	public void setData(Double d, int i);
	public void populate(double [] arr);
	public void addObserver(observer o);
	public void remove(observer o);
	public void notifyAllObservers();
}
