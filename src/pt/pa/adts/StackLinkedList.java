package pt.pa.adts;


public class StackLinkedList<T> implements Stack<T> {

    private Node top; //sentinel of linked list
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
        /*
        Element should be stored in a new node which is pointed by top sentinel.
        Must maintain the chaining of all nodes.
         */

        top.next = new Node(element, top.next);
        size++;
    }

    /*
     * Removes and returns the top element of the stack.
     * Time complexity: O(1) - constant time to remove a node and adjust the link.
     */
    @Override
    public T pop() throws EmptyStackException {
        /*
        The element at the top of the stack is the element stored in the
        node immediately after the top sentinel.
         */

        Node node = top;
        top = null;
        size--;

        return node.element;
    }

    @Override
    public T peek() throws EmptyStackException {
        return top.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top.element == null;
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
        private T element;
        private Node next;

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
