package ch14;

public class DoubleLinkedList extends LinkedList{
    private Node head;
    private Node tail;
    private int size;
    public DoubleLinkedList(){
        super();
    }

    public boolean addHead(int value) {
        DoubleLinkedNode newNode2 = new DoubleLinkedNode(value, head, null);
        if (head != null) {
            ((DoubleLinkedNode) head).setDln(newNode2);
        }
        head = newNode2;
        if (size == 0) {
            tail = head;
        }
        size++;
        return true;
    }

//    private boolean addTail(int value) {
//        DoubleLinkedNode newNode = new DoubleLinkedNode(value, null, tail);
//        if (tail != null) {
//            ((DoubleLinkedNode) tail).setDln(newNode);
//        }
//        tail = newNode;
//        size++;
//        return true;
//    }

//    public boolean add(int index, int value) {
////        Add to the head: Make the new node head.
//        if (index == 0)
//            addHead(value);
//
////      Add to the tail. Make the new node tail
//        else if (index == size)
////            addTail(value);
//
////      Add somewhere between head and tail.
//        else {
//            int cursor = 0;
//            DoubleLinkedNode pointer = (DoubleLinkedNode) head;
//            while (cursor < index - 1) {
//                cursor++;
//                pointer = (DoubleLinkedNode) pointer.next();
//            }
//            // cursor = index - 1 now
//            DoubleLinkedNode insertionNode = (DoubleLinkedNode) pointer.next();
//            DoubleLinkedNode newNode = (DoubleLinkedNode) new Node(value, insertionNode);
//            pointer.next(newNode);
//        }
//        size++;
//        return true;
//    }
}
