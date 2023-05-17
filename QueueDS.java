public class QueueDS
{
	public static void main(String[] args) {
	    Queue queue = new Queue();
	    queue.enqueue(10);
	    queue.enqueue(20);
	    queue.enqueue(30);
	    queue.enqueue(40);
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
	}
}

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node first;
    Node last;
    int length;
    
    public Queue() {
        this.length = 0;
        first = null;
        last = null;
    }
    
    public Node enqueue(int data) {
        Node temp = new Node(data);
        if(first==null) {
            first = temp;
            last = temp;
        } else {
            last.next = temp;
            last = last.next;
        }
        this.length++;
        return this.first;
    }
    
    public Node dequeue() {
        this.first = first.next;
        this.length--;
        return this.first;
    }
    
    public String toString() {
        String result = "";
        Node temp = this.first;
        while(temp!=null) {
            result += temp.data + "-->";
            temp = temp.next;
        }
        return result;
    }
}