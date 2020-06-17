/**
 * author: Susan Margevich @sam1829
 * filename: StackNode.java
 * A stack implementation that uses a Node to represent the structure.
 */

package rit.stu;

import rit.cs.Stack;
import rit.cs.Node;

public class StackNode<T> extends Object implements Stack<T>
{
    private Node<T> node;

    /**
     * Create an empty stack.
     */
    public StackNode()
    {
        node = null;
    }

    /**
     * Check if the stack is currently empty or not.
     * @return true if empty, false otherwise
     */
    public boolean empty()
    {
        if (node == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Remove and return the top element in the stack.
     * @return the front element
     */
    public T pop()
    {
        assert !empty();
        Node<T> tempNode = node;
        node = node.getNext();
        return tempNode.getData();
    }

    /**
     * push in interface Stack<T>
     * @param element The new data element
     */
    public void push(T element)
    {
        Node<T> newNode = new Node<T>(element, node);
        node = newNode;
    }

    /**
     * Get the top element on the stack.
     * @return The top element
     */
    public T top()
    {
        assert !empty();
        return node.getData();
    }
}
