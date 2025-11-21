package gr.aueb.sev.ch6;

public class MyStackApp {

    final static int STACK_SIZE = 50;
    static int[] stack = new int[STACK_SIZE];
    static int top = -1;

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        printStack();

        int item = pop();

        System.out.println("Popped: " + item);

        printStack();
    }

    // push
    public static void push(int num){
        if (isFull()) {
//            System.out.println("Stacl is full");
//            return;
            throw new RuntimeException("Stack is full");
        }

//        top++;
//        stack[top] = num;
        stack[++top] = num;
    }
    // pop
    public static int pop(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");

        return stack[top--];
    }

    // isEmpty
    public static boolean isEmpty(){
        // boolean empty = top == -1;
        // return empty;
        return top == -1;
    }

    // isFull
    public static boolean isFull(){
        return top == (STACK_SIZE - 1);
    }

    // printStack
    public static void printStack(){
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }

        // printing...
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
