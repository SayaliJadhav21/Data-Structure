/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Stack {

    public static void main(String[] args) {
	    StackImpl stack = new StackImpl(5);
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(40);
	    stack.push(30);
	    stack.push(20);
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
	}

}
public class StackImpl {
    int array[];
    int top;
    int bottom;
    int length;
    
    public Stack(int length) {
        this.length = length;
        array = new int[length];
        top = -1;
        bottom = -1;
    }
    
    public void push(int data) {
        if(this.top!=this.length-1) {
            array[++this.top] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    public int pop() {
        if(this.top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int deletedElement = array[this.top];
            --this.top;
            return deletedElement;
        }
    }
    
    public String toString() {
        String result = "";
        for(int i=top;i>=0;i--) {
            result += "| " + array[i] + " |\n";
        }
        return result;
    }
}