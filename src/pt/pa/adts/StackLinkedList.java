package pt.pa.adts;

public class StackLinkedList<T> implements Stack<T> {

    private Node top; // sentinel of linked list
    private int size;

    public StackLinkedList() {
        /*
        The configuration of an empty singly linked list is the sentinel
        pointing to null.
         */
        this.top = new Node(null, null);
        this.size = 0;
    }

    /*
     * Inserts a new element at the top of the stack.
     * Time complexity: O(1) - constant time to insert a new node.
     */
    @Override
    public void push(T element) throws FullStackException {
        top = new Node(element, top);
        size++;
        System.out.println("New Element: " + element);
    }

    /*
     * Removes and returns the top element of the stack.
     * Time complexity: O(1) - constant time to remove a node and adjust the link.
     */
    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = top.element;
        top = top.next;
        size--;
        return element;
    }

    @Override
    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    /**
     * Inner class representing a linked list node.
     * Only recognized in the context of this class (private).
     */
    private class Node {
        final private T element;
        final private Node next;

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}