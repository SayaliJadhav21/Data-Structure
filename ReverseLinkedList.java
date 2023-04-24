public class ReverseLinkedList
{
	public static void main(String[] args) {
	    LinkedListNew list = new LinkedListNew(10);
		System.out.println("Linked List : " + list.toString(list.head));
		Node head = list.append(20);		
		head = list.prepend(5);
		System.out.println("Linked List : " + list.toString(head));
	    head = list.insert(1, 40);
		System.out.println("Linked List : " + list.toString(head));
		head = list.remove(2);
		System.out.println("Linked List : " + list.toString(head));
	}
	
}

class Node {
    Integer value;
    Node next = null;
    
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
    public String toString() {
        return "Value: " + value + " next : " + next;
    }
}

class LinkedListNew {
    Node head;
    Node tail;
    Integer length;
    
    LinkedListNew(Integer value) {
        this.head = new Node(value); 
        this.tail = this.head;
        this.length = 1;
    }
    
    public String toString(Node head) {
        String str = "";
        Node temp = head;
        str += "Value: " + temp.value + ", Next: " + "--> ";
        while(temp.next!=null) {
            temp = temp.next;
            str += "Value: " + temp.value + ", Next:";
            if(temp.next!=null) {
                 str += "-->";
            } else {
                str += "null";
            }
        }
        return str;
    }

    // Add element at the back of list
    public Node append(Integer value) {
        Node temp = new Node(value);
        this.tail.next = temp;
        this.tail = temp;
        this.length++;
        return this.head;
    }

    //Reverse the Linked list
    public Node reverse() {
        if(this.length == 1) {
            return this.head;
        }
        // The first and second elements of list are changed 10-20-30-40-50, then 20 is second and 10 is first and
        // second.next = first like this all elements are reversed. ex. for next iteration 30 is second and 20 os first.
        Node first = this.head;
        // The first element becomes the tail of the list 
        this.tail = first;
        Node second = first.next;
        while(second!=null) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        // The head of the list will point to null
        this.head.next = null;
        // The last element becomes the head of the list
        this.head = first;
        return this.head;
    }
}