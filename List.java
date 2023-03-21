package uaslp.objetos.linkedlist;

public interface List {
    void addAtTail(String data);
    void AddToFront(String data);
    void Remove(int index);
    void RemoveAll();
    void SetAt(int index, String data);
    String getAt(int index);
    void RemoveAllWithValue(String data);
    int getSize();
    LinkedListIterator getIterator();
    void PrintList();
}
