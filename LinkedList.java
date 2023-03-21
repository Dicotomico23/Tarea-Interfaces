package uaslp.objetos.linkedlist;
public class LinkedList implements List{
    private Node head;
    private Node tail;
    private static int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    private LinkedListIterator iterator = new LinkedListIterator(head);
    public void addAtTail(String data){
        Node nuevo = new Node();
        nuevo.data = data;
        nuevo.previous = tail;
        if(head == null){
            head = nuevo;
        }else{
            tail.next = nuevo;
        }
        tail = nuevo;
        size++;
    }

    public void AddToFront(String data){
        Node nuevo = new Node();
        nuevo.data = data;
        if(head == null){
            nuevo.previous = null;
            nuevo.next = null;
        }else{
            Node auxHead = head;
            head.previous = nuevo;
            nuevo.next = auxHead;
        }
        head = nuevo;
        size++;
    }

    public void Remove(int index){
        if(index < 0 || index >= size){
            System.out.println("index out of range");
        }else {
            Node aux = head;
            for(int cont = 0; cont < index ; cont++) aux = aux.next;
            aux.previous.next = aux.next;
            aux.next.previous = aux.previous;
            aux = null;
            size--;
        }
    }

    public void RemoveAll() {
        Node aux = head;
        while(iterator.hasNext() && size!=0){
            aux.previous.next = aux.next;
            aux.next.previous = aux.previous;
            aux = null;
            size--;
        }
    }

    public void SetAt(int index, String data){
        if(index < 0 || index >= size){
            System.out.println("index out of range");
        }else {
            Node aux = head;
            for(int cont = 0; cont < index ; cont++) aux = aux.next;
            Node nuevo = new Node();
            nuevo.data = data;
            nuevo.next = aux.next;
            nuevo.previous = aux.previous;
            aux.previous.next = nuevo;
            aux.next.previous = nuevo;
            aux = null;
        }
    }

    public String getAt(int index){
        for(int cont=0;cont<index;cont++,iterator.next());
        String data = iterator.next();
        return data;
    }

    public void RemoveAllWithValue(String data){
        Node aux = head;
        int cont = 0;
        while(iterator.hasNext() && cont<size){
            if(iterator.next()==data){
                aux.previous.next = aux.next;
                aux.next.previous = aux.previous;
                aux = null;
            }
            iterator.next();
        }
    }

    public int getSize(){
        return size;
    }

    public LinkedListIterator getIterator(){
        return iterator;
    }
    public void PrintList(){
        ListIterator iterator = new LinkedListIterator(head);
        while(iterator.hasNext()) {
            String data = iterator.next();
            System.out.print(data+"-->");
        }
    }
}
