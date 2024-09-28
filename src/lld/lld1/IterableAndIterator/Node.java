package lld.lld1.IterableAndIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Node implements Iterable<Node> {
    Node next;
    int data;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<Node>() {
            private Node current = Node.this;  // Start with the current node

            @Override
            public boolean hasNext() {
                return current != null;  // Check if the current node is not null
            }

            @Override
            public Node next() {
                if (current == null) {
                    throw new NoSuchElementException();  // Throw an exception if there are no more elements
                }
                Node temp = current;  // Store the current node
                current = current.next;  // Move to the next node
                return temp;  // Return the current node
            }
        };
    }
}
