package kz.zhelezyaka.sorted.selectSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;

        ArraySelect array = new ArraySelect(maxSize);

        array.insert(34);
        array.insert(12);
        array.insert(89);
        array.insert(45);
        array.insert(37);
        array.insert(80);
        array.insert(31);
        array.insert(74);
        array.insert(71);
        array.insert(60);
        array.display();

        array.selectionSort();
        array.display();
    }
}
