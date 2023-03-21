package uaslp.objetos.linkedlist;

public class ArrayList implements List{
    private static final int INITIAL_SIZE = 2;
    private String []array;
    private int size;
    public ArrayList(){array = new String[INITIAL_SIZE];    }
    public void addAtTail(String data){
        if(size == array.length) IncreaseArray();
        array[size] = data;
        size++;
    }
    public void AddToFront(String data) {
    }
    public void Remove(int index) {
    }
    public void RemoveAll() {
    }
    public void SetAt(int index, String data) {
    }
    public String getAt(int index) {
        return null;
    }
    public void RemoveAllWithValue(String data) {
    }
    public void deleteElement(String data){
        for(int cont=0;cont<size;cont++){
            if(array[cont].equals(data)){
                array[cont] = null;
                System.out.println("Element Removed!");
            }
        }
    }
    public void deleteByIndex(int index){
        int cont = 0;
        for(;cont<index;cont++);
            array[cont] = null;
            System.out.println("Element Removed at index: "+cont);
    }
    public int getSize(){
        return size;
    }
    public LinkedListIterator getIterator() {
        return null;
    }
    public void PrintList() {}
    public void IncreaseArray(){
        System.out.println("Array increased, new size: "+getSize()*2);
        String[] newArray = new String[array.length * 2];
        for(int cont=0;cont<size;cont++){
            newArray[cont] = array[cont];
        }
        array = newArray;
    }
    public void PrintArray(){
        for(int cont=0;cont<size;cont++){
            System.out.println("["+array[cont]+"]");
        }
    }
}
