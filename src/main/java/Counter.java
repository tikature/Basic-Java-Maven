package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void resetzz() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrementzz() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
