package week02;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
	
	LinkedList<Integer> myList;
	private int listSize;
	private StopWatch timer;
	
	public IteratorTest(int listSize) {
		setListSize(listSize);
		myList = new LinkedList<>();
		
		for(int i = 0; i < listSize; i++) {
			myList.add(i);
		}		
		
		timer = new StopWatch();
		
		
		
	}

	private void setListSize(int listSize) {
		// TODO Auto-generated method stub
		
		
	}

	public void execute() {
		Iterator iterator = this.myList.iterator();
	}
	
	public long getElapsedTimeInMilliseconds(){
		
		
		
	}
	
	public long getIteratorElapsedTimeInMilliseconds() {
		
	}

	public long getListSize() {
		// TODO Auto-generated method stub
		int tally = 0;
//		for(int i = 0; i<myList.size(); i++) {
//			tally += myList.get(i);
//		}
//	
//		return this.myList.size();
		return this.myList.size();
	}
}
