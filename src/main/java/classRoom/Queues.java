package classRoom;
public class Queues {
	public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
      //  queue.dequeue();
        queue.enqueue(40);
        System.out.println(queue);
       queue.dequeue();
      System.out.println(queue);
      queue.dequeue();
    }
}
	
	class Queue {
	    class Node {
	        int number;
	        Node next;
	    }
	    private Node start;
	    private Node end;
	    private int size = 0;
	    void enqueue(int no) {
	        // Created a new Node
	        Node node = new Node();
	        node.number = no;
	        // Handling the insertion of 1st element
	        if (start == null) {
	            start = node;
	            end = node;
	        }
	        // Handling the case of regular insertion at end.
	        else {
	            end.next = node;
	            end = node;
	        }
	        size++;
	    }
		public   int dequeue() throws Exception {
        	
            // Handling the case where we have only one element in the queue
        	if(start==end && start!=null){
        		 int val=start.number;
        		start = null;
        		end=null;
        		size--;
        		return val;
        		
        	}else
            // Handle the case of a regular removal
        	if (start != null ) {
        		 int val=start.number;
    			start = start.next;
    			size--;
    			return val;
    		}else {
    		       // Handling if the queue is empty
    			throw new Exception("empty queue"); 
    		}
			
        }
		 @Override
        public String toString () {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            
	     Node current = start;
            while (current != null
                    ) {
                sb.append(current.number + ", ");
                current = current.next;
            }
            sb.append("] --> " + "size: " + size);
            return sb.toString();
        }
        
        
     
	
}