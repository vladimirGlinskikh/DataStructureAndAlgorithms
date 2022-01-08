package kz.zhelezyaka.sorted.selectSort;

public class ArraySelect {
    private final long[] array;
    private int nElems;

    public ArraySelect(int max) {
        array = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void selectionSort() {
        int outer, inner, minimum;
        for (outer = 0; outer < nElems - 1; outer++) {
            minimum = outer;
            for (inner = outer + 1; inner < nElems; inner++) {
                if (array[inner] < array[minimum])
                    minimum = inner;
            }
            swap(outer, minimum);
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
