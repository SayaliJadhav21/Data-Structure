public class LinkedListDS
{
	public static void main(String[] args) {
	    LinkedListNew list = new LinkedListNew(10);
		System.out.println("Linked List : " + list.toString(list.head));
		Node head = list.append(20);
		System.out.println("Linked List : " + list.toString(head));
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
    
    // Add element at the front of list
    public Node prepend(Integer value) {
        Node temp = new Node(value);
        temp.next = this.head;
        this.head = temp;
        length++;
        return head;
    }
    
    // Insert element is list at given index
    public Node insert(int index, Integer value) {
        Node temp = new Node(value);
        if(index == 0) {
            temp.next = head;
            this.head = temp;
            this.length = 1;
        } else {
            Node prev = this.head;
            for(int i=0;i<index-1;i++) {
                prev = prev.next;
            }
            if(prev.next == null) {
                prev.next = temp;
                this.tail = temp;
            } else {
                temp.next = prev.next;
                prev.next = temp;
            }
            this.length++;
        }
        return this.head;
    }
    
    // Remove element from given index
    public Node remove(int index) {
        if(index == 0) {
            this.head = head.next;
        } else {
            Node prev = this.head;
            for(int i=0;i<index-1;i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        return this.head;
    }
        
}