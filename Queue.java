
/*
 * We have a event. 
 * check available tickets of the event
 */
package queue;

import java.util.Queue;
import java.util.LinkedList;

public class EventAvailableCapacity {
	protected Queue<Integer> ticketRequests;
	protected int availableCapacity;
	
	public EventAvailableCapacity(int maxCapacity) {		// constructor
		ticketRequests = new LinkedList<Integer>();
		this.availableCapacity = maxCapacity;
	}
	
	public void addTicketRequest(int numOfPeople) {		// method adding numbers of people in the list
		ticketRequests.add(numOfPeople);
	}
	
	public int processUntilNoCapacity() {				// method to run this process until the max capacity
		int numRequestsProcessed =  0;
		
		while (!ticketRequests.isEmpty()) {
			int remainAfterRequests = (availableCapacity - ticketRequests.peek()); // peek -> Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
			
			if(remainAfterRequests < 0)
				return numRequestsProcessed;
			
			availableCapacity = availableCapacity - ticketRequests.remove();
			numRequestsProcessed ++;
		}
		return 0;
	}
}
