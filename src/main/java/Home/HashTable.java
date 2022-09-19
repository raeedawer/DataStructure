package Home;

public class HashTable <T>{
    private int key;
    final int index=28;
    LinkedList []lists=new LinkedList[28];
    public void add(T t){
        this.key=t.toString().charAt(0)%index;
        if (lists[this.key]==null){
            lists[this.key]=new LinkedList();
        }
        lists[this.key].add(t);

    }

    public void printAll(T key) {
        int index=key.toString().charAt(0)%this.index;
        lists[index].getAll();
    }






}
