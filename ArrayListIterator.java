package uaslp.objetos.linkedlist;

public class ArrayListIterator implements ListIterator{
    private Node currentNode;
    public boolean hasNext() {
        return currentNode != null;
    }
    public String next() {
        String data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
