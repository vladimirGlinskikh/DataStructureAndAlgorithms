package kz.zhelezyaka.sorted.bubleSort;

public class ArrayBubble {
    private final long[] array;
    private int nElems;

    public ArrayBubble(int max) {
        array = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void bubbleSort() {
        int outer, inner;
        for (outer = nElems - 1; outer > 1; outer--) {
            for (inner = 0; inner < outer; inner++) {
                if (array[inner] > array[inner + 1])
                    swap(inner, inner + 1);
            }
        }
    }

    private void swap(int one, int two) {
        long tmp = array[one];
        array[one] = array[two];
        array[two] = tmp;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(array[j] + " ");
        System.out.println();
    }
}
