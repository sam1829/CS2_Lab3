/**
 * author: Susan Margevich @sam1829
 * filename: QueueNode.java
 * A queue implementation that uses a Node to represent the structure.
 */

package rit.stu;

import rit.cs.Queue;
import rit.cs.Node;

public class QueueNode<T> extends Object implements Queue<T>
{
    private Node<T> front;
    private Node<T> back;

    /**
     * Create an empty queue.
     */
    public QueueNode()
    {
        front = null;
        back = null;
    }

    /**
     * Get the last element in the queue.
     * @return the back element
     */
    public T back()
    {
        assert !empty();
        return back.getData();
    }

    /**
     * Remove and return the front element in the queue.
     * @return the front element
     */
    public T dequeue()
    {
        assert !empty();
        Node<T> slot = front;
        // stores the front value for manipulation
        if (back == front)
        {
            front = null;
            back = null;

            // if back = front, there is only one element, therefore there is nothing to dequeue
        }
        else
        {
            Node<T> slot2 = back;
            while (back.getNext() != front)
            {
                back = back.getNext();
                //searched back of queue to see if it equal front- once it equals front, it will exit while loop
            }
            front = back;
            back = slot2;
        }
        return slot.getData();
    }

    /**
     * Check if the queue is currently empty or not.
     * @return true if empty, false otherwise
     */
    public boolean empty()
    {
        if (front == null)
        {
            return true;
        }
        else
            return false;
    }

    /**
     * Add a new element to the back of the queue.
     * @param element The new data element
     */
    public void enqueue(T element)
    {
        Node<T> newNode = new Node<T>(element, back);
        if (front == null)
        {
            front = newNode;
            back = newNode;
        }
        else
        {
            back = newNode;
        }
    }

    /**
     * Get the front element in the queue.
     * @return the front element
     */
    public T front()
    {
        assert !empty();
        return front.getData();
    }
}
