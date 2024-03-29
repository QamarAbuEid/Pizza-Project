package application;

public class Drive <T extends Comparable<T>>{

	public static void main(String[] args) {
		 DHlist<Integer> dh = new DHlist<>();
		dh.insertAtEnd(6);
		dh.insertAtEnd(9);
		dh.insertAtEnd(2);
		dh.insertAtEnd(4);
		dh.insertAtEnd(3);
		dh.insertAtEnd(3);
		dh.insertAtEnd(3);
		dh.insertAtEnd(3);
		dh.deleteDuplicates();
		dh.RadixSort();
		
		
		
		dh.traverse();
	
		

	}

}
