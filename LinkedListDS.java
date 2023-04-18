public class LinkedListDS
{
	public static void main(String[] args) {
	    LinkedListNew list = new LinkedListNew(10);
		System.out.println("Linked List : " + list.toString(list.head));
		Node head = list.append(20);
		System.out.println("Linked List : " + list.toString(head));
		head = list.prepend(5);
		System.out.println("Linked List : " + list.toString(head));
	}
}

class Node {
    Integer value;
    Node next;
    
    public String toString() {
        return "Value: " + value + " next : " + next;
    }
}

class LinkedListNew {
    Node head;
    Node tail;
    Integer length;
    
    LinkedListNew(Integer value) {
        this.head = new Node(); 
        this.head.value = value;
        this.head.next = null;
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
    
    public Node append(Integer value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = null;
        this.tail.next = temp;
        this.tail = temp;
        this.length++;
        return this.head;
    }
    
    public Node prepend(Integer value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = this.head;
        this.head = temp;
        length++;
        return head;
    }
}