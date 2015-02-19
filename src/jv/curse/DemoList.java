package jv.curse;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
  */
public class DemoList <T> {
    private Item first;
    private int size;

    private class Item{
        private Item next;
        private T data;
        public Item(Item next, T data){
            this.next = next;
            this.data = data;
        }
        public Item getNext(){
           return next;
        }
        public T getData(){
            return data;
        }
    }

    public void add(T data){
        Item currentItem = new Item(first, data);
        first = currentItem;
        size++;
    }

    public void delete()throws RuntimeException{
        if (first == null){
            throw new RuntimeException("Список пуст");
        }
        first = first.getNext();
        size--;
    }

    public int size(){
        return size;
    }

    public void getDataAt(int pos)throws RuntimeException{
        Item currentItem = first;
        for (int i = 0; (currentItem == null)&&(i == pos); i++){
            currentItem = currentItem.getNext();
        }
        if (currentItem == null){
            throw new RuntimeException("Элемента с позицией " + pos + " не существует");
        }
    }

    public int indexOf(T data)throws Exception{
        Item currentItem = first;
        int pos = 0;
        while ((currentItem != null) && (currentItem.getData() != data)) {
             pos++;
        }
        if (currentItem == null) {
             throw new Exception("Элемент в списка не найден");
        }
        return pos;
    }
}
