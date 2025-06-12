package array;

public class Array {

    private int[] items;
    private int count;

    public Array(int initialSize) {
        items = new int[initialSize];
    }

    public void print(){
        System.out.print("["); //O(1)
        for (int i = 0; i< count; i++){
            System.out.print(items[i] + " ");
        } //O(n)
        System.out.println("]"); //O(1)
    }
    public void add(int item) {
        if(count >= items.length){
            int[] newItems = new int[items.length*2];
            for(int i=0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count] = item;
        count++;
    }
    public int size(){
        return count;
    }
    public void remove(int index) {

        if( index < 0 || index >= count) {
            return;
        }

        for(int i = index; i <count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }
    public Boolean isEmpty(){
        return count == 0;
    }

    public Boolean contains(int item) {
        for(int i = 0; i < count; i++){
            if(items[i] == item)
                return true;
        }
        return false;
    }

    public int indexOf(int item){

        for(int i = 0; i < count; i++){
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public int[] toArray(){
        int[] newItems = new int[count];
        for(int i =0; i < count; i++){
            newItems[i] = items[i];
        }
        return newItems;
    }

    public int findByIndex(int index){
        if(index < 0 || index >= count )
            return Integer.MAX_VALUE;
        return items[index];
    }


    //findByIndex() --> O(1)
    //size() --> O(1)
    //isEmpty() --> O(1)
    //add(int number) --> O(n)
    //remove(int index) --> O(n)
    //contains(int number) --> O(n)
    //indexOf(int number) --> O(n)
    //toArray() --> O(n)

}
