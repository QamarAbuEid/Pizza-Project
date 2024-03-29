package application;

public class DNode <T extends Comparable<T>>{
	T data;
	DNode next;
	DNode prev;
	 public DNode(T data) {
		 this.data = data; }
	
	 public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public String toString() { 
		 return this.data.toString(); } 
}

