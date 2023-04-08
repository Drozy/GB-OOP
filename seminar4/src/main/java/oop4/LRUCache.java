package oop4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class LRUCache<T> {
    private ArrayList<T> list;
    private Integer size;

    public LRUCache(Integer size) {
        this.size = size;
        this.list = new ArrayList<>();
    }

    public void addElement(T el) {
        if (this.list.size() >= size)
            this.list.remove(0);
        this.list.add(el);
    }

    public T getElement(int pos) {
        if (pos < size && pos > -1)
            return list.get(pos);
        else {
            System.out.println("Такой позиции нет");
            return null;
        }
    }

    public ArrayList<T> getAllElements() {
        return list;
    }
}
