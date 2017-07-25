import java.io.*;
import java.util.*;

public class stack<T> {

	private static class stackNode<T> {
		private T data;
		private stackNode<T> next;

		public stackNode(T data){
			this.data = data;
		}

	}

	private stackNode<T> top;

	public stack(T data) {
		top = new stackNode<T>(data); 
	}

	public void push(T data) {
		stackNode<T> t = new stackNode<T>(data);
		t.next = top;
		top = t;
		System.out.println(t.data + " has been pushed!");
		
	}

	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		System.out.println("Popped: " + item);
		return item;
	}


	public T peek() {
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}



	public static void main(String[] args) {
		stack<Integer> mystack = new stack<Integer>(1);
		System.out.println(mystack.top.data);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.push(6);
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
	}
}