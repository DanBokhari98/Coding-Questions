
public class removeMiddle {
	
	public static void removeMid(LinkedList<Integer> l){
		int size = l.size();
		int counter = 0;
		int middle;
		if(size % 2 == 0) {middle = size / 2;}
		else {middle = (size + 1) / 2;}
		Node<Integer> node = l.head;
		while(counter <= middle) {
			counter++;
			// When we arrive to node number 5
			// We want to remove it from the list
			if(counter == middle - 1) {
				node.setNext(node.getNext().getNext());
				counter++;
			}
			node = node.getNext();
		}
		
	}
}
