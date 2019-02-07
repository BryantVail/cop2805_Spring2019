package week05;

import java.util.ArrayList;
import java.util.LinkedList;

public class InClassExercise {

	public static void main(String[] args) {
		//arraylist of 2mil numbers
		//linkedList of 2 million numbers
		//Delete ArrayList elements
		//Delete LinkedList
		System.out.println("Calculating");
		StopWatch watch = new StopWatch();
		
		watch.start();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for( int i = 0; i< 200000; i++) {
			arrayList.add(i);
		}
		watch.stop();
		long arrayListCreationTime = watch.getElapsedTimeMilliSeconds();
		
		int initSize = arrayList.size();
		for( int i = initSize-1 ; i>0; i--) {
			arrayList.remove(i);
		}
		watch.stop();
		long arrayListDeletionTime = watch.getElapsedTimeMilliSeconds();
		long arrayListCreationAndDeletionTime = arrayListDeletionTime + arrayListCreationTime;
		System.out.println("Still Calculating, Almost done");
		
		//linkedList start
		watch.start();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for( int i = 0; i< 200000; i++) {
			linkedList.add(i);
		}
		watch.stop();
		long linkedListCreationTime = watch.getElapsedTimeMilliSeconds();
		
		watch.start();
		initSize = linkedList.size();
		for( int i = initSize -1; i>0; i--) {
			linkedList.remove(i);
		}
		watch.stop();
		long linkedListDeletionTime = watch.getElapsedTimeMilliSeconds();
		long linkedListCreationAndDeletionTime = linkedListCreationTime + linkedListDeletionTime;
		
		System.out.println("ArrayList Construction Time:\t\t\t"+ arrayListCreationTime +"\nArrayList Deletion Time:\t\t\t"+arrayListDeletionTime +"\nArrayList total Creation and Deletion Time:\t"+ arrayListCreationAndDeletionTime +"\nLinkedList Creation Time:\t\t\t" + linkedListCreationTime + "\nLinkedList Deletion Time:\t\t\t"+ linkedListDeletionTime + "\nLinkedList Creation and Deletion Time:\t\t" +linkedListCreationAndDeletionTime );
		
		
		
		
	}
	
	

}
