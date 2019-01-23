package week02;

import java.util.Iterator;
import java.util.LinkedList;

//timeInVideo: 

public class IteratorTest {
	
	LinkedList<Integer> localList;
	private int 		listSize;
	private StopWatch 	timer;
	private long 		startTime;
	private long 		stopTime;
	
	public IteratorTest(int listSize) {
		setListSize(listSize);
		this.stopWatch = new StopWatch();
		initialize();
		
	}

	private void setListSize(int listSize) {
		// TODO Auto-generated method stub
		this.listSize = listSize;
		
	}

	public void execute() {
		Iterator<Integer> iterator = this.localList.iterator();
		stopWatch.start();
		while(iter.hasNext()){
			Integer integer = iterator.next();
		}
		stopWatch.stop();
		iteratorElapsedTime = stopWatch.getElapsedTimeInMilliseconds();

		//start again
		stopWatch.start();
		for(int index = 0; index< localList.size(); index++){
			Integer integer = localList.get(index);
		}
		stopWatch.stop();
		this.getAtElapsedTime = stopWatch.getElapsedTimeInMilliseconds();

	}

	public long getStartTime(){
		return startTime;
	}

	public long getStopTime(){
		return stopTime;
	}
	
	public long getElapsedTimeInMilliseconds(){
		
		return this.getAtElapsedTime;
	}
	
	public long getIteratorElapsedTimeInMilliseconds() {
		
	}

	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		stopTime = System.currentTimeMillis();
	}

	public long getListSize() {
				
		return this.localList.size();
	}

	public void initialize(){
		this.localList = new ArrayList<Integer>();
		for(int i = 0; i < this.listSize; i++) {
			localList.add(i);
		}	
		
	}
}
