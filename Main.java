package uaslp.objetos.linkedlist;
public class Main {
    public static void main(String[] args) {
        List list1 = new LinkedList();
        List list2 = new ArrayList();
        list1.addAtTail("ArrayList");
        list1.addAtTail("Diego");
        list1.addAtTail("Lopez");
        list1.addAtTail("Facundo");
        list1.RemoveAllWithValue("ArrayList");
        list1.Remove(2);
        list1.PrintList();
        System.out.println("size: "+list1.getSize());
        list2.addAtTail("ArrayList");
        list2.addAtTail("Diego");
        list2.addAtTail("Lopez");
        list2.addAtTail("Facundo");
        ((ArrayList) list2).deleteElement("ArrayList");
        ((ArrayList)list2).deleteByIndex(2);
        ((ArrayList)list2).PrintArray();
        System.out.println("size: "+list2.getSize());
    }
}