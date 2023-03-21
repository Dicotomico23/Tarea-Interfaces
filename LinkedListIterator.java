package uaslp.objetos.linkedlist;

public class LinkedListIterator implements ListIterator{
    private Node currentNode;

    LinkedListIterator(Node head){
        currentNode = head;
    }
    public boolean hasNext(){
        return currentNode != null;
    }

    public String next(){
        String data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}