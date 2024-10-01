package pt.pa.adts;


public class StackArrayList<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 40;

    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public StackArrayList() {
        this.elements = (T[])new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /*
     * Adds a new element to the stack.
     * If the internal array is full, the array is resized.
     * Worst-case complexity: O(n) - When resizing is required (copying all elements to a new array).
     * Average-case complexity: O(1) - If space is available, insertion is constant time.
     */
    @Override
    public void push(T element) throws FullStackException {
        if (this.size >= this.elements.length) {
            resize();  // O(n) when resizing occurs
        }

        this.elements[this.size++] = element;  // O(1) insertion
    }

    /*
     * Resizes the internal array to a larger capacity.
     * Time complexity: O(n) - Copying all elements to the new array.
     */
    private void resize() {
        int newCapacity = this.elements.length + 1;
        T[] newElements = (T[]) new Object[newCapacity];

        System.arraycopy(this.elements, 0, newElements, 0, this.size);

        this.elements = newElements;
    }

    /*
     * Removes and returns the top element from the stack.
     * Time complexity: O(1) - Removing the top element is a constant time operation.
     * Setting the element to null is not strictly necessary for correctness,
     * but it helps the garbage collector free memory (avoid memory leaks).
     */
    @Override
    public T pop() throws EmptyStackException {
        if(this.size == 0) throw new EmptyStackException();  // O(1) check if stack is empty

        T elem = this.elements[this.size - 1];  // Get the top element (O(1))

        // Setting the element to null allows the garbage collector to reclaim memory
        this.elements[this.size - 1] = null;  // Good practice for memory management (O(1))

        this.size--;  // Reduce the size (O(1))

        return elem;  // Return the popped element (O(1))
    }

    @Override
    public T peek() throws EmptyStackException {
        return this.elements[size - 1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for(int i = 0; i < elements.length; i++) {
            this.elements[i] = null;
        }
        this.size = 0;
    }
}
