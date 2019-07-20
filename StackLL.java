package a;

import java.util.LinkedList;

//creates a linkedlist  that follows and has stack rules
public class StackLL implements StackIntrfc {
	//creates a linkedlist 
	public LinkedList<Double> a = new LinkedList<Double>();
	
	public StackLL(){
		
	}
	
	//for a linked list, to "push" an item onto a list, you add it to the end of the list
	public void push(double d){
		a.addLast(d);
	}
	// removes last while returning the value it had.
	public double pop( ){
		return(a.removeLast());
		
	}
	// allows you to look at the most recent "pushed" item on the list
	public double peek( ) {
		return(a.getLast());
		
	}
	//how big
	public int size( ) {
		return(a.size());
		
	}
	//removes items
	public void clear( ){
		a.clear();
	}

}
