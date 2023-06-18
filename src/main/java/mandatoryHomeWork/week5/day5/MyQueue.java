package mandatoryHomeWork.week5.day5;

import java.util.Stack;

public class MyQueue {
	 
	
	
	/*
	 * Implementing Queue using Stack requires two stack -> ip Stack and op stack
	 * if push -> add that num to ip stack
	 * when top func-> chack the op 
	 *		->if op is not empty ->true->op.peek
	 *		->fase-> 
	*/
	
	Stack<Integer> ip;
    Stack< Integer> op;
public MyQueue() {
	ip= new Stack<>();
	op= new Stack<>();
    }
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        if(!op.isEmpty()) {
        	return op.pop();
        }else {
        	while(!ip.isEmpty()) {
        		op.push(ip.pop());
        	}
        	   return  op.pop();
		}
     
    }
    
    public int peek() {
    	  if(!op.isEmpty()) {
          	return op.peek();
          }else {
          	while(!ip.isEmpty()) {
          		op.push(ip.pop());
          	}
          	   return  op.peek();
  		}
    }
    
    public boolean empty() {
    	boolean flag =!op.isEmpty() || !ip.isEmpty();
    	return flag;
    }
public static void main(String[] args) {
	MyQueue q=new MyQueue();
	q.push(2);q.push(3);q.push(5);
	System.out.println("peak: "+q.peek());
	System.out.println("pop: "+q.pop());
	q.push(6);
	System.out.println("pop: "+	q.pop());
	System.out.println(	"pop: "+q.pop());
	System.out.println("peek: "+	q.peek());
	
}
}
