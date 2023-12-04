package application.logic;

public class Counter {
	private static Counter instance = new Counter();
	private int count;

	private Counter() {
		count = 0;
	}

	public void addCount() {
		this.count++;
	}

	public int getCount() {
		return this.count;
	}

	public static Counter getInstance() {
		return Counter.instance;
	}
}
