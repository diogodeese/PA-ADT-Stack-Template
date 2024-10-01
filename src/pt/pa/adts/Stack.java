package pt.pa.adts;

public interface Stack<T>  {
    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to be added to the stack.
     * @throws FullStackException if the stack is full and no more elements can be added.
     */
    public void push(T element) throws FullStackException;

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the element that was at the top of the stack.
     * @throws EmptyStackException if the stack is empty and there is no element to remove.
     */
    public T pop() throws EmptyStackException;

    /**
     * Returns, but does not remove, the top element of the stack.
     *
     * @return the element currently at the top of the stack.
     * @throws EmptyStackException if the stack is empty and there is no element to retrieve.
     */
    public T peek() throws EmptyStackException;

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the size of the stack.
     */
    public int size();

    /**
     * Checks whether the stack is empty.
     *
     * @return {@code true} if the stack contains no elements, {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Removes all elements from the stack, leaving it empty.
     */
    public void clear();

}