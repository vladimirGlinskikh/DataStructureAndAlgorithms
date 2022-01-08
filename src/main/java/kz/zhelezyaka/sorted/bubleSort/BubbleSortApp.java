package kz.zhelezyaka.sorted.bubleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBubble array = new ArrayBubble(maxSize);

        array.insert(45);
        array.insert(67);
        array.insert(12);
        array.insert(58);
        array.insert(29);
        array.insert(13);
        array.insert(56);
        array.insert(78);
        array.insert(89);
        array.insert(20);
        array.display();

        array.bubbleSort();
        array.display();
    }
}
