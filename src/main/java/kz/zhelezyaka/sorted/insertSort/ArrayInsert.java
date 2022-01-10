package kz.zhelezyaka.sorted.insertSort;

public class ArrayInsert {
    private final long[] array;
    private int nElems;

    public ArrayInsert(int max) {
        array = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void insertionSort() {
        int inner, outer;
        for (outer = 1; outer < nElems; outer++) {
            long temp = array[outer];
            inner = outer;
            while (inner > 0 && array[inner - 1] >= temp) {
                array[inner] = array[inner - 1];
                --inner;
            }
            array[inner] = temp;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(array[j] + " ");
        System.out.println();
    }
}
