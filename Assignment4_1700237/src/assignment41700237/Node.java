package assignment41700237;

public class Node 
    {
	private Car data;
	private Node next;
	
	public Node() {
		this.data = new Car();
		this.next = null;
	}

	public Node(Car data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Car getData() {
		return data;
	}

	public void setData(Car data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	

}