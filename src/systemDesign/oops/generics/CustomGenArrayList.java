package systemDesign.oops.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private int size = 0;
    private static int DEFAULT_SIZE = 10;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public T remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T num = (T) data[index];
        for(int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return num;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set (int index, T num) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
