package kz.zhelezyaka.sorted.insertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInsert array = new ArrayInsert(maxSize);

        array.insert(98);
        array.insert(12);
        array.insert(34);
        array.insert(45);
        array.insert(56);
        array.insert(67);
        array.insert(78);
        array.insert(89);
        array.insert(90);
        array.insert(79);
        array.display();

        array.insertionSort();
        array.display();
    }
}
