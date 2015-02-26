package jv.curse;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 */
public class DemoList<T> {
    private Item first;
    private int size;

    private class Item {
        private Item next;
        private T data;

        public Item(Item next, T data) {
            this.next = next;
            this.data = data;
        }

        public Item getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    public void add(T data) {
        Item currentItem = new Item(first, data);
        first = currentItem;
        size++;
    }

    public void delete() {
        if (first == null) {
            throw new IllegalStateException("Список пуст");
        }
        first = first.getNext();
        size--;
    }

    public int size() {
        return size;

    }

    public T getDataAt(int pos) {
        Item currentItem = first;
        for (int i = 0; ((currentItem != null) && (i != pos)); i++) {
            currentItem = currentItem.getNext();
        }
        if (currentItem == null) {
            throw new IllegalArgumentException("Элемента на позиции " + pos + " не существует");
        }
        return currentItem.getData();
    }



    public int indexOf(T data) throws ElementNotFound {
        Item currentItem = first;
        int pos = 0;
        while ((currentItem != null) && (currentItem.getData() != data)) {
            currentItem = currentItem.getNext();
            pos++;
        }
        if (currentItem == null) {
            throw new ElementNotFound("Элемент " + data + "  в списке не найден");
        }
        return pos;
    }
}
