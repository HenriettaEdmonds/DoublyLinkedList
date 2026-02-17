class DLL<E> {

    class Node<E> {

    private E element;
    private Node<E> prev;
    private Node<E> next;
    

    public Node() {
        this.element = null;
        this.prev = null;   
        this.next = null;
    }

    public Node(E element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    public Node(E element, Node<E> prev, Node<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }


// DLL Feilds
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Constructor
    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    // int size()
    public int size() {
        return size;
    }

    // boolean.isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    // E first
    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    // E last
    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    // void addFrist
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        size++;
    }

    // E removeLast
    public E removeLast() {
        if (isEmpty())
            return null;
        E removedElement = tail.getElement(); 

        if (head == tail) { 
            head = null;
            tail = null;
        } else { 
            Node<E> prevNode = tail.getPrev();
            prevNode.setNext(null);
            tail = prevNode;
        }

        size--;
        return removedElement;

    }

    // E removeFirst
    public E removeFirst() {
        if (isEmpty())
            return null; /

        E removedElement = head.getElement(); 

        if (head == tail) { 
            head = null;
            tail = null;
        } else { 
            Node<E> nextNode = head.getNext();
            nextNode.setPrev(null);
            head = nextNode;
        }

        size--;
        return removedElement;

    }



}
