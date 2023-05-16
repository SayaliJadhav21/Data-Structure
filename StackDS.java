public class StackDS
{
	public static void main(String[] args) {
	    Stack stack = new Stack();
	    Node top = stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(50);
	    stack.pop();
	    stack.push(40);
	    stack.pop();
		System.out.println(stack.toString(top));
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
        if(this.bottom==null) {
            return null;
        } else {
            Node temp = this.bottom;
            Node prev = null;
            while(temp.next!=null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            this.top = prev;
            return this.top;
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


