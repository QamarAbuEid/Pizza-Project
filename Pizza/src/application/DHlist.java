package application;

public class DHlist<T extends Comparable<T>> {
	DNode head = new DNode(null);

	public void insertAtHead(T data) {
	    DNode<T> newNode = new DNode<>(data);

	    if (head.getNext() != null) {
	        head.getNext().setPrev(newNode);
	        newNode.setNext(head.getNext());
	    }

	    newNode.setPrev(head);
	    head.setNext(newNode);

	    
	    if (head.getNext() == newNode) {
	        head = newNode;
	    }
	}
	public void RadixSort() {
	    int maximumDigits = getMaximumDigits();

	    for (int exp = 1; exp <= maximumDigits; exp *= 10) {
	        counter(exp);
	    }
	}

	private int getMaximumDigits() {
	    int maximumDigits = 0;

	    DNode<T> current = head.getNext();
	    while (current != null) {
	        int length = String.valueOf(current.getData()).length();
	        maximumDigits = Math.max(maximumDigits, length);
	        current = current.getNext();
	    }

	    return maximumDigits;
	}

	private void counter(int exp) {
	    DNode<T> Head = new DNode<>(null);
	    DNode<T>[] counter = new DNode[10];

	    for (int i = 0; i < 10; i++) {
	    	counter[i] = new DNode<>(null);
	    }

	    DNode<T> current = head.getNext();
	    while (current != null) {
	        int digit = getDigit(current.getData(), exp);
	        DNode<T> nextNode = current.getNext();

	       
	        DNode<T> lastNode = getLastNode(counter[digit]);
	        if (lastNode != null) {
	            lastNode.setNext(current);
	            current.setPrev(lastNode);
	            current.setNext(null);
	        } else {
	        	counter[digit].setNext(current);
	            current.setPrev(counter[digit]);
	            current.setNext(null);
	        }

	        current = nextNode;
	    }

	  
	    for (int i = 0; i < 10; i++) {
	        if (counter[i].getNext() != null) {
	            DNode<T> lastNode = getLastNode(counter[i].getNext());
	            lastNode.setNext(Head.getNext());
	            if (Head.getNext() != null) {
	                Head.getNext().setPrev(lastNode);
	            }
	            Head.setNext(counter[i].getNext());
	        }
	    }

	    head.setNext(Head.getNext());
	    if (Head.getNext() != null) {
	        Head.getNext().setPrev(head);
	    }
	}

	private int getDigit(T data, int exp) {
	    int value = (int) data;
	    return (value / exp) % 10;
	}

	private DNode<T> getLastNode(DNode<T> node) {
	    while (node != null && node.getNext() != null) {
	        node = node.getNext();
	    }
	    return node;
	}


	public void insertAtEnd(T data) {
	    DNode<T> newNode = new DNode<>(data);
	    DNode<T> current = head;

	    while (current.getNext() != null) {
	        current = current.getNext();
	    }

	    current.setNext(newNode);
	    newNode.setPrev(current);
	}
	


	

	public void sorted(T data) {
		DNode<T> newNode = new DNode(data);

		DNode<T> curr = head;
		while (curr.getNext() != null && curr.getNext().getData().compareTo(data) < 0) {
			curr = curr.getNext();
		}

		// Insert the new node
		newNode.setNext(curr.getNext());
		
		if (curr.getNext() != null) {
			curr.getNext().setPrev(newNode);;
		}
		curr.setNext(newNode);
		newNode.setPrev(curr);
	}
	public void deleteDuplicates() {
	    DNode<T> curr = head;
	    DNode<T> nextNode;

	    while (curr != null) {
	        nextNode = curr.getNext();

	        while (nextNode != null && nextNode.getData().equals(curr.getData())) {
	            nextNode = nextNode.getNext();
	        }

	        curr.setNext(nextNode);
	        curr = curr.getNext();
	    }
	}



	public void delete(T data) {
		DNode<T> curr = head;

		while (curr != null && !data.equals(curr.getData())) {
			curr = curr.getNext();
		}

		if (curr != null) {
			if (curr.getPrev() != null) {
				curr.getPrev().setNext(curr.getNext());
			} else {
				head = curr.getNext();
			}

			if (curr.getNext() != null) {
				curr.getNext().setPrev(curr.getPrev());
			}
		}
	}

	public void traverse() {
		DNode<T> curr = head.getNext();

		while (curr != null) {
			System.out.println(curr);
			curr = curr.getNext();
		}

	
	}
}
