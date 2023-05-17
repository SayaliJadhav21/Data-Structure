public class QueueUsingStacks
{
	public static void main(String[] args) {
	    Queue queue = new Queue();
	    queue.enqueue(10);
	    queue.enqueue(20);
	    queue.enqueue(30);
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
	    queue.dequeue();
	    queue.enqueue(40);
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

class Stack {
    Node top;
    Node bottom;
    int length;
    
    public Stack() {
        top = null;
        bottom = null;
        length = 0;
    }
    
    public Node push(int data) {
        Node temp = new Node(data);
        if(this.top==null) {
            this.top = temp;
            this.bottom = temp;
            this.length++;
        } else {
            this.top.next=temp;
            this.top=this.top.next;
            length++;
        }
        return this.top;
    }
    
    public Node pop() {
        if(this.top==null) {
            this.bottom = null;
            return null;
        } else if(top==bottom) {
            Node temp = this.top;
            this.top = null;
            this.bottom = null;
            this.length--;
            return temp;
        } else {
            Node temp = this.bottom;
            Node prev = null;
            Node deletedNode = this.top;
            while(temp.next!=null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            this.top = prev;
            this.length--;
            return deletedNode;
        }
    }
    
    public String toString(Node top) {
        String result = "";
        while(top!=null) {
            result += top.data + "-->";
            top = top.next;
        }
        return result;
    }
}

class Queue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    
    public void enqueue(int data) {
        if(s1.top==null) {
            s1.push(data);
        } else {
            while(s1.top!=null) {
                s2.push(s1.pop().data);
            }
            s1.push(data);
            while(s2.top!=null) {
                s1.push(s2.pop().data);
            }
        }
        
    }
    
    public Node dequeue() {
        return s1.pop();
    }
    
    public String toString() {
        String result = "";
        Node temp = s1.bottom;
        while(temp!=null) {
            result += temp.data + "-->";
            temp = temp.next;
        }
        return result;
    }
}


